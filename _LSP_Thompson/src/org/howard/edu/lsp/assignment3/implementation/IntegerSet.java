package org.howard.edu.lsp.assignment3.implementation;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Kennedy Thompson
 *
 */


/**
 * 
 * throws exception when list is null
 *
 */
class IntegerSetException extends Exception{
	public IntegerSetException(String s)
    {
        super(s);
    }
	
}

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	public List<Integer> intSet = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

/**
 * Clears the array intSet
 */
public void clear() {intSet.clear();};

/**
 * Find the length
 * @return length of array
 */
public int length() {return intSet.size();}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
/**
 * 
 * @param IntegerSet takes in a set
 * @return returns true/false based on if intSet contains the same values as given intSet
 */
public boolean equals(IntegerSet b) {return intSet.equals(b);}; 

/**
 * 
 * @param Takes in IntegerSet
 * @return true or false based on if array contains given value
 */
public boolean contains(int value) {
	return intSet.contains(value);
		
	};    

/**
 * Find the largest value in array
 * @return largest value
 * @throws IntegerSetException when array is null
 */
public int largest() throws IntegerSetException {
	try {
	if(intSet.size()==0) {
		throw new IntegerSetException("Array is Empty.");}}
	catch(IntegerSetException intex){
		 System.out.println(intex.getMessage());
	}
	int max = intSet.get(0);
	for(int i: intSet) {
		if(i>max) {
			max = i;
		}
	}
	return max;
}; 

/**
 * Find the smallest value in array
 * @return smallest value
 * @throws IntegerSetException when array is null
 */
public int smallest() throws IntegerSetException{
	if(intSet.size()==0) {
		throw new IntegerSetException("Array is Empty.");}
	int min = intSet.get(0);
	for(int i: intSet) {
		if(i<min) {
			min = i;
		}
	}
	return min;
};

/**
 * Adds given item to intSet array
 * @param item
 */
 public void add(int item) {
 	intSet.add(item);
 }; // adds item to s or does nothing if it is in set

/**
 * Removes given item to intSet array
 * @param item
 * @throws IntegerSetException when array is null
 */
public void remove(int item) throws IntegerSetException { //Throws a IntegerSetException of the set is empty
	if(intSet.size()==0) 
		throw new IntegerSetException("Array is Empty.");
	for( int i = 0; i<intSet.size(); i++){
		if(item == intSet.get(i))
			intSet.remove(i);};  
	}

/**
 * Combines both values from set1 and set2 into a single array
 * @param intSetb
 */
public void union(IntegerSet intSetb) {

	List<Integer> list = new ArrayList<Integer>();
	list.addAll(intSet);
	list.addAll(intSetb.intSet);
     
	System.out.println(list);
};

/**
 * Find a common value between both set1 and set2
 * @param intSetb
 */
public void intersect(IntegerSet intSetb) {
	 for (Integer i : intSetb.intSet) {
	        if(intSet.contains(i)) {
	            System.out.print(i+ " ");
	        }
}}; 

/**
 * Gives the difference between set1 and set2
 * @param intSetb
 */
public void diff(IntegerSet intSetb) {
	 for (Integer i : intSetb.intSet) {
	        if(!intSet.contains(i)) {
	        	System.out.print(i+ " ");
	        }
}};

/**
 * 
 * @return if intSet array is empty
 */
boolean isEmpty() {
	if(intSet.size()==0)
		return true;
	return false;
}

/**
 * @return a string of intSet
 */
public String toString() {return intSet.toString();};	// return String representation of your set
}
