import java.util.Scanner;
import java.util.HashSet;

public class LongestSubStringWithoutRepeated {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        System.out.println(longestSubStringWithoutRepeated(string));
        // bruteForce(string);
        scannerObject.close();
    }


    // brute force method to generate all the characters - give less priority to this!
    public static void bruteForce(String string) {
        int arr[] = new int[256];
        for(int i = 0 ; i < string.length() ; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for(int j = i ; j < string.length() ; j++) {
                if(arr[string.charAt(j)] >= 1) {
                    break;    
                } 
                stringBuffer.append(string.charAt(j));
                arr[string.charAt(j)]++;
                System.out.println(stringBuffer);
            }
        }   
    }

    public static int longestSubStringWithoutRepeated(String string) {
        if(string.startsWith(" ")) return 1;
        if(string.length() <= 1) return string.length();
        int maxLength = 0, left = 0, right = 0, length = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while(right < string.length()) {
            if(!(hashSet.contains(string.charAt(right)))) {
                hashSet.add(string.charAt(right));
                right++;
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = length - 1;
                hashSet.remove(string.charAt(left));
                left++;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}


// int n = s.length();
//         int maxLength = 0;
//         int[] lastSeen = new int[128];
        
//         int left = 0;
//         for (int right = 0; right < n; right++) {
//             char current = s.charAt(right);
//             left = Math.max(left, lastSeen[current]);
//             maxLength = Math.max(maxLength, right - left + 1);
//             lastSeen[current] = right + 1;
//         }
        
//         return maxLength;