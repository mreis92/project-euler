#!/usr/bin/env python

'''

A palindromic number reads the same both ways. The largest palindrome
made from the product of two 2-digit numbers is 9009 = 91 x 99.
Find the largest palindrome made from the product of two 3-digit numbers.

'''

def isPalindrome(n):
    s = str(n)
    
    if s == s[::-1]:
        return True
    else:
        return False

max_n = 0

for i in xrange(100,999):
    for j in xrange(100,999):
        n = i*j
        
        if isPalindrome(n):
            if n > max_n:
                max_n = n

print "The largest palindrome is:", max_n
