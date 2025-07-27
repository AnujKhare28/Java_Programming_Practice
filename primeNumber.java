import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i=2; i<num; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
