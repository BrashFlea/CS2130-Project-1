// Program to calculate the sum of the divisors
// of a positive integer.

import java.lang.Math;

public class P1PartB1
{
  public static void main(String args[])
  {
    long X, Y;
    if(args.length >= 1){
      X = Long.parseLong(args[0]);
      if(X >= 1){
        Y = SumOfDivisors(X);
        System.out.println("\n X = " + X + "     Y = " + Y);
      }
    }
    return;
  }

  public static long SumOfDivisors(long x)
  {
    long y = 0;

    // find all divisors which divides 'x'
    for (int i = 2; i <= Math.sqrt(x); i++) {
    	
    	// if 'i' is a divisor of 'x'
    	if( x%i == 0 ) {
    		
    		// if both divisors are the same then add it only once
    		if( i == (x/i)) {
    			y += i;
    			
    		}
    		// else add both divisors
    		else {
    			y += ( i + x/i );
    			
    		}
    	}
    }

    // Add the original number and 1 as they are always divisors
    return (y += (1 + x));
  }

} // end class

