import java.util.*;

public class sum_Fun {
   public static int sum (int a, int b) {
        int sum = a + b;
        return sum;
   } 

   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the 1st num:");
    int a = sc.nextInt();
    System.out.println("Enter the 2nd num:");
    int b = sc.nextInt();

    int sum = sum(a,b);
    System.out.println("Sum is:" + sum);
   }
}
