package Practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackExercise {

//    Basic1.Stack
    private List<Character> leftBrackets = Arrays.asList('(', '{', '<', '[');
    private List<Character> rightBracket = Arrays.asList(')', '}', ']', '>');

    public String reverse(String string){
        if (string == null)
            throw new IllegalStateException();
        Stack<Character> stack = new Stack<>();

        for (char ch: string.toCharArray())
            stack.push(ch);

        StringBuilder reverse = new StringBuilder();
        while (!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }

    public boolean isBalancedExpression(String expression){
        Stack<Character> stack = new Stack<>();
        for (char ch: expression.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.empty())
                    throw new IllegalStateException();
                var top = stack.pop();
                if (!isBracketMatch(ch, top))
                    return false;
            }
        }

        return stack.empty();
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isBracketMatch(char right, Character left) {
        return leftBrackets.indexOf(right) == rightBracket.indexOf(left);
    }

    private boolean areMatch(Character top, char ch) {
        return top == '(' && ch != ')' ||
                top == '{' && ch != '}' ||
                top == '[' && ch != ']' ||
                top == '<' && ch != '>';
    }

    private boolean isCloseBracket(char ch) {
        return ch == ')'
                || ch == '}'
                || ch == ']'
                || ch == '>';
    }

    private boolean isOpenBracket(char ch) {
        return ch == '('
                || ch == '{'
                || ch == '['
                || ch == '<';
    }
}
