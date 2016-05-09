package isp;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitComp {
	
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
	sensor1 = new Sensor(true, true);
	sensor2 = new Sensor(false, true);
	sensor3 = new Sensor(false, false);
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
    	building = null;
    	newBuildingInstallation = null;
    	nmbNewRooms = 0;
    	nmbRooms = 0;
    }
	
    
    
    @Test
    public void testBuildingInstallationConst() {
    	//Tests getter for Building_insallation class +
    	//		getters for Building class related to building_installation
    	
	    assertEquals(building.getBuilding_installation().getNo_of_lifts(), 1);
		assertEquals(building.getBuilding_installation().getNo_of_entries(), 4);
		assertEquals(building.getBuilding_installation().getSmoke_proof_tower(), 3);
		assertEquals(building.getBuilding_installation().getNo_of_stairwells(), 2);
    }

    @Test
    public void testSetBuilding_installation() {
    	//Tests setters for Building_insallation class +
    	//		setters for Building class related to building_installation +
    	//		getters for Building class related to building_installation
    	
		building.setBuilding_installation(building_installation);
		assertEquals(building.getBuilding_installation().getNo_of_lifts(), building_installation.getNo_of_lifts());
		assertEquals(building.getBuilding_installation().getNo_of_entries(), building_installation.getNo_of_entries());
		assertEquals(building.getBuilding_installation().getSmoke_proof_tower(), building_installation.getSmoke_proof_tower());
		assertEquals(building.getBuilding_installation().getNo_of_stairwells(), building_installation.getNo_of_stairwells());
    }
    
    @Test
    public void testRooms() {
    	//Tests getters for Room class +
    	//		getters for Building class related to rooms
    	
	    assertEquals(building.getNmbRooms(), nmbRooms);
    	
	    assertEquals(building.getRoom(0).getNumber(), 100);
	    assertEquals(building.getRoom(0).getUsage(), "Server room");
	    assertEquals(building.getRoom(0).getFloor(), 3);
	    assertEquals(building.getRoom(0).getSensor(), sensor1);
	    assertEquals(building.getRoom(0).getControl_panel(), control_panel);
	    assertEquals(building.getRoom(0).getSurveillance(), surveillance);
	    assertEquals(building.getRoom(0).getEquipment(), equipment);
	    
	    assertEquals(building.getRoom(1).getNumber(), 101);
	    assertEquals(building.getRoom(1).getUsage(), "Spa room");
	    assertEquals(building.getRoom(1).getFloor(), 3);
	    assertEquals(building.getRoom(1).getSensor(), sensor2);
	    assertEquals(building.getRoom(1).getControl_panel(), control_panel2);
	    assertEquals(building.getRoom(1).getSurveillance(), surveillance);
	    assertEquals(building.getRoom(1).getEquipment(), equipment);	
    } 
    
    @Test
    public void testSensors() {
    	//Tests getters for Sensor class +
    	//		getters for Room class related to sensors +
    	//		getters for Building class related to rooms
    	
	    assertEquals(building.getRoom(0).getSensor().isFunctional(), true);
	    assertEquals(building.getRoom(0).getSensor().isActive(), true);
	 
	    assertEquals(building.getRoom(1).getSensor().isFunctional(), false);
	    assertEquals(building.getRoom(1).getSensor().isActive(), true);
    }
	      
    @Test
    public void testSetBuildingInstallation() {
    	//Tests setter for Building_installation class +
    	//		getters for Building class related to building_installation
    	
        building.setBuilding_installation(newBuildingInstallation);
	    
	    assertEquals(building.getBuilding_installation().getNo_of_lifts(), 5);
	    assertEquals(building.getBuilding_installation().getNo_of_stairwells(), 6);
		assertEquals(building.getBuilding_installation().getSmoke_proof_tower(), 7);
		assertEquals(building.getBuilding_installation().getNo_of_entries(), 8);
    }
    
    public void testSetSensors() {
    	//Tests setters for Sensor class +
    	//		setters for Room class related to sensors +
    	//		setters for Building class related to rooms +
    	//		getters for Sensor class +
    	//		getters for Room class related to sensors
    	//		getters for Building class related rooms
    	
    	building.getRoom(0).setSensor(new Sensor(true, false));
    	building.getRoom(1).setSensor(new Sensor(true, true));
        
    	assertEquals(building.getRoom(0).getSensor().isFunctional(), true);
	    assertEquals(building.getRoom(0).getSensor().isActive(), false);
	 
	    assertEquals(building.getRoom(1).getSensor().isFunctional(), true);
	    assertEquals(building.getRoom(1).getSensor().isActive(), true);
    }
    
    @Test
    public void testSetRooms() {
    	//Tests setters for Room class +
    	//		setters for Building class related to rooms +
    	//		getters for Room class +
    	//		getters for Building class related rooms
    	
       building.setRooms(new Room[]{new Room(200, "Server room", 2, sensor1, control_panel, surveillance, equipment), 
        							new Room(178, "Gamming room", 3, sensor2, control_panel2, surveillance, equipment), 
        							new Room(473, "HR room", 1, sensor3, control_panel3, surveillance, equipment)}, nmbNewRooms);
	    
        
        assertEquals(building.getNmbRooms(), nmbNewRooms);
        
        assertEquals(building.getRoom(0).getNumber(), 200);
	    assertEquals(building.getRoom(0).getUsage(), "Server room");
	    assertEquals(building.getRoom(0).getFloor(), 2);
	    assertEquals(building.getRoom(0).getSensor(), sensor1);
	    assertEquals(building.getRoom(0).getControl_panel(), control_panel);
	    assertEquals(building.getRoom(0).getSurveillance(), surveillance);
	    assertEquals(building.getRoom(0).getEquipment(), equipment);
	    
	    assertEquals(building.getRoom(1).getNumber(), 178);
	    assertEquals(building.getRoom(1).getUsage(), "Gamming room");
	    assertEquals(building.getRoom(1).getFloor(), 3);
	    assertEquals(building.getRoom(1).getSensor(), sensor2);
	    assertEquals(building.getRoom(1).getControl_panel(), control_panel2);
	    assertEquals(building.getRoom(1).getSurveillance(), surveillance);
	    assertEquals(building.getRoom(1).getEquipment(), equipment);
	    
	    assertEquals(building.getRoom(2).getNumber(), 473);
	    assertEquals(building.getRoom(2).getUsage(), "HR room");
	    assertEquals(building.getRoom(2).getFloor(), 1);
	    assertEquals(building.getRoom(2).getSensor(), sensor3);
	    assertEquals(building.getRoom(2).getControl_panel(), control_panel3);
	    assertEquals(building.getRoom(2).getSurveillance(), surveillance);
	    assertEquals(building.getRoom(2).getEquipment(), equipment);
    }
    
}

