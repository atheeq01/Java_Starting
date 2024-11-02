public class ArmstrongNumber100_999 {
    public static void main(String[] args) {
        int digit, sum ,num, temp;
        for(num=100;num<=999;num++) {
            temp = num;
            sum = 0;
            while (temp != 0) {
                digit = temp % 10;
                temp /= 10;
                sum += (int) Math.pow(digit, 3);
            }
            if (sum == num) {
                System.out.println(num + " is armstorngNumber. ");
            }
        }
    }
}
