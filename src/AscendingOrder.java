import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args){
        int[] a={7,1,4,54,69,-75,-65,51,25};
        System.out.println("Before Sort :"+ Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp =a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("After Sort :"+ Arrays.toString(a));

    }
}
