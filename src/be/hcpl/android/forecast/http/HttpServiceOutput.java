package be.hcpl.android.forecast.http;

import be.hcpl.android.forecast.model.ForecastResponse;

/**
 * http service output containing the api call result and meta data
 * 
 * @author hcpl
 * 
 */
public class HttpServiceOutput {

	/**
	 * the http status code
	 */
	private int statusCode;

	/**
	 * exceptions that might have occured during execution of service
	 */
	private Exception exception;

	/**
	 * the parsed json data here
	 */
	private ForecastResponse forecastResponse;

	/**
	 * def ctor
	 */
	public HttpServiceOutput() {
	
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(final int statusCode) {
		this.statusCode = statusCode;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public ForecastResponse getForecastResponse() {
		return forecastResponse;
	}

	public void setForecastResponse(ForecastResponse output) {
		this.forecastResponse = output;
	}
	
	

}
