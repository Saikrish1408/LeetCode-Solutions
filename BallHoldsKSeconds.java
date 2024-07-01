import java.util.Scanner;

public class BallsHoldK {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int k = scannerObject.nextInt();
        System.out.println(ballHolds(n, k));
        scannerObject.close();
    }
    public static int ballHolds(int n, int k) {
        int i = 0;
        boolean forward = true;
        boolean backward = false;
        while(k > 0) {
            if(forward)
                i++;
            else if(backward)
                i--;
            if(i == 0) {
                forward = true;
                backward = false;
            }
            if(i == n - 1) {
                backward = true;
                forward = false;
            }
            k--;
        }
        return i;
    }
