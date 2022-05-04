import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {



        /*Type a program which calculates the area and the perimeter of a rectangle
            whose length and width are entered by user.
            Hint 1: Area of a rectangle is width x length
            Hint 2: Perimeter of a rectangle is 2x (width + length)*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the length of rectangle ");
        int length= scan.nextInt();

        System.out.println("Enter the width of rectangle ");
        int width= scan.nextInt();

        System.out.println("The perimeter of a rectangle is "+ 2*(length+width));

        System.out.println("---------------");
        System.out.println("The area of a rectangle is " + (width*length));

    }
}
