package isp;

public class Sprinkler_system extends Sensor {

	public Sprinkler_system(boolean functional, boolean active, String type) {
		super(functional, active);
		this.type = type;
	}

	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}


}
