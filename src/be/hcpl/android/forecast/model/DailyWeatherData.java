package be.hcpl.android.forecast.model;

public class DailyWeatherData extends WeatherData {

	private float precipIntensityMax;

	private long sunriseTime;
	private long sunsetTime;

	private float temperatureMin;
	private long temperatureMinTime;
	private float temperatureMax;
	private long temperatureMaxTime;
	private float apparentTemperatureMin;
	private long apparentTemperatureMinTime;
	private float apparentTemperatureMax;
	private long apparentTemperatureMaxTime;

	public float getPrecipIntensityMax() {
		return precipIntensityMax;
	}

	public void setPrecipIntensityMax(float precipIntensityMax) {
		this.precipIntensityMax = precipIntensityMax;
	}

	public long getSunriseTime() {
		return sunriseTime;
	}

	public void setSunriseTime(long sunriseTime) {
		this.sunriseTime = sunriseTime;
	}

	public long getSunsetTime() {
		return sunsetTime;
	}

	public void setSunsetTime(long sunsetTime) {
		this.sunsetTime = sunsetTime;
	}

	public float getTemperatureMin() {
		return temperatureMin;
	}

	public void setTemperatureMin(float temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	public long getTemperatureMinTime() {
		return temperatureMinTime;
	}

	public void setTemperatureMinTime(long temperatureMinTime) {
		this.temperatureMinTime = temperatureMinTime;
	}

	public float getTemperatureMax() {
		return temperatureMax;
	}

	public void setTemperatureMax(float temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	public long getTemperatureMaxTime() {
		return temperatureMaxTime;
	}

	public void setTemperatureMaxTime(long temperatureMaxTime) {
		this.temperatureMaxTime = temperatureMaxTime;
	}

	public float getApparentTemperatureMin() {
		return apparentTemperatureMin;
	}

	public void setApparentTemperatureMin(float apparentTemperatureMin) {
		this.apparentTemperatureMin = apparentTemperatureMin;
	}

	public long getApparentTemperatureMinTime() {
		return apparentTemperatureMinTime;
	}

	public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
		this.apparentTemperatureMinTime = apparentTemperatureMinTime;
	}

	public float getApparentTemperatureMax() {
		return apparentTemperatureMax;
	}

	public void setApparentTemperatureMax(float apparentTemperatureMax) {
		this.apparentTemperatureMax = apparentTemperatureMax;
	}

	public long getApparentTemperatureMaxTime() {
		return apparentTemperatureMaxTime;
	}

	public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
		this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
	}

}
