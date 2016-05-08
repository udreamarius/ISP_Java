package isp;

public class RelationshipDemo {
	
	public static void main(String[] args) {
	
		Building_installation theBuilding_installation = new Building_installation(1,1,1,1);
		Building theBuilding = new Building (1, "IBM", 1, 2, 3, 4, "Roof", "Bucuresti", theBuilding_installation);
		
		System.out.println(theBuilding);
	
	}
	
}
