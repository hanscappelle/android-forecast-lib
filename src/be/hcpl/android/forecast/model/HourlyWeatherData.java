package be.hcpl.android.forecast.model;

public class HourlyWeatherData extends WeatherData {

	private float temperature;
	private float apparentTemperature;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getApparentTemperature() {
		return apparentTemperature;
	}

	public void setApparentTemperature(float apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

}
