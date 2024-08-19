// https://leetcode.com/problems/snake-in-matrix/submissions/1361686416/

import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        String[] commands = {"DOWN", "RIGHT", "UP"};
        System.out.println(finalPositionOfSnake(n, commands));
        scannerObject.close();
    }

    public static int finalPositionOfSnake(int n, String[] commands) {
        int sum = 0;
        for(String stringIterator : commands) {
            switch (stringIterator) {
                case "UP" :
                    sum = sum - n;
                    break;
                case "RIGHT":
                    sum += 1;
                    break;
                case "DOWN":
                    sum = sum + n;
                    break;
                case "LEFT":
                    sum -= 1;
                    break;
            }
        }
        return sum;
    }
}
