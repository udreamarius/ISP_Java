package isp;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SimpleTest {

	private Building building;
	private Building_installation bInst;
	private Control_panel cPanel;
	private Equipment equipment;
	private Fire_alarm fireAlarm;
	private Generator generator;
	private Sensor sensor1,sensor2;
	private Smoke_detector sDet;
	private Sprinkler_system sys;
	private Stand_pipe pipe;
	private Surveillance surv;
	private int nmbRooms;
	

@Before
public void setUp() throws Exception {
	
	bInst = new Building_installation(1,1,1,1);
	cPanel = new Control_panel(true, 2, false);
	surv = new Surveillance(3, true, true, "Left wall, right wall");
	equipment = new Equipment("Computers", 2, "None", false);
	fireAlarm = new Fire_alarm(true, true, "ionization");
	sensor1 = new Sensor(true, true);
	sensor2 = new Sensor(true, false);
	generator = new Generator(false, 3, true);
	Room[] rooms = new Room[2];
	nmbRooms = 2;
	rooms[0] = new  Room(100, "Server room", 3, sensor1, cPanel, surv, equipment);
	rooms[1] = new Room(77, "Computer Room", 4, sensor2, cPanel, surv, equipment);
	sDet = new Smoke_detector(false, true, "photoelectric");
	sys = new Sprinkler_system(false, false, "dry-pipe");
	pipe = new Stand_pipe(true, true, "wet-pipe");
	
	building = new Building(1,"IBM", 20, 7, 2, 8, "roof", "Bucuresti", bInst, generator, surv, rooms, 1);

}	
	
@After
public void tearDown() throws Exception {
	building = null;
	bInst = null;
	cPanel = null;
	equipment = null;
	fireAlarm = null;
	generator = null;
	Room[] rooms = null;
	nmbRooms = 0;
	sensor1 = null;
	sensor2 = null;
	sDet = null;
	sys = null;
	pipe = null;
	surv = null;
	
}

/* getters test for Building */
@Test
public void testGetBid(){
	int bid = building.getBid();
	assertSame(bid,1);	
}

@Test
public void testGetName(){
	String bName = building.getName();
	assertSame(bName, "IBM");	
}

@Test 
public void testGetHeight(){
	int height = building.getHeight();
	assertSame(height, 20);
}

@Test
public void testGetStoriesAbove(){
	int above = building.getStories_above_ground();
	assertSame(above, 7);
}

@Test
public void testGetStoriesBelow(){
	int below = building.getStories_below_ground();
	assertSame(below, 2);
}

@Test
public void testGetFloorHeight(){
	int floors = building.getFloor_height();
	assertSame(floors, 8);
	
}

@Test
public void testGetRoofType(){
	String roofType = building.getRoof_type();
	assertSame(roofType, "roof");

}

@Test
public void testGetAddress(){
	String address = building.getAddress();
	assertSame(address, "Bucuresti");
}

@Test
public void testGetBInst(){
	Building_installation b = building.getBuilding_installation();
	assertSame(b.getNo_of_entries(), bInst.getNo_of_entries());
	assertSame(b.getNo_of_lifts(), bInst.getNo_of_lifts());
	assertSame(b.getNo_of_stairwells(), bInst.getNo_of_stairwells());
	assertSame(b.getSmoke_proof_tower(), bInst.getSmoke_proof_tower());
	
	
}

@Test
public void testGetGenerator(){
	Generator g = building.getGenerator();
	assertSame(g.getFloor(), generator.getFloor());
	assertSame(g.isFunctional(), generator.isFunctional());
	assertSame(g.isOn(), generator.isOn());
}

@Test
public void testGetSurveillance(){
	Surveillance sur = building.getSurveillance();
	assertSame(sur.getImplementation(), surv.getImplementation());
	assertSame(sur.getNo_of_cameras(), surv.getNo_of_cameras());
	assertSame(sur.isOn(), surv.isOn());
	assertSame(sur.isFunctional(), surv.isFunctional());
	
}

@Test
public void testGetRoom(){
	Room room = building.getRoom(0);
	
	assertSame(room.getControl_panel(), cPanel);
	assertSame(room.getEquipment(), equipment);
	assertSame(room.getFloor(), 3);
	assertSame(room.getNumber(), 100);
	assertSame(room.getSensor(), sensor1);
	assertSame(room.getUsage(), "Server room");
	assertSame(room.getSurveillance(), surv);
}

/* setters test for Building */
@Test
public void testSetBid(){
	int bid = 7;
	building.setBid(bid);
	assertSame(building.getBid(),7);	
}

@Test
public void testSetName(){
	String bName = "Microsoft" ;
	building.setName(bName);
	assertSame(building.getName(), "Microsoft");	
}

@Test 
public void testSetHeight(){
	int height = 100;
	building.setHeight(height);
	assertSame(building.getHeight(), 100);
}

@Test
public void testSetStoriesAbove(){
	int above = 10;
	building.setStories_above_ground(above);
	assertSame(building.getStories_above_ground(), 10);
}

@Test
public void testSetStoriesBelow(){
	int below = 1;
	building.setStories_below_ground(below);
	assertSame(building.getStories_below_ground(), 1);
}

@Test
public void testSetFloorHeight(){
	int floors = 6;
	building.setFloor_height(floors);
	assertSame(building.getFloor_height(), 6);
	
}

@Test
public void testSetRoofType(){
	String roofType = "open";
	building.setRoof_type(roofType);
	assertSame(building.getRoof_type(), "open");

}

@Test
public void testSetAddress(){
	String address = "Paris";
	building.setAddress(address);
	assertSame(building.getAddress(), "Paris");
}

@Test
public void testSetGenerator(){
	Generator g = new Generator(true, 3, true);
	assertSame(g.getFloor(), 3);
	assertSame(g.isFunctional(), true);
	assertSame(g.isOn(), true);
}

@Test
public void testSetSurveillance(){
	Surveillance sur = new Surveillance(1, false, true, "Left wall, right wall");
	assertSame(sur.getImplementation(), "Left wall, right wall");
	assertSame(sur.getNo_of_cameras(), 1);
	assertSame(sur.isOn(), false);
	assertSame(sur.isFunctional(), true);
}

}

