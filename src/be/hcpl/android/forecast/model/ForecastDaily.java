package be.hcpl.android.forecast.model;

public class ForecastDaily {

	private String summary;
	private String icon;
	private DailyWeatherData[] data;

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

	public DailyWeatherData[] getData() {
		return data;
	}

	public void setData(DailyWeatherData[] data) {
		this.data = data;
	}

}
