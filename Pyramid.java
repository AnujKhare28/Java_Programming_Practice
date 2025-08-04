import java.util.*;

public class Pyramid {
    public static void Pyd(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyd(5);
    }
}
