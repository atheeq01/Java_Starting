import java.util.Scanner;

public class prime_number {
    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = in.nextInt(), count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println(num +" is prime number");
//        } else {
//            System.out.println(num +" is not prime number");
//        }
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (int num = 0; num <= 100; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num + " is prime number");
            }
        }
    }
}

