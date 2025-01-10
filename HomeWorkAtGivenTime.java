// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/submissions/1504329075/

import java.util.Scanner;

public class HomeWorkAtGivenTimeACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] startTime = new int[n];
        for(int i = 0 ; i < n ; i++) {
            startTime[i] = scannerObject.nextInt();
        }
        int[] endTime = new int[n];
        for(int i = 0 ; i < n ; i++) {
            endTime[i] = scannerObject.nextInt();
        }
        int queryTime = scannerObject.nextInt();
        System.out.println(busyStudent(startTime, endTime, queryTime));
        scannerObject.close();
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        if(startTime.length == 1) {
            if(startTime[0] <= queryTime && endTime[0] >= queryTime) {
                return 1;
            } else {
                return 0;
            }
        }
        int countForHomeWorkDone = 0, iterator = 0;
        for(int i : endTime) {
            countForHomeWorkDone = (startTime[iterator++] <= queryTime && endTime[i] >= queryTime) ? countForHomeWorkDone += 1 : countForHomeWorkDone;
        }
        return countForHomeWorkDone;
        
    }

}
