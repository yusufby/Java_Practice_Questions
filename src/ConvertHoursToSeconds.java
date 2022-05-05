import java.util.Scanner;

public class ConvertHoursToSeconds {
    public static void main(String[] args) {

        /*Type a program which converts the hours to seconds. Hours value will be
            entered by user. (Use long)
            Hint 1: second = hour x 60 x 60
            Hint 2: To get long, use nextLong()*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the value of hours ");
        long hours= scan.nextLong();

        System.out.println("We converted hours to seconds. The result is " + hours*60*60 + "seconds ");


    }
}
