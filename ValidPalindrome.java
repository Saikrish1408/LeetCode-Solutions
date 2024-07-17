import java.util.Scanner;

public class ValidPalindromeACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input_string = scannerObject.nextLine();
        input_string = prepareTheString(input_string);
        System.out.println(isValidPalindrome(input_string));
        scannerObject.close();
    }

    public static String prepareTheString(String inputString) {
        StringBuffer finalModifiedString = new StringBuffer();
        inputString = inputString.toLowerCase();
        int i = 0, j = inputString.length() - 1;
        while(i < j) {
            if((inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') || (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9')) {
                finalModifiedString.append(inputString.charAt(i));
            }
        }
        return finalModifiedString.toString();
    }

    public static boolean isValidPalindrome(String toValidateString) {
        int i = 0, j = (toValidateString.length() - 1);
        while(i < j) {
            if(!(toValidateString.charAt(i) == toValidateString.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
