import java.util.*;

public class passFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = sc.nextInt();

        String result = (marks >= 33)? "Pass" : "Fail";
        System.out.println("The student has"+ " "+result+"ed the exam.");
    }
    
}
