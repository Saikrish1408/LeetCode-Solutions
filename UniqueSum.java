//   https://leetcode.com/problems/sum-of-unique-elements/submissions/1307399436/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueSum {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(uniqueSum(n, arr));
        scannerObject.close();
    }
    public static int uniqueSum(int n, int[] arr) {
        int sum = 0;
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for(int i : arr) {
            frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if(entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
