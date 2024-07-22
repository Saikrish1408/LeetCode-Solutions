// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1329388112/

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringDistinctCharactersACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        System.out.println(lengthOfLongestSubString(inputString));
        scannerObject.close();
    }

    public static int lengthOfLongestSubString(String inputString) {
        if(inputString.length() == 1)
            return 1;
        int maxLength = 0, window = 1;
        for(int i = 0 ; i < inputString.length() - 1; i += 1) {
            int j = (i + 1);
            HashSet<Character> distinctCharacters = new HashSet<>();
            distinctCharacters.add(inputString.charAt(i));
            window = 1;
            while(j < inputString.length()) {
                if(!(distinctCharacters.contains(inputString.charAt(j)))) {
                    window++;
                    distinctCharacters.add(inputString.charAt(j));
                } else {
                    maxLength = Math.max(window, maxLength);
                    distinctCharacters.clear();
                    break;
                }
                j++;
            }
            maxLength = Math.max(window, maxLength);
            distinctCharacters.clear();
        }
        return maxLength;
    }
}
