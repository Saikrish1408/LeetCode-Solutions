import java.util.Scanner;
import java.util.Arrays;


public class AssignCookies {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int gSize = scannerObject.nextInt();
        int sSize = scannerObject.nextInt();
        int[] g = new int[gSize];
        int[] s = new int[sSize];
        for(int i = 0 ; i < gSize ; i++)
            g[i] = scannerObject.nextInt();

        for(int i = 0 ; i < sSize ; i++)
            s[i] = scannerObject.nextInt();

        System.out.println(assigningCookie(g, s));
        scannerObject.close();
    }

    public static int assigningCookie(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, output = 0;
        for(int j = 0 ; j < s.length ; j++, i++) {
            if(i < g.length) {
                if(s[j] >= g[i]) {
                    output += 1;
                }
            }
            
        }
        return output;
    }
}
