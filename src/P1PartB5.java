// Program to calculate the X-th term of a sequence recursively

public class P1PartB5 {
    
    public static void main(String[] args) {
        long X, Sequence;
            if(args.length >= 1){
              X = Long.parseLong(args[0]);
              if(X >= 1 && X <= 50){
                  Sequence = RecursiveSeq(X);
                System.out.println("\n X = " + X + "     Sequence = " + Sequence);
              }
            }
            return;
    } // end main
    
    public static long RecursiveSeq(long x) {
        long y = 0;

        return y;
    } // end RecursiveSeq

} // end class
