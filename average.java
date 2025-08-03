import java.util.*;

public class average {
    
    public static double avg(double x, double y, double z){
        return  (x + y + z)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the First Number:");
        double x = sc.nextDouble();

        System.out.print("Input the Second Number:");
        double y = sc.nextDouble();

        System.out.print("Input the Third Number:");
        double z = sc.nextDouble();

        System.out.print("The average value is " + avg(x, y, z) + "\n");
    }
}
