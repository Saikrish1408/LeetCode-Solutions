import java.util.Scanner;

public class SearchInsertPositionACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        int target = scannerObject.nextInt();
        System.out.println(searchInsert(n, arr, target));
        scannerObject.close();
    }

    public static int searchInsert(int n, int[] arr, int target) {
        // Binary Search
        int l = 0, r = (n - 1);

        while(l <= r) {
            int mid = (l + r) / 2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                r = mid - 1;
            else if(arr[mid] < target)
                l = mid + 1;
        }
        if(arr[0] > target)
            return 0;
        for(int i = 0 ; i < (n - 1) ; i++) {
            if(arr[i] < target && arr[i + 1] > target) {
                return (i + 1);
            }
        }
        return n;
    }
}
