import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Choose an opration: +, -, *, /, %");
        char operation = sc.next().charAt(0);
        int result;
        switch(operation) {
            case '+':
                result = a + b;
                System.out.println("The result is: "+ result);
                break;
            case '-':
                result = a - b;
                System.out.println("The result is: "+ result);
                break;
            case '*':
                result = a * b;
                System.out.println("The result is: "+ result);
                break;
            case '/':
                result = a / b;
                System.out.println("The result is: "+ result);
                break;
            case '%':
                result = a % b;
                System.out.println("The result is: "+ result);
                break;
            default:
                System.out.println("Enter a valid operation.");
        }


    }
}
