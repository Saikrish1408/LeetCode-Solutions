import java.util.Scanner;

public class DeleteOneElement {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scannerObject.nextInt();
        }
        System.out.println(longestSubarray(arr));
        scannerObject.close();
    }

    public static int longestSubarray(int[] arr ) {
        int maxLength = 0;
        int left = 0, right = 0, length = 0, zeroEncountered = 0;
        boolean notYetDeleted = true;
        while(right < arr.length) {
            if(arr[right] == 1) {
                length++;
                maxLength = Math.max(maxLength, length);
                right++;
            } else if(arr[right] == 0) {
                if(notYetDeleted) {
                    right++;
                    notYetDeleted = false;
                } else {
                    while(arr[left] != 0) {
                        left++;
                    }
                    notYetDeleted = true;
                    right = left;
                    length = 1;
                    zeroEncountered = 1;
                }
            } else {
                right++;
            }
        }
        if(zeroEncountered == 0) {
            return arr.length - 1;
        }
        return maxLength;
    }
}


// int maxLength = 0;
//         int left = 0, right = 0, length = 0;
//         while(right < arr.length) {
//             if(arr[right] == 1) {
//                 length++;
//                 maxLength = Math.max(maxLength, length);
//                 right++;
//             } else {
//                 right++;
//             }
//         }
//         return maxLength;