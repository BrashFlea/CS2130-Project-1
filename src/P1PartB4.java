// Program to calculate BaseB of two positive integers

public class P1PartB4 {
    
    public static void main(String[] args) {
        long X, B, Y;
            if(args.length >= 2){
              X = Long.parseLong(args[0]);
              B = Long.parseLong(args[1]);
              if( (X >= 1 && X <= 100000) && (B >= 1 && B <= 10) ){
                  Y = BaseB(X, B);
                System.out.println("\n X = " + X + "     B = " + B + "     Y = " + Y);
              }
            }
            return;
    } // end main
    
    public static long BaseB(long x, long b) {
        long y = 0;
        
            
        return y;
    } // end BaseB

} // end class
