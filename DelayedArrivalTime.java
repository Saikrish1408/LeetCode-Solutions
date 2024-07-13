// https://leetcode.com/problems/calculate-delayed-arrival-time/submissions/1319752720/

public class DelayedArrivalTimeACCEPTED {
    public static void main(String[] args) {
        int arrivalTime = 13, delayedTime = 11;
        System.out.println(delayedTime(arrivalTime, delayedTime));
    }

    public static int delayedTime(int arrivalTime, int delayedTime) {
        if((arrivalTime + delayedTime) < 24) {
            return (arrivalTime + delayedTime);
        }
        return (arrivalTime + delayedTime) - 24;
    }
}
