// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n < 3) {
           return n;
        } else { 
            return fRecursive(n - 1) + ( 2 * fRecursive(n - 2) ) + ( 3 * fRecursive(n - 3) );
           } 
        } 

  
     public static int fIterative(int n) {
      if (n < 3) {
         return n;
      }
      int[] result = new int[n+1];
      result[0] = 0;
      result[1] = 1;
      result[2] = 2;

      for (int i = 3; i <= n; i++) {
         result[i] = result[i-1] + 2 * result[i-2] + 3 * result[i-3]; 
      }
      return result[n];
     }

   //   public static void main(String[] args) {
   //       int x = fRecursive(3);
   //       System.err.println(x);
   //   }
}