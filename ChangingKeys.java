//  https://leetcode.com/problems/number-of-changing-keys/submissions/1308460204/


import java.util.Scanner;

public class ChangingKeysACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        System.out.println(countOfKeys(string));
        scannerObject.close();
    }

    public static int countOfKeys(String string) {
        int count = 0;
        for(int i = 0 ; i < (string.length() - 1); i++) {
            if(string.charAt(i) != Character.toLowerCase(string.charAt(i + 1)) && string.charAt(i) != Character.toUpperCase(string.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }
}
