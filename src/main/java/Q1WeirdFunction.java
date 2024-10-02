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
      int temp = n; 
      int result = n; 
      while ( temp >= 3) {
         if (temp < 3) 
            return n;
         else {
            if (n - 1 < 3)
               result += n;
            else 
               result += n - 1;
            
            if (n - 2 < 3)
               result += 2 * n;
            else 
               result += 2 * (n - 2);
            
            if (n - 3 < 3)
               result += 3 * n;
            else 
               result += 3 * (n - 3);
         }
         temp -= 1;
      }
      return result;
     }
}