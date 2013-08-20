package be.hcpl.android.forecast;

/**
 * possible unit values
 * 
 * @author hcpl
 * 
 */
public enum Units {

	US("us"), SI("si"), CA("ca"), UK("uk"), AUTO("auto");

	private String label = "auto";

	private Units(String label) {
		this.label = label;
	}

	/**
	 * get label for enum
	 * 
	 * @return
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * get the enum value based on a label, will return null if not found
	 * 
	 * @param label
	 * @return
	 */
	public Units fromLabel(String label) {
		for (Units u : Units.values()) {
			if (u.getLabel().equals(label))
				return u;
		}
		// otherwise not found, return null;
		return null;
	}

	// check options at https://developer.forecast.io/docs/v2

	// units=[setting]: Return the API response in units other than the default
	// Imperial units. In particular, the following settings are possible:
	// us: The default, as outlined above.
	// si: Returns results in SI units. In particular, properties now have the
	// following units:
	// summary: Any summaries containing temperature or snow accumulation units
	// will have their values in degrees Celsius or in centimeters
	// (respectively).
	// precipIntensity: Millimeters per hour.
	// precipAccumulation: Centimeters.
	// temperature: Degrees Celsius.
	// apparentTemperature: Degrees Celsius.
	// dewPoint: Degrees Celsius.
	// windSpeed: Meters per second.
	// pressure: Hectopascals (which are, conveniently, equivalent to the
	// default millibars).
	// visibility: Kilometers.
	// ca: Identical to si, except that windSpeed is in kilometers per hour.
	// uk: Identical to si, except that windSpeed is in miles per hour, as in
	// the US. (This option is provided because adoption of SI in the UK has
	// been inconsistent.)
	// auto: Selects the relevant units automatically, based on geographic
	// location.

}
