package org.howard.edu.lsp.assignment7.term;

/**
 * 
 * @author Kennedy Thompson
 *
 */


public class Term {
	public int coefficient;
	public int exponent;
	
	public Term(int c, int e){
		coefficient = c;
		exponent = e;
	}
	
	/**
	 * Converts Term into a polynomial string
	 * @return string of polynomial
	 */
	public String toString() {
		String expression= Integer.toString(coefficient);
		if(exponent==0)
			return expression;
		if(exponent==1)
			return expression + "x";
		return expression+"x^"+Integer.toString(exponent);
		
	}

}
