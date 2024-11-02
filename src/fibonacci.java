import java.util.Scanner;

public class fibonacci {
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=-1,b=1,c,sum=0,num=scan.nextInt();
        for (int i=0;i<num;i++){
            sum=a+b;
            System.out.println("number : "+sum);
            a=b;
            b=sum;
        }
        System.out.println("Answer : "+sum);
    }
}
