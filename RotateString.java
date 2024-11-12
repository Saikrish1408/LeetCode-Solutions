// https://leetcode.com/problems/rotate-string/submissions/1449753265/?envType=daily-question&envId=2024-11-03

import java.util.Scanner;

public class RotateStringIACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String s = scannerObject.nextLine();
        String goal = scannerObject.nextLine();
        System.out.println(rotateString(s, goal));
        scannerObject.close();
    }

    public static boolean rotateString(String s, String goal) {
        StringBuffer updatingString = new StringBuffer(goal);
        if(s.length() != goal.length()) {
            return false;
        }
        int loopController = 0, accessingIndex = goal.length() - 1;
        while(loopController < goal.length()) {
            char replacingCharacter = updatingString.charAt(accessingIndex);
            updatingString.deleteCharAt(accessingIndex);
            updatingString.insert(0, replacingCharacter);
            if(s.equals(updatingString.toString())) {
                return true;
            }
            loopController++;
        }
        return false;
    }
}
