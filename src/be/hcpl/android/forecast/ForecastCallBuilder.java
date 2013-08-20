package be.hcpl.android.forecast;

import be.hcpl.android.forecast.http.HttpServiceTask;
import be.hcpl.android.forecast.http.ResponseListener;

/**
 * use this to get a forecast call prepared with all your params and execute
 * with {@link ForecastCallBuilder#performCall(ResponseListener)}.
 * 
 * @author hcpl
 * 
 */
public class ForecastCallBuilder {

	private String apiKey = null;

	private String baseUrl = "https://api.forecast.io/forecast/";

	private Double longitude = null, latitude = null;

	private String units = Units.AUTO.getLabel();

	private static ForecastCallBuilder instance;

	private ForecastCallBuilder() {
	}

	public static ForecastCallBuilder getInstance() {
		if (instance == null)
			instance = new ForecastCallBuilder();
		return instance;
	}

	public ForecastCallBuilder key(String key) {
		apiKey = key;
		return instance;
	}

	public ForecastCallBuilder longitude(double l) {
		longitude = l;
		return instance;
	}

	public ForecastCallBuilder latitude(double l) {
		latitude = l;
		return instance;
	}

	public ForecastCallBuilder units(Units u) {
		units = u.getLabel();
		return instance;
	}

	/**
	 * get url based on given params
	 * 
	 * https://api.forecast.io/forecast/API_KEY/LATITUDE,LONGITUDE?units=auto
	 * 
	 * @return
	 */
	public String getUrl() {
		// with validation
		if (apiKey == null || longitude == null || latitude == null)
			throw new RuntimeException(
					"URl requested while API key, longitude or latitude is not provided");
		return new StringBuilder(baseUrl).append(apiKey).append("/")
				.append(latitude).append(",").append(longitude)
				.append("?units=").append(units).toString();
	}

	public void performCall(ResponseListener listener) {
		HttpServiceTask task = new HttpServiceTask(listener);
		task.execute(instance);
		// return instance;
	}

}
