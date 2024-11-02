import java.util.Scanner;

public class if_condition {
    public static void main(String[] args) {
        /*int year;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The year : ");
        year = in.nextInt();
        if (year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
        in.close();*/

        float avg;
        System.out.println("Enter the Average marks :");
        Scanner in = new Scanner(System.in);
        avg = in.nextFloat();
        if (100 >= avg && 90 <= avg) {
            System.out.println("Grade-A");
        } else if (89 >= avg && 80 <= avg) {
            System.out.println("Grade-B");
        } else if (79 >= avg && 70 <= avg) {
            System.out.println("Grade-C");
        } else if (69 >= avg && 0 <= avg) {
            System.out.println("Grade-D");
        } else {
            System.out.println(" Entered invalid Input");
        }

        
    }
}
