public class duplicateNumArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 5, 6, 7, 10, 10};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
             if(a[i]==a[j]&&(i!=j)){
                 System.out.println(i+" index and "+j+" index Duplicate ");
             }
            }
        }
    }
}
