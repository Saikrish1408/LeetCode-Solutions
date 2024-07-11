// https://leetcode.com/problems/number-of-employees-who-met-the-target/submissions/1317700925/

public class EmployeeTargetACCEPTED {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int no_of_employees = 0;
        for(int i : hours) {
            if(i >= target)
                no_of_employees++;
        }
        return no_of_employees;
    }
}
