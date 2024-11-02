import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int temp = num, digit, sum = 0;
        do {
            digit=temp%10;
            int sum_temp=1;
            for (int i = 1; i <= digit; i++) {
                sum_temp*=i;
            }
            System.out.println(sum_temp);
            sum+=sum_temp;
            temp/=10;
        }while (temp!=0);
        if(num==sum){
            System.out.println(num + " is strong Number");
        }else{
            System.out.println(num + " is not strong Number");
        }
    }
}
