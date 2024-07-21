// https://leetcode.com/problems/find-words-containing-character/submissions/1328558476/

import java.util.ArrayList;

public class WordContainingCharacter {
    public static void main(String[] args) {
        String[] array = {"leet", "code"};
        char x = 'e';
        ArrayList<Integer> outputList = findWordsContaining(array, x);
    }

    public static ArrayList<Integer> findWordsContaining(String[] array, char x) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int j = 0 ;  j < array.length ; j++) {
            for(int i = 0 ; i < array[j].length() ; i++) {
                if(array[j].charAt(i) == x) {
                    indices.add(j);
                }
            }
        }
        return indices;
    }
}
