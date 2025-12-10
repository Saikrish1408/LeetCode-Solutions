import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(stringCompression(inputString));
        scannerObject.close();
    }

    public static String stringCompression(String string) {
        if(string.length() == 0) {
            return "";
        } else if(string.length() == 1) {
            return Character.toString(string.charAt(0));
        }
        StringBuilder returningString = new StringBuilder();
        char previousCharacter = string.charAt(0);
        int characterCount = 0;
        for(int left = 0 ; left < string.length() ; left++) {
            if(string.charAt(left) == previousCharacter) {
                characterCount++;
                previousCharacter = string.charAt(left);
            } else {
                if(characterCount > 1) {
                    returningString.append(previousCharacter);
                    returningString.append(characterCount);
                    characterCount = 1;
                    previousCharacter = string.charAt(left); 
                } else {
                    returningString.append(previousCharacter);
                    previousCharacter = string.charAt(left);
                }
            }
            if(left == string.length() - 1 && characterCount > 1) {
                returningString.append(previousCharacter);
                returningString.append(characterCount);
            } else if(left == string.length() - 1 && characterCount == 1) {
                returningString.append(previousCharacter);
            }
        } 
        return returningString.toString();
    }
}