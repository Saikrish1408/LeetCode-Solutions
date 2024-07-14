// https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/submissions/1321053747/


public class AcronymStringACCEPTED {
    public static void main(String[] args) {
        String[] words = {"alice", "bob", "charlie"};
        String acronym = "abc";
        System.out.println(isAcronymString(words, acronym));
    }
    // Make sure that you change the String[] words into the List<String> words in LeetCode Editor.

    
    public static boolean isAcronymString(String[] words, String acronym) {
        if(words.length != acronym.length())
            return false;
        for(int i = 0, j = 0 ; i < words.length ; i++, j++) {
            if(!(words[i].charAt(0) == acronym.charAt(j)))
                return false;
        }
        return true;
    }
}
