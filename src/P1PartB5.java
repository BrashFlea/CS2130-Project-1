// Program to calculate the X-th term of a sequence recursively

public class P1PartB5 {
    
    public static void main(String[] args) {
        long X, Sequence;
            if(args.length >= 1){
              X = Long.parseLong(args[0]);
              if(X >= 1 && X <= 50){
                  Sequence = RecursiveSeq(X);
                System.out.println("\n X = " + X + "     X-th Term = " + Sequence);
              }
            }
            return;
    } // end main
    
    public static long RecursiveSeq(long x) {

        // f(1) = 1
        if( x == 1 ) {
            return 1;
        }
        // f(2) = 3
        else if( x == 2 ) {
            return 3;
        }
        // edge case
        else if (x < 1) {
            return 0;
        }
        
        return 2*RecursiveSeq(x - 1) - 2*RecursiveSeq(x -2);
    } // end RecursiveSeq

} // end class
