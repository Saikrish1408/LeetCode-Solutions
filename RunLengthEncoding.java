import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(rle(inputString));
        scannerObject.close();
    }

    public static String rle(String string) {
        if(string.length() == 0) {
            return "";
        } else if(string.length() == 1) {
            return Character.toString(string.charAt(0)) + "1";
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prevChar = string.charAt(0);
        for(int i = 1 ; i < string.length() ; i++) {
            if(string.charAt(i) == prevChar) {
                count++;
            } else if(string.charAt(i) != prevChar){
                result.append(prevChar).append(count);
                prevChar = string.charAt(i);

                count = 1;
            }        
        }
        result.append(prevChar).append(count);
        return result.toString();
    }
}