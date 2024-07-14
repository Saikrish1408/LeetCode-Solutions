// https://leetcode.com/problems/sum-multiples/submissions/1319747006/

public class SumOfMultiplesACCEPTED {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;
        while(n >= 1) {
            if(n%3 == 0 || n%5 == 0 || n%7 == 0)
                sum += n;
            n--;
        }
        return sum;
    }
}
