// https://leetcode.com/problems/find-the-original-typed-string-i/submissions/1437252328/

import java.util.Scanner;

public class OriginalTypedString {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.nextLine();
        System.out.println(possibleStringCount(string));
        scannerObject.close();
    }

    public static int possibleStringCount(String word) {
        int mistakenTimes = 1, i = 0;
        while (i < word.length() - 1) {
            int letterCount = 1;
            int j = (i + 1);
            while(j < word.length() && word.charAt(i) == word.charAt(j)) {
                letterCount++;
                j++;
            }
            i+=letterCount;
            mistakenTimes += (letterCount - 1);
        }
        return mistakenTimes;
    }
}
