package isp;

public class Building {


	private int bid;
	private String name;
	private int height;
	private int stories_above_ground;
	private int stories_below_ground;
	private int floor_height;
	private String roof_type;
	private String address;

	private Building_installation building_installation;
	private Generator generator;
	private Surveillance surveillance;
	private Room[] rooms;
	private int nmbRooms;
	
	
	// constructor
	public Building(int bid, String name, int height, int stories_above_ground, int stories_below_ground,
			int floor_height, String roof_type, String address, Building_installation building_installation, 
			Generator generator, Surveillance surveillance, Room[] rooms, int nmbRooms) {
		super();
		this.bid = bid;
		this.name = name;
		this.height = height;
		this.stories_above_ground = stories_above_ground;
		this.stories_below_ground = stories_below_ground;
		this.floor_height = floor_height;
		this.roof_type = roof_type;
		this.address = address;
		this.building_installation = building_installation;
		this.generator = generator;
		this.surveillance = surveillance;
		this.rooms = rooms;
		this.nmbRooms = nmbRooms;
	}
	
	// getters
	public int getBid() {
		return bid;
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public int getStories_above_ground() {
		return stories_above_ground;
	}
	public int getStories_below_ground() {
		return stories_below_ground;
	}
	public int getFloor_height() {
		return floor_height;
	}
	public String getRoof_type() {
		return roof_type;
	}
	public String getAddress() {
		return address;
	}
	public Building_installation getBuilding_installation() {
		return building_installation;
	}


	public Generator getGenerator() {
		return generator;
	}
	public Surveillance getSurveillance() {
		return surveillance;
	}
	public Room getRoom(int index) {
		return rooms[index];
	}
	
	// setters
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setStories_above_ground(int stories_above_ground) {
		this.stories_above_ground = stories_above_ground;
	}
	public void setStories_below_ground(int stories_below_ground) {
		this.stories_below_ground = stories_below_ground;
	}
	public void setFloor_height(int floor_height) {
		this.floor_height = floor_height;
	}
	public void setRoof_type(String roof_type) {
		this.roof_type = roof_type;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBuilding_installation(Building_installation building_installation) {
		this.building_installation = building_installation;
	}
	public void setGenerator(Generator generator) {
		this.generator = generator;
	}
	public void setSurveillance(Surveillance surveillance) {
		this.surveillance = surveillance;
	}
	public void setRooms(Room[] rooms, int nmbRooms) {
		this.rooms = rooms;
		this.nmbRooms = nmbRooms;
	}

	
	
	
	
	// toString

	public String buildingSpecifications() {
		int i;
		String rroom = "";
		
		for (i = 0; i < this.nmbRooms; i++)
			rroom = rroom + Integer.toString(i)+ ") " + rooms[i].roomSpecifications() + "\n";
		
		return "Building Specifications: \nBID = " + bid + "\nName = " + name + "\nHeight = " + height + "\nStories_above_ground = "
				+ stories_above_ground + "\nStories_below_ground = " + stories_below_ground + "\nFloor_height = "
				+ floor_height + "\nRoof_type = " + roof_type + "\nAddress = " + address + building_installation + generator + surveillance + rroom;
	}
	
	public String buildingAttributes() {
		return "Building Attributes: \nBID = " + bid + "\nName = " + name + "\nHeight = " + height + "\nStories_above_ground = "
				+ stories_above_ground + "\nStories_below_ground = " + stories_below_ground + "\nFloor_height = "
				+ floor_height + "\nRoof_type = " + roof_type + "\nAddress = " + address;
	}


}
