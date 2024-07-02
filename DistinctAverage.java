import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctAverageACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(numberOfDistinct(n, arr));
        scannerObject.close();
    }

    public static int numberOfDistinct(int n, int[] arr) {
        HashSet<Float> distinctValues = new HashSet<>();
        Arrays.sort(arr);
        int low = 0, high = n - 1;
        while(low < high) {
            float average = (float) ((arr[low] + arr[high]) / 2.0);
            distinctValues.add(average);
            low++;
            high--;
        }
        return distinctValues.size();
    }
}
