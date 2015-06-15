
public class Runner {

	/*
	 * Problem: The sum of the squares of the first ten natural numbers is, 
	 * 
	 * 1² + 2² + ... + 10² = 385 
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * 
	 * (1 + 2 + ... + 10)² = 55² = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten natural numbers 
	 * and the square of the sum is 3025 − 385 = 2640. Find the difference between the sum of
	 *  the squares of the first one hundred natural numbers and the square of the sum.
	 * 
	 */
	
	private static final int LIMIT = 100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum_square = (LIMIT*(LIMIT+1)*(2*LIMIT+1))/6;
		int square_sum = (LIMIT*(LIMIT+1))/2;
		square_sum *= square_sum;
		
		System.out.println("Result: " + (square_sum-sum_square));
		
	}

}
