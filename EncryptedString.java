// https://leetcode.com/problems/find-the-encrypted-string/submissions/1501429067/

import java.util.Scanner;

public class EncryptedStringACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        int k = scannerObject.nextInt();
        System.out.println(encryptedString(inputString, k));
        scannerObject.close();
    }

    public static String encryptedString(String mainString, int k) {
        if(mainString.length() == 1) {
            return mainString;
        } 
        StringBuffer encryptedString = new StringBuffer();
        int i = 0, count = 1, index = (i + 1);
        while(i < mainString.length() - 1) {
            count = 1;
            index = (i + 1);
            while(count < k) {
                if(index == mainString.length() - 1) {
                    count += 1;
                    index = 0;
                } else {
                    count += 1;
                    index += 1;
                }
            }
            if(count == k) {
                encryptedString.append(Character.toString(mainString.charAt(index)));
                i++;
            }
        }
        if(index == mainString.length() - 1) {
            encryptedString.append(Character.toString(mainString.charAt(0)));
        } else {
            encryptedString.append(Character.toString(mainString.charAt(index + 1)));
        }
        return encryptedString.toString();
    }
}
