import java.util.Scanner;

public class ReverseVowelsInStringACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input_string = scannerObject.next();
        System.out.println(reverseVowels(input_string));
        scannerObject.close();
    }

    public static String reverseVowels(String string) {
        StringBuffer vowelString = new StringBuffer();
        StringBuffer modifiedString = new StringBuffer();
        for(int i = 0 ; i < string.length() ; i++) {
            if((string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') ||
                    (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'))
                vowelString.append(string.charAt(i));
        }
        int reverseIterator = vowelString.length() - 1;
        for(int i = 0 ; i < string.length() ; i++) {
            if((string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') ||
                    (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U')) {
                modifiedString.append(vowelString.charAt(reverseIterator--));
            } else {
                modifiedString.append(string.charAt(i));
            }
        }
        return modifiedString.toString();
    }
}
