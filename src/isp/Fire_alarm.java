package isp;

public class Fire_alarm extends Sensor {

	public Fire_alarm(boolean functional, boolean active, String type) {
		
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
