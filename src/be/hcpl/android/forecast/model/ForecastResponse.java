package be.hcpl.android.forecast.model;

public class ForecastResponse {

	private double latitude;
	private double longitude;
	private String timezone;
	private int offset;
	private HourlyWeatherData currently;

	private ForecastHourly hourly;

	private ForecastDaily daily;

	private ResponseFlags flags;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public HourlyWeatherData getCurrently() {
		return currently;
	}

	public void setCurrently(HourlyWeatherData currently) {
		this.currently = currently;
	}

	public ForecastHourly getHourly() {
		return hourly;
	}

	public void setHourly(ForecastHourly hourly) {
		this.hourly = hourly;
	}

	public ForecastDaily getDaily() {
		return daily;
	}

	public void setDaily(ForecastDaily daily) {
		this.daily = daily;
	}

	public ResponseFlags getFlags() {
		return flags;
	}

	public void setFlags(ResponseFlags flags) {
		this.flags = flags;
	}

}