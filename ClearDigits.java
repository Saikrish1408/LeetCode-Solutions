import java.util.Scanner;

public class ClearDigitsACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input_string = scannerObject.next();
        System.out.println(clearDigits(input_string));
        scannerObject.close();
    }

    public static String clearDigits(String string) {
        StringBuffer modifiedString = new StringBuffer(string);
        for (int i = 0; i < string.length(); i++) {
            if (modifiedString.charAt(i) >= '0' && modifiedString.charAt(i) <= '9') {
                if (i >= 1) {
                    modifiedString.deleteCharAt(i);
                    modifiedString.deleteCharAt(i - 1);
                    i = 0;
                }
            }
        }
        return modifiedString.toString();
    }
}
