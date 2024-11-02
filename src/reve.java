import java.util.Scanner;

public class reve {
    public static void main(String[] agrs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enterr the number");
        int reverse_tot=0,reverse_num,num= scan.nextInt();
        while(num!=0){
            reverse_num=num%10;
            reverse_tot=(reverse_tot*10)+reverse_num;
            num/=10;
        }
        System.out.println("Reverse Answer : "+reverse_tot);
        scan.close();
    }
}
