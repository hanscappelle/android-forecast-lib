package be.hcpl.android.forecast.http;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;
import be.hcpl.android.forecast.ForecastCallBuilder;
import be.hcpl.android.forecast.model.ForecastResponse;

import com.google.gson.Gson;

/**
 * services execution in background, requires url and output type
 * 
 * @author hcpl
 * 
 */
public class HttpServiceTask extends
		AsyncTask<ForecastCallBuilder, Void, HttpServiceOutput> {

	/**
	 * used encoding
	 */
	private static final String UTF_8 = "UTF-8";

	/**
	 * a http client instance
	 */
	private final HttpClient client = new DefaultHttpClient();

	/**
	 * the listener to react on response and other events
	 */
	private final ResponseListener listener;

	/**
	 * the url to be called
	 */
	private String serviceUrl = null;

	/**
	 * Constructor
	 * 
	 * @param listener
	 */
	public HttpServiceTask(final ResponseListener listener) {
		this.listener = listener;
		// serviceUrl = callBuilder.getUrl();
	}

	@Override
	protected void onPreExecute() {
		listener.preExecution();
	}

	@Override
	protected HttpServiceOutput doInBackground(
			final ForecastCallBuilder... params) {

		// prepare input
		// only single item for now?
		if (params.length != 1)
			throw new RuntimeException(
					"only single callBuilder accepted for now");

		serviceUrl = params[0].getUrl();

		// prepare output
		final HttpServiceOutput output = new HttpServiceOutput();
		Gson gson = new Gson();

		// start service execution
		String responseString = null;
		try {

			// create url for sequenceNo
			URL url = new URL(serviceUrl);
			responseString = performGet(url, output);

			// parse json response into object
			ForecastResponse forecastResponse = gson.fromJson(responseString,
					ForecastResponse.class);

			output.setForecastResponse(forecastResponse);

			// react on different statuscode here
			if (output.getStatusCode() != 200) {
				throw new Exception(String.format(
						"Unexpected response from server, code %d",
						output.getStatusCode()));
			}

		} catch (final Exception e) {
			// update the exceptions info when exception occured
			output.setException(e);
		}
		return output;
	}

	private String performGet(final URL url, final HttpServiceOutput output)
			throws IOException {

		String responseString = "";

		// get adapted to default httpclient (instead of okhttp code)
		HttpGet get = new HttpGet(URI.create(url.toString()));
		HttpResponse response = client.execute(get);

		// check and set status line from response
		output.setStatusCode(response.getStatusLine().getStatusCode());

		// get response content
		HttpEntity responseEntity = response.getEntity();
		if (responseEntity != null) {
			responseString = EntityUtils.toString(responseEntity, UTF_8);
		}
		responseEntity.consumeContent();

		return responseString;
	}

	@Override
	protected void onPostExecute(final HttpServiceOutput result) {
		listener.handleResponse(result);
		listener.postExecution();
	}
}
