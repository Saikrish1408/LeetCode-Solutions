// https://leetcode.com/problems/button-with-longest-push-time/submissions/1494202623/

import java.util.Scanner;

public class LongestPushTimeACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[][] events = new int[n][2];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < 2 ; j++) {
                events[i][j] = scannerObject.nextInt();
            }
        }
        System.out.println(buttonWithLongestTime(events));
        scannerObject.close();
    }

    public static int buttonWithLongestTime(int[][] events) {
        int returningIndex = events[0][0], longestTimeToPush = events[0][1], i = 1, currentTimeToPush = Integer.MIN_VALUE;
        while(i < events.length) {
            currentTimeToPush = (events[i][1] - events[i - 1][1]);
            if(longestTimeToPush <= currentTimeToPush) {
                if(longestTimeToPush == currentTimeToPush) {
                    if(returningIndex > events[i][0]) {
                        returningIndex = events[i][0];
                    }
                } else {
                    longestTimeToPush = currentTimeToPush;
                    returningIndex = events[i][0];
                }
            }
            i++;
        }
        return returningIndex;
    }
}
