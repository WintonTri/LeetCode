package inprogress;

import java.util.Stack;

// Come back to this later
public class Question44 {

    public boolean isMatch(String s, String p) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> pStack = new Stack<>();

        // Pushing the chars into the stacks
        for (char c : s.toCharArray()) {
            sStack.push(c);
        }

        for (char c : p.toCharArray()) {
            pStack.push(c);
        }

        // TODO need to work on the *
        // determine how much to pop from sStack.
        while (!sStack.empty() && !pStack.empty()) {
            char pChar = pStack.pop();
            if (pChar == '*') {
                if (pStack.empty())
                    return true;

                pChar = pStack.pop();
                while (!sStack.empty()) {
                    boolean sameChar = sStack.pop() != pChar;
                    if (sameChar)
                        break;
                }

                continue;
            }

            char sChar = sStack.pop();
            if (pChar == '?')
                continue;

            if (sChar != pChar)
                return false;
        }

        return sStack.empty() && pStack.empty();
    }

}
