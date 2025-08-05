import java.util.*;

public class triangle01 {
    
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j+i) % 2 != 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
            }
            
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        printTriangle(5);
        printTriangle(3);
        printTriangle(4);
    }
}
