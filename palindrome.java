import java.util.*;

public class palindrome {
    
    public static boolean isPalindrome(int num){
        int rev = 0;
        int palindrome = num;
        while (palindrome != 0) {
            int rem = palindrome % 10;
            rev = rev * 10 + rem;
            palindrome = palindrome/10;
        }
        if (num == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        
        if(isPalindrome(palindrome)) {
            System.out.println("Number: " + palindrome + " is a palindrome");
        }else {
             System.out.println("Number: " + palindrome + " is not a palindrome");
        }
    }
}
