import java.util.Scanner;

public class SubarrayLessThanProdOfK {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerObject.nextInt();
        }
        int k = scannerObject.nextInt();
        System.out.println(numSubarrayProductLessThanK(arr, k));
        scannerObject.close();
    }

    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k == 0) {
            return 0;
        }
        int totalCount = 0;
        for(int i : arr) {
            totalCount = (i < k) ? ++totalCount : totalCount;
        }
        int left = 0, right = 1, product = arr[left];
        while(left < arr.length - 1) {
            if((product * arr[right]) < k) {
                System.out.println(arr[left] + " " + arr[right]);
                totalCount++;
                product = product * arr[right];
                if(right == arr.length - 1) {
                    left++;
                    right = left + 1;
                    product = arr[left];
                } else {
                    right++;
                }
            } else {
                left++;
                right = left + 1;
                product = arr[left];
            }
        }
        return totalCount;
    }
}

// Optimized

// public int numSubarrayProductLessThanK(int[] nums, int k) {
//     if (k <= 1) return 0;

//     int product = 1, left = 0, count = 0;

//     for (int right = 0; right < nums.length; right++) {
//         product *= nums[right];

//         while (product >= k) {
//             product /= nums[left];
//             left++;
//         }

//         count += (right - left + 1);
//     }

//     return count;
// }
