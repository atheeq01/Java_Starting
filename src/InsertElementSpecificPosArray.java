import java.util.Arrays;

public class InsertElementSpecificPosArray {
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 8, 98, 54, 15, 23, 14};
        int index=2;
        int value=55;
        System.out.println("Before insert :"+ Arrays.toString(a));
        for(int i=(a.length)-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("after Sort :"+ Arrays.toString(a));

    }
}

