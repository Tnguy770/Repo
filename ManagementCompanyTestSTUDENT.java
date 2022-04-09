

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany mgmt;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		mgmt = new ManagementCompany("Titan", "31415", 5);
		
		
		//student add three properties, with plots, to mgmt co
		mgmt.addProperty("Orange Valley", "Beltville", 2750, "Troy Lawrence", 2,1,3,3);
		mgmt.addProperty("Leeson Heights", "Arlington", 2750, "Albert Robinson", 2,1,3,3);
		mgmt.addProperty("Sunday Plains", "Virginia Beach", 2750, "Mike Inez", 2,1,3,3);

	}

	@After
	public void tearDown() {
		//student set mgmt co to null 
		mgmt = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(mgmt.addProperty("Bardur", "Mordor", 500, "Sauron"),3,0);
		//student should add property with 8 args
		assertEquals(mgmt.addProperty("Rivendell", "Arnor", 4500, "Elrond", 5, 5, 2, 2), 4,0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		assertEquals(mgmt.addProperty("Orthanc", "Isengard", 3100, "Sarumon", 7, 4, 2, 2), -1, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		String maxPropRentArray = mgmt.maxRentProp().split("\n")[3];
		assertTrue(maxPropRentArray.contains("3250.0"));
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmt.totalRent(), 7450,0);
	}

 }
