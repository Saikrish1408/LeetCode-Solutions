// https://leetcode.com/problems/find-indices-of-stable-mountains/submissions/1422334712/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndicesOfStableMountainACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int threshold = scannerObject.nextInt();
        int[] height = new int[n];
        for(int i = 0 ; i < n ; i++)
            height[i] = scannerObject.nextInt();
        List<Integer> output = stableMountains(height, threshold);
        System.out.println(output.toString());
        scannerObject.close();
    }

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> output = new ArrayList<>();
        for(int i = 1 ; i < height.length ; i++) {
            if(height[i - 1] > threshold) {
                output.add(i);
            }
        }
        return output;
    }
}
