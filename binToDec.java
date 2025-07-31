import java.util.*;

public class binToDec {

    public static void binaryToDec (int binNum){
        int pow = 0;
        int decNum = 0;

        while (binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum +(lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal Number: "+ decNum);

    }

    public static void main(String[] args) {
        binaryToDec(1010101011);
    }
}
