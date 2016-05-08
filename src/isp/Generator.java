package isp;

public class Generator {
	
	private boolean on;
	private int floor;
	private boolean functional;
	
	
	// constructor
	public Generator(boolean on, int floor, boolean functional) {
		super();
		this.on = on;
		this.floor = floor;
		this.functional = functional;
	}
	
	// getters
	public boolean isOn() {
		return on;
	}
	public int getFloor() {
		return floor;
	}
	public boolean isFunctional() {
		return functional;
	}
	/*
	 * nu stiu exact ce sa fac cu functia asta call_engineer()
	 * ma gandesc ca daca isFunctional == false
	 * atunci call_engineer() returneaza true, altfel, returneaza false
	 * voi ce credeti?
	 * 
	 * 
	 * public boolean call_engineer() {
		return false;
	}
	*/
	
	
	// setters
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void setFunctional(boolean functional) {
		this.functional = functional;
	}

	
	// toString
	@Override
	public String toString() {
		return "\n\nGenerator: \nOn = " + on + "\nFloor = " + floor + "\nFunctional = " + functional;
	}

}
