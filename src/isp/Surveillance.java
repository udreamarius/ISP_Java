package isp;

public class Surveillance {
	
	private int no_of_cameras;
	private boolean on;
	private boolean functional;
	private String implementation;
	
	// constructor
	public Surveillance(int no_of_cameras, boolean on, boolean functional, String implementation) {
		super();
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
		return this.on;
	}
	public boolean isFunctional() {
		return this.functional;
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
		return "\n\nSurveillance: \nNo_of_cameras = " + no_of_cameras + "\nOn = " + on + "\nFunctional = " + functional
				+ "\nImplementation = " + implementation;
	}
	
	
	
}
