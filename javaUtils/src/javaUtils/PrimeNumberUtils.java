package javaUtils;

import java.util.ArrayList;
import java.util.BitSet;

public class PrimeNumberUtils {

	public ArrayList<Integer> getPrimeFactors(long n){
		int upperBound = (int)Math.round(Math.sqrt(n));

		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		ArrayList<Integer> primes = generatePrimes(upperBound);
		
		while(n != 1){
			for(int p : primes){
				if(n%p == 0){
					primeFactors.add(p);
					n /= p;
					break;
				}
			}
		}
		
		return primeFactors;
	}
	
	public ArrayList<Integer> generatePrimes(int upperBound){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		BitSet sieve = new BitSet();
		primes.add(2);
		
		for(int i = 3; i <= upperBound; i+=2){
			if(!sieve.get(i)){
				int j = i;
				
				primes.add(i);
				while(j <= upperBound){
					sieve.set(j);
					j+=i;
				}
			}
		}
		
		return primes;
	}
}
