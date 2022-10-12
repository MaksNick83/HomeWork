package eu.hillel.hw15.service;

import java.util.Stack;

public class ValueConverter {

    public  String convertToPostfix(String expression) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> op = new Stack<Character>();
        char[] chars = expression.toCharArray();
        int N = chars.length;
        for (int i = 0; i < N; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch)) {
                while (Character.isDigit(chars[i])) {
                    sb.append(chars[i++]);
                }
                sb.append(' ');
            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    sb.append(op.pop()).append(' ');
                }
                op.pop();
            } else if (isOperator(ch)) {
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)) {
                    sb.append(op.pop()).append(' ');
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            sb.append(op.pop()).append(' ');
        }
        return sb.toString();
    }

    public int calculatePostfix(String strInf) {

        String[] strArr = strInf.split(" ");
        Stack<Integer> operands = new Stack<Integer>();

        for (String str : strArr) {
            if (str.trim().equals("")) {
                continue;
            }

            switch (str) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int right = operands.pop();
                    int left = operands.pop();
                    int value = 0;
                    switch (str) {
                        case "+":
                            value = left + right;
                            break;
                        case "-":
                            value = left - right;
                            break;
                        case "*":
                            value = left * right;
                            break;
                        case "/":
                            value = left / right;
                            break;
                        default:
                            break;
                    }
                    operands.push(value);
                    break;
                default:
                    operands.push(Integer.valueOf(str));
                    break;
            }
        }
        return operands.pop();
    }

    private  boolean isOperator(char ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }

    private  int priority(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

}
