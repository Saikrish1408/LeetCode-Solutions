// https://leetcode.com/problems/plus-one/submissions/1369248547/


import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        // Implementation...
        int output[] = plusOne(n, arr);
        for(int i : output) {
            System.out.print(i + " ");
        }
        scannerObject.close();
    }

    public static int[] plusOne(int n, int[] arr) {
        if(n == 1) {
            if(arr[0] != 9) {
                arr[0] += 1;
                return arr;
            }
            return new int[] {1, 0};
        } else {
            if(arr[n - 1] != 9) {
                arr[n - 1] += 1;
            } else {
                arr[n - 1] = 0;
                boolean addingExtra = true;
                int iterator = n - 2;
                while(iterator > -1) {
                    if(arr[iterator] != 9) {
                        arr[iterator] += 1;
                        addingExtra = false;
                        return arr;
                    } else {
                        arr[iterator] = 0;
                    }
                    iterator--;
                }
                if(addingExtra) {
                    int[] newDigit = new int[n + 1];
                    newDigit[0] = 1;
                    for(int i = 1 ; i < n ; i++)
                        newDigit[i] = arr[i];

                    return newDigit;
                }
            }
        }
        return arr;
    }
}
