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
		return this.functional;
	}
	public boolean isActive() {
		return this.active;
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
	
	public void call_112() {
		System.out.println("\nCalling 112...");
		this.active = false;
		System.out.println("Sensor is off. :D");
	}
	
	public void call_engineer() {
		System.out.println("\nCalling engineer...");
		System.out.println("Engineer: \"YEP?..\"");
		this.functional = true;
		System.out.println("Engineer: \"Sensor is now functional. ;)\"");
	}
	
}
