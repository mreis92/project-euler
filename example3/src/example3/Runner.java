package example3;

import java.util.*;
import javaUtils.PrimeNumberUtils;

public class Runner {
	
	/*
	 * Problem: The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 * 
	 */
	private static final long VALUE = 600851475143L ;

	public static void main(String[] args) {
		PrimeNumberUtils utils = new PrimeNumberUtils();
		ArrayList<Integer> primeFactors = utils.getPrimeFactors(VALUE);
		
		System.out.print("Largest prime factor of " + VALUE + " is: ");
		System.out.println(Collections.max(primeFactors));

	}

}
