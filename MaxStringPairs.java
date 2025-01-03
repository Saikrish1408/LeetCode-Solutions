// https://leetcode.com/problems/find-maximum-number-of-string-pairs/submissions/1324380517/

import java.util.Scanner;

public class MaxStringPairs {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        String[] stringArray = new String[n];
        for(int i = 0 ; i < n; i++)
            stringArray[i] = scannerObject.next();
        System.out.println(maximumNumberOfStringPairs(stringArray));
        scannerObject.close();
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int pairsCount = 0;
        for(int i = 0 ; i < (words.length - 1); i++) {
            int j = (i + 1);
            StringBuffer stringBuffer = new StringBuffer(words[i]);
            stringBuffer.reverse();
            while(j < words.length) {
                if(words[j].contentEquals(stringBuffer))
                    pairsCount++;
                j++;
            }
        }
        return pairsCount;
    }
}
