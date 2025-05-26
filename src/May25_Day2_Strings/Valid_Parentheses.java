package May25_Day2_Strings;

import java.util.*;

public class Valid_Parentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string with brackets:");
        String input = sc.nextLine();
        // store ans
        boolean isValid = isValidParentheses(input);
        // Output result
        System.out.println("Is the input valid? " + isValid);
    }


    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
}
