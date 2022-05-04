import java.util.Scanner;

public class LengthOfSquare {
    public static void main(String[] args) {
            /*Type a program which calculates the area and the perimeter of a square
            whose side length is entered by user.
            Hint 1: Area of a square is length x length
            Hint 2: Perimeter of a square is 4x length*/


        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the length of the square");
        int lengthOfSquare= scan.nextInt();

        System.out.println("The area of length is " + lengthOfSquare * lengthOfSquare);
        System.out.println("-------------");
        System.out.println("Perimeter of the square is " + 4* lengthOfSquare) ;




    }
}
