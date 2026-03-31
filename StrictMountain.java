import java.util.Scanner;

public class StrickMountain {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = scannerObject.nextInt();
        System.out.println(strictMountain(arr));
        scannerObject.close();
    }

    public static boolean strictMountain(int[] arr) {
        boolean returningBoolean = false;
        if(arr.length <= 2) return false;
        for(int i = 1 ; i < arr.length; i++) {
            if(returningBoolean) return !returningBoolean;
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                //  backward
                returningBoolean = true;
                int backward = i - 1;
                while(backward > -1 && arr[i] > arr[backward]) {
                    backward--;
                }

                // forward
                while(i <= arr.length - 1 && arr[i] > arr[i + 1]) {
                    i++;
                    if(i == arr.length - 1) 
                        return returningBoolean;
                    
                }
            }
        }
        return returningBoolean;
    }
}
