package be.hcpl.android.forecast.model;

public class WeatherData {

	private long time;
	private String summary;
	private String icon;
	private float precipIntensity;
	private float precipProbability;

	private float dewPoint;
	private float windSpeed;
	private int windBearing;
	private float cloudCover;
	private float humidity;
	private float pressure;
	private float visibility;
	private float ozone;

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public float getPrecipIntensity() {
		return precipIntensity;
	}

	public void setPrecipIntensity(float precipIntensity) {
		this.precipIntensity = precipIntensity;
	}

	public float getPrecipProbability() {
		return precipProbability;
	}

	public void setPrecipProbability(float precipProbability) {
		this.precipProbability = precipProbability;
	}

	public float getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(float dewPoint) {
		this.dewPoint = dewPoint;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public int getWindBearing() {
		return windBearing;
	}

	public void setWindBearing(int windBearing) {
		this.windBearing = windBearing;
	}

	public float getCloudCover() {
		return cloudCover;
	}

	public void setCloudCover(float cloudCover) {
		this.cloudCover = cloudCover;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getVisibility() {
		return visibility;
	}

	public void setVisibility(float visibility) {
		this.visibility = visibility;
	}

	public float getOzone() {
		return ozone;
	}

	public void setOzone(float ozone) {
		this.ozone = ozone;
	}

}
