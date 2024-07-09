//  https://leetcode.com/problems/count-the-number-of-special-characters-i/submissions/1314314173/

import java.util.HashSet;
import java.util.Scanner;

public class SpecialCharacterACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        System.out.println(countSpecialCharacter(inputString));
        scannerObject.close();
    }

    public static int countSpecialCharacter(String inputString) {
        int count = 0;
        HashSet<Character> upperCaseSet = new HashSet<>();
        HashSet<Character> visited = new HashSet<>();
        for(int i = 0 ; i < inputString.length(); i++)
            upperCaseSet.add(inputString.charAt(i));
        if(upperCaseSet.isEmpty())
            return count;
        for(int i = 0 ; i < inputString.length() ; i++) {
            if(Character.isLowerCase(inputString.charAt(i)) && !visited.contains(inputString.charAt(i))){
                if(upperCaseSet.contains(Character.toUpperCase(inputString.charAt(i)))) {
                    count++;
                    visited.add(inputString.charAt(i));
                }
            }
        }
        return count;
    }
}
