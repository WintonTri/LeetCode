package complete;

// Valid -> 04/26/2022

/** Notes
 Nick White Solution: https://www.youtube.com/watch?v=9kmUaXrjizQ
 Learned this in a module from CS110C (C++)
 I did not know there was an existing stack class in java
 Stack<Character> stack = new Stack();
 TODO -> Redo using ^

 For higher efficiency in the general case I could have checked if the size
 of the string was an even number.
 */
public class Question20 { // EASY

    // First attempt
    public boolean isValid(String s) {
        String stack = "";
        for (char c : s.toCharArray()) {
            // Case is opening bracket char
            if (c == '(' || c == '{' || c == '[') {
                stack = stack.concat(Character.toString(c));
                continue;
            }

            // default case is closing bracket char
            if (stack.length() == 0)
                return false;

            // Checking the the last char in the stack is the correct closing bracket character
            String lastStackChar = stack.substring(stack.length() - 1);
            if (c == ')' && !lastStackChar.equals("("))
                return false;

            if (c == '}' && !lastStackChar.equals("{"))
                return false;

            if (c == ']' && !lastStackChar.equals("["))
                return false;

            // Remove to update the stack
            stack = stack.substring(0, stack.length() - 1);
        }
        return stack.length() == 0;
    }

}
