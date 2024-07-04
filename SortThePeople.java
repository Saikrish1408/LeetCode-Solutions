//   https://leetcode.com/problems/sort-the-people/submissions/1308473077/


import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class PeopleHeightSortACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] sortedNames = sortByHeight(names, heights);
        for(String string : sortedNames)
            System.out.print(string + " ");
        scannerObject.close();
    }

    public static String[] sortByHeight(String[] names, int[] heights) {
        String[] outputString = new String[names.length];
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        int i = 0;
        for(String stringIterator : names) {
            treeMap.put(heights[i], stringIterator);
            i++;
        }
        i = 0;
        for(Map.Entry<Integer, String> entry : treeMap.descendingMap().entrySet()) {
            outputString[i++] = entry.getValue();
        }
        return outputString;
    }
}
