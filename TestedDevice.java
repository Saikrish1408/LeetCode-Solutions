import java.util.Scanner;

public class TestedDeviceACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] batteryPercentage = new int[n];
        for (int i = 0; i < n; i++)
            batteryPercentage[i] = scannerObject.nextInt();
        System.out.println(countTestedDevice(n, batteryPercentage));
        scannerObject.close();
    }

    // 1ms => Beats 65%
    public static int countTestedDevice(int n, int[] batteryPercentage) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (batteryPercentage[i] > 0) {
                int j = i + 1;
                count++;
                while (j < n) {
                    batteryPercentage[j] = batteryPercentage[j] - 1;
                    j++;
                }
            }
        }
        return count;
    }
}
