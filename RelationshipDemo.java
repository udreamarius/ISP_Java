package isp;

public class RelationshipDemo {
	
	public static void main(String[] args) {
	
		Building_installation theBuilding_installation = new Building_installation(1,1,1,1);
		Control_panel theControl = new Control_panel(true, 2, false);
		Building theBuilding = new Building (1, "IBM", 1, 2, 3, 4, "Roof", "Bucuresti", theBuilding_installation, theControl);
		
		System.out.println(theBuilding.toString());
	
	}
	
}
