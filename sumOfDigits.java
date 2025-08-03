import java.util.*;

public class sumOfDigits {
    
    public static int sumDigit(int n){
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10; 
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a  Integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ sumDigit(digits));
    }
}
