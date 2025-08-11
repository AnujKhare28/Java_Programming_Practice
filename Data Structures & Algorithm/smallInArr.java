import java.util.*;

public class smallInArr {
     public static int getsmallest(int numbers[]){

        int smallest = Integer.MAX_VALUE;  
        
        for(int i = 0; i < numbers.length; i++){
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,3,1,7,4,5};
        System.out.println("Smallest number in array is " + getsmallest(numbers));
    }
}
