// https://leetcode.com/problems/keyboard-row/submissions/1333687211/
// Pushed...


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyBoardRow {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++)
            words[i] = scannerObject.next();
        String[] outputArray = findWords(words);
        for(String iterator : outputArray) {
            System.out.println(iterator);
        }
        scannerObject.close();
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> arrayList = new ArrayList<>();
        String keyboardFirstRow = "qwertyuiopQWERTYUIOP";
        String keyboardSecondRow = "asdfghjklASDFGHJKL";
        String keyboardThirdRow = "zxcvbnmZXCVBNM";
        HashMap<Integer, Integer> keyboardData = new HashMap<>();
        // Found the String's keyboard...
        for(int i = 0 ; i < words.length ; i++) {
            if(keyboardFirstRow.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1) {
                keyboardData.put(i, 1);
            } else if(keyboardSecondRow.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1) {
                 keyboardData.put(i, 2);
            } else if(keyboardThirdRow.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1) {
                keyboardData.put(i, 3);
            }
        }
        // Finding all the characters are present in same kayboard...
        for(Map.Entry<Integer, Integer> entry : keyboardData.entrySet()) {
            boolean found = true;
            if(entry.getValue() == 1) {
                for(int i = 0 ; i < words[entry.getKey()].length() ; i++) {
                    if(keyboardFirstRow.indexOf(words[entry.getKey()].charAt(i)) == -1) {
                       found = false;
                        break;
                    }
                }
                if(found)
                    arrayList.add(words[entry.getKey()]);
            } else if(entry.getValue() == 2) {
                for(int i = 0 ; i < words[entry.getKey()].length() ; i++) {
                    if(keyboardSecondRow.indexOf(words[entry.getKey()].charAt(i)) == -1) {
                        found = false;
                        break;
                    }
                }
                if(found)
                    arrayList.add(words[entry.getKey()]);
            } else if(entry.getValue() == 3) {
                for(int i = 0 ; i < words[entry.getKey()].length() ; i++) {
                    if(keyboardThirdRow.indexOf(words[entry.getKey()].charAt(i)) == -1) {
                        found = false;
                        break;
                    }
                }
                if(found)
                    arrayList.add(words[entry.getKey()]);
            }
        }
        String[] returningString = new String[arrayList.size()];
        int iterator = 0;
        for(String string : arrayList) {
            returningString[iterator++] = string;
        }
        return returningString;
    }
}
