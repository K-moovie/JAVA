/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.simpledotcom;

import org.junit.jupiter.api.AfterAll;
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

    /**
     * Test of setLocationCells method, of class SimpleDotCom.
     */
    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        int[] locs = null;
        SimpleDotCom instance = new SimpleDotCom();
        instance.setLocationCells(locs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkYourself method, of class SimpleDotCom.
     */
    @Test
    public void testCheckYourself() {
        System.out.println("checkYourself");
        String stringGuess = "";
        SimpleDotCom instance = new SimpleDotCom();
        String expResult = "";
        String result = instance.checkYourself(stringGuess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
