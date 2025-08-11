import java.util.*;

public class largeInArr {
    public static int getlargest(int numbers[]){

        int largest = Integer.MIN_VALUE;  
        
        for(int i = 0; i < numbers.length; i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,7,4,5};
        System.out.println("Largest number in array is " + getlargest(numbers));
    }
}
