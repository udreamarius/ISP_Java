package isp;

public class Control_panel {

	private boolean on;
	private int floor;
	private boolean functional;
	
	// constructor
	public Control_panel(boolean on, int floor, boolean functional) {
		this.on = on;
		this.floor = floor;
		this.functional = functional;
	}
	
	
	// getters
	public boolean isOn() {
		return false;
	}
	public int getFloor() {
		return floor;
	}
	public boolean isFunctional() {
		return false;
	}
	/*
	 * nu stiu exact ce sa fac cu functia asta
	 * am adaugat-o aici in caz ca ii gasiti o intrebuintare
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
		return "Control_panel [on=" + on + ", floor=" + floor + ", functional=" + functional + "]";
	}
}
