
package ch05.simpledotcom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testSetLocationCells() {
        System.out.println("setLocationCells");
        int[] locs = {2,3,4}; //수정
        SimpleDotCom instance = new SimpleDotCom();
        instance.setLocationCells(locs);
        assertArrayEquals(locs,instance.locationCells);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckYourself() {
        System.out.println("checkYourself");
        String stringGuess = "2";
        SimpleDotCom instance = new SimpleDotCom();
        
        int[] locs = {2,3,4};
        instance.setLocationCells(locs);
        
        String expResult = "hit";
        String result = instance.checkYourself(stringGuess);
        assertEquals(expResult, result); // 기대결과와 실제 결과를 비교하는 역할
        //fail("The test case is a prototype.");
    }
}
