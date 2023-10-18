package JavaPractice;

import java.util.Stack;

public class ValidParenthices {
    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[(])}";
        System.out.println("Input 1 is valid: " + isValid(input1));

    }

    private static boolean isValid(String input1) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((top == '(' && c == ')') ||
                        (top == '{' && c == '}') ||
                        (top == '[' && c == ']')) {

                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
