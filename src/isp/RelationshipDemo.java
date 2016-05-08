package isp;
import java.util.Scanner;

public class RelationshipDemo {
	
	public static void main(String[] args) {
		
		
		Building_installation theBuilding_installation = new Building_installation(1,1,1,1);
		Control_panel theControl = new Control_panel(true, 2, false);
		Generator theGenerator = new Generator(false, 3, true);
		Surveillance theSurveillance = new Surveillance(3, true, true, "Left wall, right wall");
		Sensor theSensor = new Sensor(true, true);
		Equipment theEquipment = new Equipment("Computers", 2, "None", false);
		
		
		Room theRoom = new Room(100, "Server room", 3, theSensor, theControl, theSurveillance, theEquipment);
		Building theBuilding = new Building (1, "IBM", 1, 2, 3, 4, "Roof", "Bucuresti", theBuilding_installation, theGenerator, theSurveillance, theRoom);
		
		
		
		
		System.out.println(theRoom.roomAttributes());
		//System.out.println(theBuilding.buildingSpecifications());
		
		
		/*
		System.out.println("Enter one of the following commands:");
		System.out.println("1 - something..");
		System.out.println("2 - something else..");
		System.out.println("3 - exit");
		Scanner scanchoice = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter \"1\", \"2\" or \"3\"");
		int choiceentry = scanchoice.nextInt();

		while (choiceentry != 3) {

		    if (choiceentry < 1 || choiceentry > 3) {

		        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
		        choiceentry = scanchoice.nextInt();

		    }

		    else if(choiceentry == 1) {
		        // ..do something
		    }
		    else if(choiceentry == 2) {
		        //..something else
		    }
		    else if(choiceentry == 3) {
		        //...exit program
		    }

		}*/
	
	}
	
}
