package isp;

public class Smoke_detector extends Sensor {

	public Smoke_detector(boolean functional, boolean active, String type) {
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
