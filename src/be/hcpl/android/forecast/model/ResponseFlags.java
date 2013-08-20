package be.hcpl.android.forecast.model;

public class ResponseFlags {
	
	private String[] flags;

	// can't parse the isd stations
	//private String[] isd-stations;

	// can't pars the metno-license
	//private String metno-license;
	//"Based on data from the Norwegian Meteorological Institute. (http://api.met.no/)",

	// can't parse metar-stations
	//private String [] metar-stations;

	private String units;

	public String[] getFlags() {
		return flags;
	}

	public void setFlags(String[] flags) {
		this.flags = flags;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}
	
	

}
