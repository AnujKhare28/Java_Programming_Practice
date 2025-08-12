import java.util.*;

public class binarySearch {
    
    public static int binary(int number[], int key){
        int start = 0, end = number.length-1;

        while (start <= end){
            int mid = (start + end)/2;

            if (number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,5,6,7,8,10,12,14,15};
        int key = 10;

        System.out.println("The key at the index: " + binary(number, key));
    }
}
