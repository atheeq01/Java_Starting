import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
//        System.out.println("Enter the Number : ");
//        Scanner in = new Scanner(System.in);
//        int num=in.nextInt(),sum=0;
//
//        for (int i=1;i<num;i++){
//            if(num%i==0) {
//                sum+=i;
//            }
//        }
//        if(sum==num) {
//            System.out.println(num+" is perfect Number");
//        }
//        else{
//            System.out.println(num+" is not perfect Number");
//
//        }
        for (int j = 1; j <= 100; j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.out.println(j + " is perfect Number");
            }


        }

    }
}
