package stacks.InfixToPostfix;

public class InfixToPostfix {
    private static class Stack {
        private char[] elements;
        private int top;

        public Stack(int capacity) {
            elements = new char[capacity];
            top = -1;
        }

        public void push(char c) {
            elements[++top] = c;
        }

        public char pop() {
            return elements[top--];
        }

        public char peek() {
            return elements[top];
        }

        public boolean IsEmpty() {
            return top == -1;
        }
    }

    public static String infixToPostfix(String infix) {
        Stack stack = new Stack(infix.length());
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetter(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.IsEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.IsEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else if (isOperator(c)) {
                while (!stack.IsEmpty() && isOperator(stack.peek())
                        && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.IsEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static void main(String[] args) {
        String infix = "U * (I + N) / M ^ L - G";
        String postfix = infixToPostfix(infix);
        System.out.println("\nPostfix notation: " + postfix);
    }

}
