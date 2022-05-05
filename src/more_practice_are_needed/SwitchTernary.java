package more_practice_are_needed;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class SwitchTernary {
    public static void main(String[] args) {

        /*Write a Java program user will choose answer among A, B, C, or D.
        If the answer is true, output will be “True.” If the answer is false, output will be
        “False”. Correct answer is ‘C’ for the multiple option question.*/
        System.out.println("Enter a letter");
        Scanner scan=new Scanner(System.in);
        String s= scan.next();


        switch (s){
            case "A":
            {
                System.out.println(false);
                break;
            }
            case "B":
            {
                System.out.println(false);
                break;
            }
            case "C":
            {
                System.out.println(true);
            }
            case "D":
            {
                System.out.println(false);
            }
            default:
            {
                System.out.println("enter a valid letter ");
            }
        }


    }
}
