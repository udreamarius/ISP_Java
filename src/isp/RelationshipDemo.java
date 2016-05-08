package isp;
import java.util.Random;
import java.util.Scanner;

public class RelationshipDemo {

	public static int fire(Room[] rooms, int nmbRooms) {
		Random rand = new Random();
		int index = rand.nextInt(nmbRooms);
		
		rooms[index].getSensor().setActive(true);
		
		return index;
	}
	
	public static int broke(Room[] rooms, int nmbRooms) {
		Random rand = new Random();
		int index = rand.nextInt(nmbRooms);
		
		rooms[index].getSensor().setFunctional(false);
		
		return index;
	}
	
	public static void displayMainMenu() {
		System.out.println("Welcome!\n");
		System.out.println("Main Menu\n");
		
		System.out.println("1. See info");
		System.out.println("2. Supervise");
		System.out.println("3. Configure");
		System.out.println("4. Exit");
		
		System.out.println("Please enter your choice: \n");
	}
	
	public static void displaySeeInfo() {
		System.out.println("\nBuilding info menu\n");
		System.out.println("1. Building attributes");
		System.out.println("2. Bulding specifications");
		System.out.println("3. See rooms info");
		System.out.println("4. See attributes for a specific room");
		System.out.println("5. Main menu");
		
		System.out.println("Please enter your choice: \n");
	}
	
	public static void displayConfigure() {
		System.out.println("Configure menu\n");
		
		System.out.println("Choose what you want to change:");
		System.out.println("1. Building name");
		System.out.println("2. Building address");
		System.out.println("3. Change room usage");
		System.out.println("4. Main menu");
		
		System.out.println("\nOption: ");
	}
	
	public static void displaySupervise() {
		System.out.println("Supervise menu\n");
		System.out.println("1. Show active sensors");
		System.out.println("2. Show broken sensors");
		System.out.println("3. Main menu");
		
		System.out.println("Please enter your choice: \n");
	}
	
	public static void main(String[] args) {
		Scanner input;
		String r;
		int ret3, ret2, ret, i, nmbRooms, index, index_broke;
		
		Building_installation theBuilding_installation = new Building_installation(1,1,1,1);
		Control_panel theControl = new Control_panel(true, 2, false);
		Generator theGenerator = new Generator(false, 3, true);
		Surveillance theSurveillance = new Surveillance(3, true, true, "Left wall, right wall");
		Sensor theSensor = new Sensor(true, true);
		Equipment theEquipment = new Equipment("Computers", 2, "None", false);
		
		Room[] rooms = new Room[4];
		nmbRooms = 4;
		rooms[0] = new Room(100, "Server room", 3, theSensor, theControl, theSurveillance, theEquipment);
		rooms[1] = new Room(100, "Server room", 3, theSensor, theControl, theSurveillance, theEquipment);
		rooms[2] = new Room(100, "Server room", 3, theSensor, theControl, theSurveillance, theEquipment);
		rooms[3] = new Room(100, "Server room", 3, theSensor, theControl, theSurveillance, theEquipment);
		
		Building theBuilding = new Building (1, "IBM", 1, 2, 3, 4, "Roof", "Bucuresti", theBuilding_installation, theGenerator, theSurveillance, rooms, nmbRooms);

		//System.out.println(theRoom.roomAttributes());
		//System.out.println(theBuilding.buildingSpecifications());
		
		
		displayMainMenu();
		input = new Scanner(System.in);  // Reading from System.in
		ret = input.nextInt();
		
		//in = new Scanner(System.in);
		
		while (ret < 4) {

			index = fire(rooms, nmbRooms);
			index_broke = broke(rooms, nmbRooms);
			
			switch ( ret ) {
			
		      case 1:
		    	  displaySeeInfo();
		    	  ret2 = input.nextInt();
		    	  System.out.println("\n");
		    	  while ( ret2 < 5 ) {
			    	  switch ( ret2 ) {
				      case 1:
				    	  System.out.println(theBuilding.buildingAttributes());
				    	  break;
				      case 2:
				    	  System.out.println(theBuilding.buildingSpecifications());
				    	  break;
				      case 3:
				    	  for (i = 0; i < nmbRooms; i++)
				    		  System.out.println(rooms[i].roomAttributes());
				        break;
				      case 4:
				    	  //i = new Scanner(System.in);
				    	  System.out.println("There are " + Integer.toString(nmbRooms) + " rooms.");
				    	  System.out.println("Choose carefully: ");
				    	  ret3 = input.nextInt();
				    	  System.out.println(rooms[ret3 - 1].roomAttributes());
				    	  break;
				      default:
				    	  break;
			    	  }
			    	  System.out.println("\n");
			    	  displaySeeInfo();
			    	  System.out.println("\nNext choice: ");
			    	  ret2 = input.nextInt();
		    	  }
		    	  break;
		    	  
		      case 2:
		    	  displaySupervise();
		    	  ret2 = input.nextInt();
		    	  while ( ret2 < 3 ) {
			    	  switch ( ret2 ) {
				      case 1:
				    	  System.out.println("In room " + Integer.toString(index + 1) + " the sensor is ACTIVE!");
				    	  System.out.println("Do you want to call 112? Y/N");
				    	  r = input.next();
				    	  if (r.equals("Y") || r.equals("y")) {
				    		  rooms[index].getSensor().call_112();
				    	  }
				    	  System.out.println("\n");
				    	  index = fire(rooms, nmbRooms);
				    	  break;
				      case 2:
				    	  System.out.println("In room " + Integer.toString(index + 1) + " the sensor is BROKEN!");
				    	  System.out.println("Do you want to call engineer? Y/N");
				    	  r = input.next();
				    	  if (r.equals("Y") || r.equals("y")) {
				    		  rooms[index].getSensor().call_engineer();
				    	  }
				    	  System.out.println("\n");
				    	  index = broke(rooms, nmbRooms);
				    	  break;
				      default:
				    	  break;
			    	  }
			    	  System.out.println("Next choice: ");
			    	  ret2 = input.nextInt();
		    	  }
		    	  break;
		    	  
		      case 3:
		    	  displayConfigure();
		    	  ret2 = input.nextInt();
		    	  while ( ret2 < 4 ) {
			    	  switch ( ret2 ) {
				      case 1:
				    	  System.out.println("Insert new name for building: \n");
				    	  r = input.next();
				    	  theBuilding.setName(r);
				    	  System.out.println("The name was changed in " + theBuilding.getName());
				    	  System.out.println("\n");
				    	  break;
				      case 2:
				    	  System.out.println("Insert new address for building: \n");
				    	  System.out.println("Str ");
				    	  r = input.next();
				    	  theBuilding.setAddress("Str " + r);
				    	  System.out.println("The address was changed in " + theBuilding.getAddress());
				    	  System.out.println("\n");
				    	  break;
				      case 3:
				    	  System.out.println("There are " + Integer.toString(nmbRooms) + " rooms.");
				    	  System.out.println("Choose carefully: ");
				    	  ret3 = input.nextInt();
				    	  System.out.println("Room " + Integer.toString(ret3) + " was selected.");
				    	  System.out.println("Insert new usage for it: ");
				    	  r = input.next();
				    	  rooms[ret3].setUsage(r + " Room");
				    	  System.out.println("The new usage for room " + Integer.toString(ret3) + " is " + rooms[ret3].getUsage());
				    	  System.out.println("\n");
				    	  break;
				      default:
				    	  break;
			    	  }
			    	  System.out.println("Next choice: ");
			    	  ret2 = input.nextInt();
		    	  }
		        break;
		        
		      default:
		        break;
		    }
			System.out.println("\n");
			rooms[index].getSensor().setActive(false);
			rooms[index_broke].getSensor().setFunctional(true);
			displayMainMenu();
			System.out.println("\nNext choice: ");
			ret = input.nextInt();
		}   
	
		
		input.close();
  	  	System.out.println("Goodbye :D!!");

	}
	
	
	
}
