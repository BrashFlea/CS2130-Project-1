// Program to calculate BaseB of two positive integers

public class P1PartB4 {
    
    public static void main(String[] args) {
        long X, B;
            if(args.length >= 2){
              X = Long.parseLong(args[0]);
              B = Long.parseLong(args[1]);
              if( (X >= 1 && X <= 100000) && (B >= 2 && B <= 10) ){
                  System.out.print("\n X = " + X + "     B = " + B + "     Y = ");
                  BaseB(X, B);
              }
            }
            return;
    } // end main
    
    public static void BaseB(long x, long b) {

        // base case
        if (x == 0) {
            return;
        }
        long y = x % b;
        x /= b;
        if (y < 0) {
            x += 1;
        }
        BaseB(x,b);
        System.out.print(y); 
        return;
    } // end BaseB

} // end class
