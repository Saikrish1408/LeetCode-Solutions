// https://leetcode.com/problems/most-frequent-even-element/submissions/1498851563/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentEvenElementACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(mostFrequentEven(arr));
        scannerObject.close();
    }

    public static int mostFrequentEven(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr) {
            if(i % 2 == 0 || i == 0)
                hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        System.out.println(hashMap);
        if(hashMap.isEmpty()) {
            return -1;
        }   
        int largestFrequency = -1, largestValue = -1;    
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > largestFrequency) {
                largestFrequency = entry.getValue();
                largestValue = entry.getKey();
            } else if(entry.getValue() == largestFrequency) {
                largestValue = (largestValue > entry.getKey()) ? entry.getKey() : largestValue;
            }
        }
        return largestValue;
    }
}
