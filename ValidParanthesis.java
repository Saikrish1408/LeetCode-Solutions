import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesisACCEPTED {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String string = scannerObject.next();
        System.out.println(validParanthesis(string));;
        scannerObject.close();
    }

    public static boolean validParanthesis(String string) {
        if(string.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.size() == 0 || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
