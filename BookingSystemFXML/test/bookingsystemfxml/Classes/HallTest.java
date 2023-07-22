/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystemfxml.Classes;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class HallTest {
    
    public HallTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHallNo method, of class Hall.
     */
    @Test
    public void testGetHallNo() {
        System.out.println("getHallNo");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getHallNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHallName method, of class Hall.
     */
    @Test
    public void testGetHallName() {
        System.out.println("getHallName");
        Hall instance = null;
        String expResult = "";
        String result = instance.getHallName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRooms method, of class Hall.
     */
    @Test
    public void testGetNumRooms() {
        System.out.println("getNumRooms");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getNumRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableRooms method, of class Hall.
     */
    @Test
    public void testGetAvailableRooms() {
        System.out.println("getAvailableRooms");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getAvailableRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Hall.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Hall instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class Hall.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        Hall instance = null;
        int expResult = 0;
        int result = instance.getTelephone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRent method, of class Hall.
     */
    @Test
    public void testGetRent() {
        System.out.println("getRent");
        Hall instance = null;
        double expResult = 0.0;
        double result = instance.getRent();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivitiesList method, of class Hall.
     */
    @Test
    public void testGetActivitiesList() {
        System.out.println("getActivitiesList");
        Hall instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getActivitiesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRent method, of class Hall.
     */
    @Test
    public void testSetRent() {
        System.out.println("setRent");
        double rent = 0.0;
        Hall instance = null;
        instance.setRent(rent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumRooms method, of class Hall.
     */
    @Test
    public void testSetNumRooms() {
        System.out.println("setNumRooms");
        int numRooms = 0;
        Hall instance = null;
        instance.setNumRooms(numRooms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Hall.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String HallOfficeEmail = "";
        Hall instance = null;
        instance.setEmail(HallOfficeEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelephone method, of class Hall.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        int HallOfficeTelephone = 0;
        Hall instance = null;
        instance.setTelephone(HallOfficeTelephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomsArray method, of class Hall.
     */
    @Test
    public void testSetRoomsArray() {
        System.out.println("setRoomsArray");
        Room[] roomsArray = null;
        Hall instance = null;
        instance.setRoomsArray(roomsArray);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHallDetails method, of class Hall.
     */
    @Test
    public void testSetHallDetails() {
        System.out.println("setHallDetails");
        int numRooms = 0;
        String email = "";
        int telephone = 0;
        Hall instance = null;
        instance.setHallDetails(numRooms, email, telephone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addActivity method, of class Hall.
     */
    @Test
    public void testAddActivity() {
        System.out.println("addActivity");
        String activity = "";
        Hall instance = null;
        instance.addActivity(activity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeActivity method, of class Hall.
     */
    @Test
    public void testRemoveActivity() {
        System.out.println("removeActivity");
        int activityIndex = 0;
        Hall instance = null;
        instance.removeActivity(activityIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAvailableRooms method, of class Hall.
     */
    @Test
    public void testCheckAvailableRooms() {
        System.out.println("checkAvailableRooms");
        Hall instance = null;
        int expResult = 0;
        int result = instance.checkAvailableRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hall.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hall instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
