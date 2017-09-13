// Program to calculate the GCD of two positive integers using the Euclidean algorithm 

public class P1PartB3 {
    
    public static void main(String[] args) {
        long X1, X2, CommonDenominator;
            if(args.length >= 2){
              X1 = Long.parseLong(args[0]);
              X2 = Long.parseLong(args[1]);
              if(X1 >= 1 && X2>= 1){
                  CommonDenominator = GCD(X1, X2);
                System.out.println("\n X1 = " + X1 + "     X2 = " + X2 + "     GCD = " + CommonDenominator);
              }
            }
            return;
    } // end main
    
    public static long GCD(long x1, long x2) {
        
        while ( x2 != 0 ) {
            long temp = x2;
            x2 = x1 % x2;
            x1 = temp;
        }
        
        return x1;
    } // end GCD

} // end class
