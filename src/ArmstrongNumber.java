import java.util.Scanner;
import java.lang.Math;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int digit, sum = 0, num=in.nextInt(), temp;
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            temp /= 10;
            sum += (int) Math.pow(digit, 3);
        }
        if (sum == num) {
            System.out.println(num + " is armstorngNumber. ");
        } else {
            System.out.println(num + " is not armstorngNumber. ");

        }
    }

}