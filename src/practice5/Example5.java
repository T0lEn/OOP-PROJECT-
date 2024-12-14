package practice5;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        double leftOperand, result, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter expressions: ");
        String input = in.nextLine();


        String[] expressions = input.split("\\s+");


        for (String expression : expressions) {
            tokenizer = new StringTokenizer(expression, "+-*/", true);

            try {

                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();


                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Left operand '" + leftString + "' is not a number.");
                    continue;
                }


                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Right operand '" + rightString + "' is not a number.");
                    continue;
                }


                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        if (rightOperand == 0) {
                            System.out.println("Cannot divide by zero in expression: " + expression);
                            continue;
                        }
                        result = leftOperand / rightOperand;
                        break;
                    default:
                        System.out.println("Unknown operator: " + operator);
                        continue;
                }


                System.out.println("Result of " + expression + ": " + result);

            } catch (NoSuchElementException nsee) {

                System.out.println("Invalid syntax in expression: " + expression);
            }
        }

        in.close();
    }
}
