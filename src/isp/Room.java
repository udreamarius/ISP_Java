package isp;

public class Room {
	
	private int number;
	private String usage;
	private int floor;
	
	private Sensor sensor;
	private Control_panel control_panel;
	private Surveillance surveillance;
	private Equipment equipment;
	
	
	
	

	//constructor
	public Room(int number, String usage, int floor, Sensor sensor, Control_panel control_panel,
			Surveillance surveillance, Equipment equipment) {
		super();
		this.number = number;
		this.usage = usage;
		this.floor = floor;
		this.sensor = sensor;
		this.control_panel = control_panel;
		this.surveillance = surveillance;
		this.equipment = equipment;
	}

	
	// getters
	public int getNumber() {
		return number;
	}
	public String getUsage() {
		return usage;
	}
	public int getFloor() {
		return floor;
	}
	public Sensor getSensor() {
		return sensor;
	}
	public Control_panel getControl_panel() {
		return control_panel;
	}
	public Surveillance getSurveillance() {
		return surveillance;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	
	
	// setters
	public void setNumber(int number) {
		this.number = number;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	public void setControl_panel(Control_panel control_panel) {
		this.control_panel = control_panel;
	}
	public void setSurveillance(Surveillance surveillance) {
		this.surveillance = surveillance;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	
	// toString

	public String roomSpecifications() {
		return "Room specifications: \nNumber = " + number + "\nUsage = " + usage + "\nFloor = " + floor + sensor
				+ control_panel + surveillance + equipment;
	}
	public String roomAttributes() {
		return "Room attributes: \nNumber = " + number + "\nUsage = " + usage + "\nFloor = " + floor;
	}

}
