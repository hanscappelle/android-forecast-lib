package be.hcpl.android.forecast.model;

public class ForecastHourly {

	private String summary;
	private String icon;
	private WeatherData[] data;

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

	public WeatherData[] getData() {
		return data;
	}

	public void setData(WeatherData[] data) {
		this.data = data;
	}

}
