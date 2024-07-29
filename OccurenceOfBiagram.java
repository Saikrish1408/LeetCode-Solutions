import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OccurenceOfBigramACCEPTED {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String text = scannerObject.nextLine();
        String first = scannerObject.next();
        String second = scannerObject.next();
        String[] outputArr = findOcurrences(text, first, second);
        for(String str : outputArr)
            System.out.println(str);
        scannerObject.close();
    }

    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> outputArr = new ArrayList<>();
        int iterator = 0;
        String[] textSplit = text.split(" ");
        for(int i = 0 ; i < textSplit.length - 2 ; i++) {
            if(textSplit[i].equals(first) && textSplit[i + 1].equals(second)) {
                outputArr.add(textSplit[i + 2]);
            }
        }
        String[] returnVariable = Arrays.copyOf(outputArr.toArray(), outputArr.size(), String[].class);
        return returnVariable;
    }
}
