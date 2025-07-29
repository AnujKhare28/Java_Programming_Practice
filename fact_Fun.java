import java.util.*;

public class fact_Fun {
    public static int fact (int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        
        int facto = fact(n);
        System.out.println("Factoral of " + n + " is "+ facto);
    }
}
