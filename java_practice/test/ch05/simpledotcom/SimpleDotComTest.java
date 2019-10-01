/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.simpledotcom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class SimpleDotComTest {
    
    public SimpleDotComTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setLocationCells method, of class SimpleDotCom.
     */
    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        int[] locs = {2,3,4}; //수정
        SimpleDotCom instance = new SimpleDotCom();
        instance.setLocationCells(locs);
        assertArrayEquals(locs,instance.locationCells);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkYourself method, of class SimpleDotCom.
     */
    @Test
    public void testCheckYourself() {
        System.out.println("checkYourself");
        String stringGuess = "5";
        SimpleDotCom instance = new SimpleDotCom();
        
        int [] locs = {2,3,4};
        instance.setLocationCells(locs);
        String expResult = "miss";
        String result = instance.checkYourself(stringGuess);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
