package org.howard.edu.lsp.assignment7.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment3.exception.IntegerSetException;
import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
import org.howard.edu.lsp.assignment7.polynomial.Polynomial;
import org.howard.edu.lsp.assignment7.term.Term;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestClass {
	int s ;
	int e;
	Term t;
	List<Term> termSet = new ArrayList<Term>();
	Polynomial set;
	Polynomial expected;
	
	
	//IntegerSetException e;
	@BeforeEach
	 void  setUp() throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new FileReader("polynomial.txt"));
	    String line = null;
	    int i = 0;
	    
	    while (br.readLine() != null) {
	    	br.skip(3);
	    	line=br.readLine();
	      String[] values = line.split(";");
	      for (String str : values) {
	    	  if(i%2==0)
	    		  s = Integer.parseInt(str);
	    	  if(i%2==1) {
	    		  e = Integer.parseInt(str);
	    		  t = new Term(s,e);
		    	  termSet.add(t);}
	    	  i++;
	        //.add(Integer.parseInt(str));
	    	 
	     
	      }
	    }
	    br.close();
	  
	 set = new Polynomial(termSet);
	 expected = new Polynomial(termSet);
	
}
		
		@Test
	    @DisplayName("Test case for Insert")
	    public void insert() {
			//expected.polySet = new ArrayList<Term>(Arrays.asList(Term(-4,0));
			 //expected.polySet = new ArrayList<Term>(Arrays.asList(Term(-4,0));
			 //set.insert(4,2);
			 assertEquals("5x^3+4x^2+-4x+8", set.insert(4,2));
	       
	    }
		

	    @Test
	    @DisplayName("Test case for Delete")
	    public void delete() {
			 //expected.polySet = new ArrayList<Integer>(Arrays.asList(-4,0,-2,2,6,5));
			 
			 assertEquals("5x^3+-4x+8", set.delete(4,1));
	       
	    }
		
		@Test
	    @DisplayName("Test case for Reverse")
	    public void reverse() {
			 //expected.polySet = new ArrayList<Integer>(Arrays.asList(6,5,-2,2,7,1,-4,0));
			 
			 assertEquals("8+-4x+5x^3",set.reverse());
	       
	    }
		

		@Test
	    @DisplayName("Test case for Product")
	    public void product() {
			 //expected.polySet = new ArrayList<Integer>(Arrays.asList(6,5,-2,2,7,1,-4,0));
			 
			 assertEquals("-160x^4",set.product());
	       
	    }


		
	
		
}
