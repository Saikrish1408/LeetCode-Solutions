//   https://leetcode.com/problems/maximum-height-of-a-triangle/submissions/1307318662/


import java.util.Scanner;

public class MaximumHeightOfTriangleACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int redBalls = scannerObject.nextInt();
        int blueBalls = scannerObject.nextInt();
        System.out.println(maxHeightOfTriangle(redBalls, blueBalls));
        scannerObject.close();
    }

    public static int maxHeightOfTriangle(int redBalls, int blueBalls) {
        int height, redBallsLocal = redBalls, blueBallsLocal = blueBalls;
        for(height = 1 ; ; ) {
            if(height%2 != 0) {
                blueBallsLocal = blueBallsLocal - height;
                if(redBallsLocal >= (height + 1))
                    height++;
                else if(redBallsLocal < (height + 1))
                    break;
            } else {
                redBallsLocal = redBallsLocal - height;
                if(blueBallsLocal >= (height + 1))
                    height++;
                else if(blueBallsLocal < (height + 1))
                    break;
            }
        }
        int height1 = redFirst(redBalls, blueBalls);
        return Math.max(height1, height);
    }

    public static int redFirst(int red, int blue) {
        int height;
        for(height = 1 ; ; ) {
            if(height%2 != 0) {
                red = red - height;
                if(blue >= (height + 1))
                    height++;
                else if(blue < (height + 1))
                    break;
            } else {
                blue = blue - height;
                if(red >= (height + 1))
                    height++;
                else if(red < (height + 1))
                    break;
            }
        }
        return height;
    }
}
