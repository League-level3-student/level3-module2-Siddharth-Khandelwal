package _02_Intro_To_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _03_More_Algorithms.Algorithms;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] billybobjoe = new String[5];
    	billybobjoe[0] = "tree";
    	billybobjoe[1] = "octupus";
    	billybobjoe[2] = "panda";
    	billybobjoe[3] = "natural";
    	billybobjoe[4] = "obtain";
    	
    	
    	
    	//     assertEquals("8 x 11 = 88", Algorithms.multiply(8, 11));
        assertEquals(2, _01_LinearSearch.linearSearch(billybobjoe, "panda"));
        assertEquals(4, _01_LinearSearch.linearSearch(billybobjoe, "obtain"));
        assertEquals(-1, _01_LinearSearch.linearSearch(billybobjoe, "chewsday"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
     
        int[] billybobjoe = new int[15];
    	billybobjoe[0] = 6;
    	billybobjoe[1] = 7;
    	billybobjoe[2] = 11;
    	billybobjoe[3] = 14;
    	billybobjoe[4] = 24;
    	billybobjoe[5] = 34;
    	billybobjoe[6] = 36;
    	billybobjoe[7] = 39;
    	billybobjoe[8] = 41;
    	billybobjoe[9] = 46;
    	billybobjoe[10] = 47;
    	billybobjoe[11] = 49;
    	billybobjoe[12] = 50;
    	billybobjoe[13] = 54;
    	billybobjoe[14] = 84;
    	
    	assertEquals(2,_02_BinarySearch.binarySearch(billybobjoe, 0, 14, 11));
    	assertEquals(7,_02_BinarySearch.binarySearch(billybobjoe, 0, 14, 39));
    	assertEquals(-1,_02_BinarySearch.binarySearch(billybobjoe, 0, 14, 44));
        
    }
    
}
