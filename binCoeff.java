import java.util.*;

public class binCoeff {
    public static int fact (int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int binCoeff = n_fact / (r_fact * nmr_fact);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the Value of R:");
        int r = sc.nextInt();

        int bin = binCoeff(n, r);
        System.out.println("The Binomial Coefficent is "+ bin);

    }
}
