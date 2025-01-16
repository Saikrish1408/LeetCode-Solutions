// https://leetcode.com/problems/decode-the-message/submissions/1510696453/?envType=problem-list-v2&envId=rizfikb1

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DecodeMessageACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String key = scannerObject.nextLine();
        String message = scannerObject.nextLine();
        System.out.println(decodeMessage(key, message));
        scannerObject.close();
    }

    public static String decodeMessage(String key, String message) {
        StringBuffer decodedString = new StringBuffer();
        char alphabets = 'a';
        LinkedHashMap<Character, Character> hashMap = new LinkedHashMap<>();
        for(int i = 0 ; i < key.length(); i++) {
            if(key.charAt(i) != ' ' && !hashMap.containsKey(key.charAt(i))) {
                hashMap.put(key.charAt(i), alphabets);
                System.out.println(hashMap);
                alphabets++;
                if(alphabets == '{') {
                    alphabets = 'a';
                }
            }
        }
        System.out.println(hashMap);
        for(int i = 0 ; i < message.length() ; i++) {
            if(message.charAt(i) == ' ') {
                decodedString.append(' ');
            } else {
                decodedString.append(hashMap.get(message.charAt(i)));
            }
        }
        return decodedString.toString();
    }
}
