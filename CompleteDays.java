import java.util.Scanner;

public class CompleteDaysACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scannerObject.nextInt();
        System.out.println(completedDays(n, arr));
        scannerObject.close();
    }
    // 2ms => Beats 98% of JAVA users
    public static int completedDays(int n, int[] arr) {
            int completedDaysCount = 0;
            if(n <= 2) {
                if((arr[0] + arr[1]) % 24 == 0) {
                    return 1;
                }
                return 0;
            }
            int i = 0;
            while(i < (n - 1)) {
                int j = (i + 1);
                while(j < n) {
                    if((arr[i] + arr[j]) % 24 == 0) {
                        completedDaysCount++;
                    }
                    j++;
                }
                i++;
            }

            return completedDaysCount;
    }
}


// 1ms

//    public int countCompleteDayPairs(int[] hours) {
//        int len = hours.length;
//        int[] counts = new int[24];
//        int ans=0;
//        for(int i=0; i<len; i++){
//            int rem = hours[i]%24;
//            if(rem==0) rem=24;
//            ans+=counts[24-rem];
//            counts[rem%24]++;
//        }
//        return ans;
//    }
