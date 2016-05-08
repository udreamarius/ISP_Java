package isp;

public class Stand_pipe extends Sensor {

	public Stand_pipe(boolean functional, boolean active, String type) {
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
