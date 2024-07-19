import java.util.Scanner;

public class IndexOfTheOccurencesInStringACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String haystack = scannerObject.next();
        String needle = scannerObject.next();
        System.out.println(returningFirstOccurence(haystack, needle));
        scannerObject.close();
    }

    public static int returningFirstOccurence(String haystack, String needle) {
        int index = -1;
        index = haystack.indexOf(needle);
        return index;
    }
}
