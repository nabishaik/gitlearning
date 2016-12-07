#nlog n solution

varnum = input ("enter a number :")
n = 1
import math
while n * math.log(n, 2) < (varnum):
    n += 1

print "Minimum value of n (n lg n) :", n - 1