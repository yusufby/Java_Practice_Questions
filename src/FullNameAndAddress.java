import java.util.Scanner;

public class FullNameAndAddress {
    public static void main(String[] args) {


        /*Type a program which asks user to enter his/her full name, and address
            then print them on the console like the full name should be in the first line,
            and the address will be in the second line.
            Hint: To get String, use nextLine()*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your fullname ");
        String fullName= scan.nextLine();


        System.out.println("Enter your address ");
        String address= scan.nextLine();

        System.out.println("Your fullname is " + fullName);
        System.out.println("Your address is " + address);




    }
}
