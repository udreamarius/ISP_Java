package isp;

public class Sensor {
	

	private boolean functional;
	private boolean active;
	
	
	public Sensor(boolean functional, boolean active) {
		super();
		this.functional = functional;
		this.active = active;
	}
	
	
	//getterse
	public boolean isFunctional() {
		return functional;
	}
	public boolean isActive() {
		return active;
	}
	
	
	//setters
	public void setFunctional(boolean functional) {
		this.functional = functional;
	}
	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "\n\nSensor: \nFunctional = " + functional + "\nActive = " + active;
	}
	
	
	
}
