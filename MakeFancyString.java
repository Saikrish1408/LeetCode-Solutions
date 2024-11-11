// https://leetcode.com/problems/delete-characters-to-make-fancy-string/submissions/1449729012/?envType=daily-question&envId=2024-11-01

import java.util.Scanner;

public class FancyStringLEETCODEISSUE {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(makeFancyString(inputString));
        scannerObject.close();
    }

    public static String makeFancyString(String s) {
        StringBuffer returningStringBuffer = new StringBuffer();
        int count = 1;
        returningStringBuffer.append(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++) {
            if(s.charAt(i) != returningStringBuffer.charAt(returningStringBuffer.length()-1)) {
                returningStringBuffer.append(s.charAt(i));
                count = 1;
            } else {
                if(returningStringBuffer.charAt(returningStringBuffer.length() - 1) == s.charAt(i) && count < 2) {
                    count += 1;
                    returningStringBuffer.append(s.charAt(i));
                } 
            }
        }
        return returningStringBuffer.toString();
    }
}
