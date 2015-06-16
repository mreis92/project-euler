#include <stdio.h>
#include <stdlib.h>

#include "math_utils.h"

/**
 * Least common multiple
 */
long lcm(long a, long b){
	return (a*b)/gcd(a,b);
}

/*
 * Greatest common divisor
 */
long gcd(long a, long b){
	return (b != 0) ? gcd(b, a%b) : a;
}
