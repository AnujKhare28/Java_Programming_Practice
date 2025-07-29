import java.util.*;

public class product_Fun {

   public static int mul(int a, int b){
    int product = a * b;
    return product;
   } 

   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the 1st num:");
    int a = sc.nextInt();
    System.out.println("Enter the 2nd num:");
    int b = sc.nextInt();

    int multi = mul(a,b);

    System.out.println("Product is: "+multi);
   }
}
