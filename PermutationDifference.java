//  https://leetcode.com/problems/permutation-difference-between-two-strings/submissions/1318593201/

import java.util.Scanner;

public class PermutationDifferenceACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String stringA = scannerObject.next();
        String stringB = scannerObject.next();
        System.out.println(findPermutationDifference(stringA, stringB));
        scannerObject.close();
    }

    public static int findPermutationDifference(String s, String t) {
        int permutationDifference = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            int j = 0;
            while(j < t.length()) {
                if(s.charAt(i) == t.charAt(j)) {
                    permutationDifference += Math.abs(i - j);
                    break;
                }
                j++;
            }
        }
        return permutationDifference;
    }
}
