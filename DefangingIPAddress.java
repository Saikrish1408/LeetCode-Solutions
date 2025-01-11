// https://leetcode.com/problems/defanging-an-ip-address/submissions/1505106129/

import java.util.Scanner;

public class DefangingIPAddressACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String address = scannerObject.nextLine();
        System.out.println(defangIPaddr(address));
        scannerObject.close();
    }

    public static String defangIPaddr(String address) {
        StringBuffer defangedAddress = new StringBuffer();
        for(int i = 0 ; i < address.length() ; i++) {
            if (address.charAt(i) == '.') {
                defangedAddress.append(Character.toString('['));
                defangedAddress.append(Character.toString('.'));
                defangedAddress.append(Character.toString(']'));
            } else {
                defangedAddress.append(Character.toString(address.charAt(i)));
            }
        }
        return defangedAddress.toString();
    }
}
