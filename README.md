android-forecast-lib
====================

A basic Android library for simple forecast.io weather API calls.

## How it works (briefly)

Create an URL with the ForecastCallBuilder providing your API Key, latitude and longitude. Performs the HTTP GET in the background and returns the JSON result parsed with GSON using a ResponseListener. 

## Usage example

Clone Android eclipse (ADT) project into workspace and add this as a library to your project.

Execute a call like this:

		double latitude = 37.8267;
		double longitude = -122.423;
    
		ForecastCallBuilder builder = ForecastCallBuilder.getInstance();
		builder.key("YOUR_API_KEY_HERE").latitude(latitude)
				.longitude(longitude).units(Units.AUTO);
		ResponseListener listener = new ResponseListener() {

			@Override
			public void handleResponse(HttpServiceOutput result) {
			  	if( result == null || result.getException() != null ){
			  		Toast.makeText(getApplicationContext(), "Failed to fetch data!", Toast.LENGTH_SHORT).show();
			  	}
			  	else {
			  		// you should also check for nullpointers on the forecast data before display
					Toast.makeText(getApplicationContext(), "Summary: " + result.getForecastResponse().getCurrently()
								.getSummary(), Toast.LENGTH_LONG).show();
				}
			}

			@Override
			public void preExecution() {
				Toast.makeText(getApplicationContext(), "Fetching forecast data now...", Toast.LENGTH_SHORT).show();
			}

			@Override
			public void postExecution() {
				// here you cold inform about call being done
			}

		};
		builder.performCall(listener);


## Resources

For all forecast specific details visit [the forecast developer docs](https://developer.forecast.io/docs/v2).

Gson library info available at [the Google GSON project page](https://code.google.com/p/google-gson/).
