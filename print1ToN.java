import java.util.*;

public class print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int n = 1;
         while (n <= num) {
            System.out.println(n);
            n++;
         } 
    }
}
