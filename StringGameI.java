// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/submissions/1420125217/


import java.util.Scanner;

public class StringGameI {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int k = scannerObject.nextInt();
        System.out.println(kthCharacter(k));
        scannerObject.close();
    }

    public static char kthCharacter(int k) {
        StringBuffer word = new StringBuffer("a");
        while (word.length() <= k) {
            StringBuffer newWord = new StringBuffer();
            for(int i = 0 ; i < word.length() ; i++) {
                if(word.charAt(i) != 'z') {
                    newWord.append((char) (word.charAt(i) + 1));
                } else {
                    newWord.append("a");
                }
            }
            // System.out.println(newWord);
            word.append(newWord);
        }
        return word.charAt(k - 1);
    }
}
