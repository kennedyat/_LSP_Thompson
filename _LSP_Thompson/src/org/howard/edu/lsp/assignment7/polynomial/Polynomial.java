package org.howard.edu.lsp.assignment7.polynomial;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.howard.edu.lsp.assignment3.exception.IntegerSetException;
import org.howard.edu.lsp.assignment7.term.Term;
/**
 * 
 * @author Kennedy Thompson

*/


public class Polynomial {
	Term t;
	public List<Term> polySet = new ArrayList<Term>();
	
	public Polynomial(List<Term> arr) {
		polySet=arr;
		sort();
	}
	
	/**
	 * Sorts polySet
	 */
	public void sort() {
	
		for(int i=0; i<polySet.size(); i++) {
			for(int j=i+1; j<polySet.size(); j++) {
				Term tempe1=polySet.get(i);
				Term tempe2 =polySet.get(j);
				//int tempc1=polySet.get(i).;
				//int tempc2 =polySet.get(j-1);

				if(tempe1.exponent<tempe2.exponent) {
					
					
					//tempe2=polySet.get(i);
					polySet.set(i, tempe2);
					polySet.set(j,tempe1);
					//polySet.set(i-1, tempc2);
					//polySet.set(j-1,tempc1);
						
					
				}
				
				
			}
		}
			
		
	}
	
	/**
	 * Insert term in polySet
	 * @return polynomial 
	 */
	public String insert(int co, int exp){
		t= new Term(co, exp);
		polySet.add(t);
		sort();
		 return getString();
		
	}
	
	/**
	 * Delete term in polySet
	 * @return polynomial 
	 */
	
	public String delete(int co, int exp) {
		if(polySet.size()==0) {} 
			//throw new IntegerSetException("Array is Empty.");
		for( int i = 0; i<polySet.size(); i+=2){
			
				if(co==polySet.get(i).coefficient) {
					if(exp==polySet.get(i).exponent) {
						polySet.remove(i);
						
						
					}
				}
				
			}
		return getString();
			
	}
	
	/**
	 * Reverse polySet
	 * @return reversed polynomial 
	 */
	
public String reverse() {
		List<Term> pSet = new ArrayList<Term>();
		for(int i=polySet.size()-1; i>=0; i--) {
			pSet.add(polySet.get(i));
		}
		polySet=pSet;
	
		return getString();
	}
	
/**
 * Finds product of polynomial
 * @return product of polynomial 
 */
	public String product() {
		int product=1;
		int sum=0;
		for (Term term: polySet) {
			product*=term.coefficient;
			sum+=term.exponent;
		}
		t = new Term(product, sum);
		return t.toString();
		//coefficient
		
	}
	
	/**
	 * get string from Term Class
	 * @return string
	 */
	
	public String getString() {
		int i =0;
		String s ="";
		while(i<polySet.size()-1) {
			s+=polySet.get(i).toString() + "+";
			i++;
		}
		s+=polySet.get(i).toString();
		
		return s;
	}


}
