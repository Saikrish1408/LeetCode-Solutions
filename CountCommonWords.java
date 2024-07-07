// https://leetcode.com/problems/count-common-words-with-one-occurrence/submissions/1311415615/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCommonWords {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(commonWords(words1, words2));
        scannerObject.close();
    }

    public static int commonWords(String[] words1, String[] words2) {
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        int commonWordsCount = 0;
        for(String string : words1)
            hashMap1.put(string, hashMap1.getOrDefault(string, 0) + 1);
        for(String string : words2)
            hashMap2.put(string, hashMap2.getOrDefault(string, 0) + 1);
        for(Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            if(entry.getValue() == 1 && hashMap2.containsKey(entry.getKey()) && (hashMap2.get(entry.getKey()) == 1)) {
                commonWordsCount++;
            }
        }
        return commonWordsCount;
    }
}
