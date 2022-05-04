import java.util.Scanner;

public class VolumeOfCube {
    public static void main(String[] args) {

        /*Type a program which calculates the cube of a number which is entered
          by user.
            Hint 1: Cube of a number is a x a x a*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a length of the cube to find the volume ");
        int volumeOfCube= scan.nextInt();

        System.out.println("The volume of Cube is " + volumeOfCube*volumeOfCube*volumeOfCube);


    }
}
