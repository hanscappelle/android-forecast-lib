package be.hcpl.android.forecast.http;

public interface ResponseListener {

	public void handleResponse(HttpServiceOutput result);
	
	public void preExecution();
	
	public void postExecution();

}
