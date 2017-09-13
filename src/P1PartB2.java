// Program to calculate the Reverse Digit of a positive Integer

public class P1PartB2 {
	
    public static void main(String[] args) {
        long X, Y;
		    if(args.length >= 1){
		      X = Long.parseLong(args[0]);
		      if(X >= 1){
		        Y = ReverseDigits(X);
		        System.out.println("\n X = " + X + "     Y = " + Y);
		      }
		    }
		    return;
	} // end main
    
    public static long ReverseDigits(long x) {
    	long y = 0;
    	
    	while ( x != 0) {
    	    y = y * 10 + x % 10;
    	    x = x / 10;
    	}
    	
    	return y;
    } // end Reverse Digits

} // end class
