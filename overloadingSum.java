import java.util.*;

public class overloadingSum {
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(2,3,4));
    }
}
