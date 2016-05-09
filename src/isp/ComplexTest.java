package isp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
	
	public static int random() {
		Random rand = new Random();
		int nr = rand.nextInt(10);
		
		return nr;
	}
	
	public static int randRoom(int nmbRoom) {
		Random rand = new Random();
		int nr = rand.nextInt(nmbRoom);
		
		return nr;
	}
	
	Building building;
	Building_installation building_installation;
	Building_installation newBuildingInstallation;
	Control_panel control_panel;
	Control_panel control_panel2;
	Control_panel control_panel3;
	Generator generator;
	Surveillance surveillance;
	Sensor sensor1;
	Sensor sensor2;
	Sensor sensor3;
	Equipment equipment;
	int nmbRooms;
	int nmbNewRooms;

    @Before
    public void setUp() throws Exception {
	building_installation = new Building_installation(1, 2, 3, 4);
	newBuildingInstallation = new Building_installation(5, 6, 7, 8);
	control_panel = new Control_panel(true, 2, true);
	control_panel2 = new Control_panel(false, 0, false);
	control_panel3 = new Control_panel(true, 1, false);
    generator = new Generator(false, 3, true);
	surveillance = new Surveillance(3, true, true, "Left wall, right wall");
	sensor1 = new Sensor(true, false);
	sensor2 = new Sensor(true, false);
	sensor3 = new Sensor(true, false);
	equipment = new Equipment("Computers", 2, "None", false);
	
	Room[] rooms = new Room[2];
	nmbRooms = 2;
	rooms[0] = new Room(100, "Server room", 3, sensor1, control_panel, surveillance, equipment);
	rooms[1] = new Room(101, "Spa room", 3, sensor2, control_panel2, surveillance, equipment);
		
	building = new Building(1, "IBM", 1, 2, 3, 4, "Roof", "Bucuresti", building_installation, generator, surveillance, rooms, nmbRooms);
    }
	  
    @After
    public void tearDown() throws Exception {
    	building_installation = null;
    	control_panel = null;
    	control_panel2 = null;
    	control_panel3 = null;
        generator = null;
    	surveillance = null;
    	sensor1 = null;
    	sensor2 = null;
    	sensor3 = null;
    	equipment = null;
    	Room[] rooms = null;
    	building = null;
    	newBuildingInstallation = null;
    	nmbNewRooms = 0;
    	nmbRooms = 0;
    }
	
    
    //Marius Udrea
    @Test
    public void testGetBuildingSpecifications() {
    	int i;
    	boolean withSpecifications = true;
    	int generatorLocation = 0;
    	Building myBuilding = null;
    	Building_installation myBuildingInstallation = null;
    	Generator myGenerator = null;
    	int myNmbRooms = 0;
    	ArrayList<Room> list = new ArrayList<Room>();
    	
    	//Step 1 - Get Building Attributes
    	myBuilding = building;
    	
    	//Step 2 - Get Building Installation
 		myBuildingInstallation = myBuilding.getBuilding_installation();
		
		//Step 3 - Modified - Get Generator location
		generatorLocation = myBuilding.getGenerator().getFloor();
				
		//Step 4 - Show specifications if asked
		if (withSpecifications)
			myGenerator = myBuilding.getGenerator();
		
		if (withSpecifications)
			assertFalse("Nu s-au luat specificatiile generatorului!", myGenerator == null);
		else
			assertTrue("Parametrii generatorului nu trebuiau luat!", myGenerator == null);
		
		//Step 5 - Get Rooms Number
		myNmbRooms = myBuilding.getNmbRooms();
				
		//Step 6 - Get Rooms
		for (i = 0; i < myNmbRooms; i++)
			list.add(myBuilding.getRoom(i));
		
		
		if (withSpecifications)
			for (i = 0; i < myNmbRooms; i++)
				assertEquals(list.get(i), building.getRoom(i));
		
		assertTrue(myBuildingInstallation != null);
		assertTrue(generatorLocation != 0);
		assertTrue(myNmbRooms != 0);
		assertEquals(myNmbRooms, nmbRooms);
    }
    
    //Lorena Cojoc
    @Test
    public void testRooms() {
    	
    	int nr = random();
    	boolean getSensor = true;
    	boolean getEquipment = true;
    	boolean getSurveillance = true;
    	
    	for (int i = 0; i < nr; i++) {
    		int index = randRoom(nmbRooms);
    		Room ro = building.getRoom(index);
    		Sensor so = null;
    		Equipment eq = null;
    		Surveillance surv = null;
    		
    		if (getSensor)
    			so = ro.getSensor();
    		
    		if (getEquipment)
    			eq = ro.getEquipment();
    		
    		if (getSurveillance)
    			surv = ro.getSurveillance();
    		
    		if (getSensor) {
    			assertFalse(so == null);
    			assertEquals(building.getRoom(index).getSensor(), so);
    		}
    		
    		if (getEquipment) {
    			assertFalse(eq == null);
   			 	assertEquals(building.getRoom(index).getEquipment(), eq);
    		}
    		
    		if (getSurveillance) {
    			assertFalse(surv == null);
   			 	assertEquals(building.getRoom(index).getSurveillance(), surv);
    		}
    	}
	   
    }
    
    
    //Andreea Dincu
    @Test
    public void getRoomActive() {
    	int i = -1;
    	boolean calling;
    	int index = randRoom(nmbRooms);
    	Room r = null;
    	
    	building.getRoom(index).getSensor().setActive(true);
		
    	Room ra = building.getRoom(index);
    	ra.getSensor().setActive(true);
    	
    	Room rb = building.getRoom(index);
    	rb.getSensor().setFunctional(false);
		
    	while (i < nmbRooms && r == null) {
    		i++;
			if (building.getRoom(i).getSensor().isActive())
				r = building.getRoom(i);
			
    	}

		assertEquals(i, index);
		
		if (ra.getSensor().isActive())
			calling = true;
		else
			calling = false;
		
		assertTrue("Room ra had sensor active! - we should have called 112", calling);
		
		if (rb.getSensor().isFunctional() == false)
			calling = true;
		else
			calling = false;
		
		assertTrue("Room rb had sensor broken! - we should have called engineer", calling);
    }
    
}

