import java.util.*;

public class printTill10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;

        while(true){
            System.out.println("Enter a number");
            n = sc.nextInt();
            if (n % 10 == 0 ) {
                break;
            } else{
                System.out.println(n);
            }
        }
    }
}
