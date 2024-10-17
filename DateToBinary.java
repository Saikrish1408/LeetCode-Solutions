// https://leetcode.com/problems/convert-date-to-binary/submissions/1422316437/

import java.util.Scanner;

public class DateToBinaryACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String date = scannerObject.nextLine();
        System.out.println(convertDateToBinary(date));
        scannerObject.close();
    }

    public static String convertDateToBinary(String date) {
        String[] splittingData = date.split("-");
        StringBuffer binaryDate = new StringBuffer();
        for(int i = 0 ; i < splittingData.length ; i++) {
            StringBuffer currentBinaryData = new StringBuffer();
            int intValue = Integer.parseInt(splittingData[i]), quotient = 2, reminder = 2;
            while(quotient >= 1) {
                quotient = (intValue / 2);
                reminder = (intValue % 2);
                intValue = quotient;
                currentBinaryData.append(reminder);
            }
            if(i != (splittingData.length - 1)) {
                binaryDate.insert(0, currentBinaryData);
                binaryDate.insert(0, "-");
            } else {
                binaryDate.insert(0, currentBinaryData);
            }
        }
        return binaryDate.reverse().toString();
    }
}
