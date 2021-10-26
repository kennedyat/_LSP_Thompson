package org.howard.edu.lsp.assignment3.test;

import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
/**
 * 
 * @author Kennedy Thompson
 *
 */
public class Driver {

	/**
	 * 
	 * @param args takes in string
	 * @throws Exception exception created for arrays that are null
	 */
	public static void main(String[] args) throws Exception {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:" + set1.toString());
		
	
		System.out.println("Smallest value in Set1 is:" + set1.smallest());
			
		System.out.println("Largest value in Set1 is:" + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(3);
		set2.add(6);

		System.out.println("Value of Set2 is:" + set2.toString());
		
		System.out.println("Length of Set1 is:" + set1.length());
		System.out.println("Length of Set2 is:" + set2.length());
		
		System.out.println("Result of union of Set1 and Set2");
		set1.union(set2);	// union of set1 and set2
		System.out.println();
		System.out.println("Result of intersection of Set1 and Set2");
		set1.intersect(set2);
		System.out.println();// union of set1 and set2
		System.out.println("Result of diff of Set1 and Set2");
		set1.diff(set2);	// union of set1 and set2
		
		System.out.println();
		System.out.println("Does Set 1 and Set 2 contain the same values?");
		System.out.println(set1.equals(set2));
		
		System.out.println("Does Set 1 contain the value '1'?");
		System.out.println(set1.contains(1));
		
		set1.remove(2);
		System.out.println("Result of union of Set1 and Set2");
		System.out.println(set1.toString());
		
		set2.clear();
		System.out.println("Set 2 had been cleared out");
		System.out.println("Value of Set2 is:" + set2.toString());
		
		System.out.println("Largest value in Set2 is:" + set2.largest());


	}

}
