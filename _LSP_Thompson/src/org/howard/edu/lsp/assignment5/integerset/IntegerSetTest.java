package org.howard.edu.lsp.assignment5.integerset;

import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
import org.howard.edu.lsp.assignment3.exception.IntegerSetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.rules.ExpectedException;
import static org.junit.jupiter.api.Assertions.assertThrows;




import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;



class IntegerSetTest {
	
	IntegerSet set1;
	IntegerSet set2;
	IntegerSet expected;
	IntegerSetException e;
	@BeforeEach
	 void  setUp() {
		   set1 = new IntegerSet();
		   set2 = new IntegerSet();
		   expected = new IntegerSet();
		  set1.intSet = new ArrayList<Integer>(Arrays.asList(2,3,4));
		  set2.intSet = new ArrayList<Integer>(Arrays.asList(5,3,6));
	       expected.clear();
	    	
	    	}
		
		@Test
	    @DisplayName("Test case for Clear")
	    public void testClear() {
			 expected.intSet = new ArrayList<Integer>(Arrays.asList());
			 set1.clear();
			 assertEquals(expected.intSet, set1.intSet);
	       
	    }
		//clear;
		//length
		/*public static ArrayList<Integer>> data(){
			return new ArrayList<ArrayList<Integer>> (Arrays.asList({1,2,3},{1,2,3,4},{2,3,4,5,6,7});
		}
		*/
		
		@Test
	    @DisplayName("Test case for length")
		public void testLength() throws Exception {
			assertEquals(3,set1.length());
			set1.remove(3);
			assertEquals(2,set1.length());
			set1.add(1);
			set1.add(7);
			assertEquals(4,set1.length());
		}
		
		//equals - do failing test cases too
		@Test
	    @DisplayName("Test case for equals")
		public void testEquals() {
			 expected.intSet = new ArrayList<Integer>(Arrays.asList(2,3,4));
			assertTrue(set1.equals(expected));
			assertFalse(set1.equals(set2));
		}
		//contains - f
		
		public void testContains() {
			 
				assertTrue(set1.contains(2));
				assertFalse(set1.contains(-5));
				assertTrue(set1.contains(4));
				assertFalse(set1.contains(1));
		}
		//largest +smallest
		@Rule
		public ExpectedException thrown = ExpectedException.none();
		
		@Test
        public void testLargestandSmallest() throws IntegerSetException{ //Couldn't figure how to throw exception
			 assertEquals(4,set1.largest());
			  assertEquals(2,set1.smallest());
			//Throwable e = assertThrows(IntegerSetException.class, ()->set1.largest());
			//set1.clear();
			//set1.largest();
			//Exception e = assertThrows(IntegerSetException.class, ()->set1.largest());
			//Exception t = assertThrows(IntegerSetException.class, () -> set1.largest());
			 // assertTrue(t.getMessage().contains("Array is Empty."));
			 
			//thrown.expect(IntegerSetException.class);
			//thrown.expectMessage("Array is Empty.");
			
			
		}
	//add + remove
	@Test
	public void testAddRemove() throws Exception {
		 expected.intSet = new ArrayList<Integer>(Arrays.asList(2,3,4,6));
		set1.add(6);
		assertEquals(expected.intSet, set1.intSet);
		
		expected.intSet = new ArrayList<Integer>(Arrays.asList(2,3,4,6,7,9));
		set1.add(7);
		set1.add(9);
		assertEquals(expected.intSet, set1.intSet);
		
		expected.intSet = new ArrayList<Integer>(Arrays.asList(2,4,6,7,9));
		set1.remove(3);
		assertEquals(expected.intSet, set1.intSet);
	}
	
	

		//@Test
	   // @DisplayName("Test case for equals")
		//@TestFactory
	    @Test
	    @DisplayName("Test case for differences")
		void testDiff() {
	    	 expected.intSet = new ArrayList<Integer>(Arrays.asList(2,4,5,6));
		
			 set1.diff(set2);
			 assertEquals(expected.intSet, set1.intSet);	
		}
	    
	    @Test
	    @DisplayName("Test case for intersection")
	    void testIntersect() {
	    	 expected.intSet = new ArrayList<Integer>(Arrays.asList(3));

			set1.intersect(set2);
			 assertEquals(expected.intSet, set1.intSet);	
		}
	    
	    @Test
	    @DisplayName("Test case for union")
	    void testUnion() {
	    	 expected.intSet = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));

			set1.union(set2);
			 assertEquals(expected.intSet, set1.intSet);	
		}
	
		@Test
	    @DisplayName("Test case if empty")
	    void testIsEmpty() {
			assertFalse(set1.isEmpty());
			set1.clear();
			assertTrue(set1.isEmpty());
		}
		
		

}
