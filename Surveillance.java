package isp;

public class Surveillance {
	
	private int no_of_cameras;
	private boolean on;
	private boolean functional;
	private String implementation;
	
	// constructor
	public Surveillance(int no_of_cameras, boolean on, boolean functional, String implementation) {
		this.no_of_cameras = no_of_cameras;
		this.on = on;
		this.functional = functional;
		this.implementation = implementation;
	}

	// getters
	public int getNo_of_cameras() {
		return no_of_cameras;
	}
	public boolean isOn() {
		return false;
	}
	public boolean isFunctional() {
		return false;
	}
	public String getImplementation() {
		return implementation;
	}
	
	// setters
	public void setNo_of_cameras(int no_of_cameras) {
		this.no_of_cameras = no_of_cameras;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setFunctional(boolean functional) {
		this.functional = functional;
	}
	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}

	
	// toString
	@Override
	public String toString() {
		return "Surveillance [no_of_cameras=" + no_of_cameras + ", on=" + on + ", functional=" + functional
				+ ", implementation=" + implementation + "]";
	}
	
	
	
}
