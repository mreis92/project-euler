#include <stdio.h>
#include <stdlib.h>

#include "math_utils.h"

#define LIMIT 19

/*
 * Problem: 2520 is the smallest number that can be divided by each of
 *  the numbers from 1 to 10 without any remainder.
 *
 *  What is the smallest positive number that is evenly divisible by
 *  all of the numbers from 1 to 20?
 *
 */
int main(){
	int i;
	long result = 1;

	for(i = 2; i <= LIMIT; i++){
		result = lcm(result, i);
	}

	printf("Result: %d\n", result);

	return 0;
}
