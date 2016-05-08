package isp;

public class Equipment {

	private String name;
	private int id;
	private String specialBehavior;
	private boolean activeSpecialBehavior;
	
	
	public Equipment(String name, int id, String specialBehavior, boolean activeSpecialBehavior) {
		super();
		this.name = name;
		this.id = id;
		this.specialBehavior = specialBehavior;
		this.activeSpecialBehavior = activeSpecialBehavior;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getSpecialBehavior() {
		return specialBehavior;
	}
	public boolean isActiveSpecialBehavior() {
		return activeSpecialBehavior;
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSpecialBehavior(String specialBehavior) {
		this.specialBehavior = specialBehavior;
	}
	public void setActiveSpecialBehavior(boolean activeSpecialBehavior) {
		this.activeSpecialBehavior = activeSpecialBehavior;
	}



	
	//toString
	@Override
	public String toString() {
		return "Equipment: \nName = " + name + "\nID = " + id + "\nSpecialBehavior = " + specialBehavior
				+ "\nActiveSpecialBehavior = " + activeSpecialBehavior;
	}
	
	
	
	

}
