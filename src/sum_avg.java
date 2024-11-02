import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the limit");
        int  tot=0,num=scan.nextInt();
        float avg;
        for (int i=0; i<=num ; i++){
            tot+=i;
        }
        avg= tot/(float)num;
        System.out.println("Total : "+tot);
        System.out.println("Average : "+avg);
        scan.close();
    }
}
