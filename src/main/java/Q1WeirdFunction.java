// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n < 3) {
           return n;
        } else {
           while(n >= 3) {
              n = fRecursive(n - 1) + ( 2 * fRecursive(n - 2) ) + ( 3 * fRecursive(n - 3) );
           }
           return n;
        }
     }

     // a comment
  
     public static int fIterative(int n) {
        

        
        return n;
     }
}