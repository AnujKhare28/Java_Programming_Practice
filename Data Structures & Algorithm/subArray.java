import java.util.*;

public class subArray {
    
public static void sub(int number[]){
    int TS =0;
    for(int i=0; i<number.length; i++ ){
        int start =i;
        for(int j=i; j<number.length; j++){
            int end = j;
            for(int k = start; k<=end; k++){
                System.out.print(number[k]+ " ");
            }
            TS++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total SubArrays : "+ TS);
}

public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    sub(number);
}
}
