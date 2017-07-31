package com.company;

import java.util.Stack;

public class ReversePolishCalc {

    private Stack<Double> stackTop = new Stack();
    private String[] tokens;


    public double calculate(String input) {

        tokens = input.split(",");

        for (String token : tokens) {

            switch (token) {
                case "+":
                    System.out.println("Now adding");
                    stackTop.push(stackTop.pop() + stackTop.pop());
                    System.out.println();
                    System.out.println(stackTop);
                    break;

                case "-":
                    System.out.println("Now subtracting");
                    stackTop.push(-stackTop.pop() + stackTop.pop());
                    System.out.println(stackTop);
                    break;

                case "*":
                    System.out.println("Now multiplying");
                    stackTop.push(stackTop.pop() * stackTop.pop());
                    System.out.println(stackTop);
                    break;

                case "/":
                    System.out.println("Now dividing");
                    double divisor = stackTop.pop();
                    stackTop.push(stackTop.pop() / divisor);
                    System.out.println(stackTop);
                    break;

                default:
                    double dToken = Double.parseDouble(token);
                    stackTop.push(dToken);
                    break;
            }
        }
        System.out.println(stackTop);
        System.out.println("============================================");
        System.out.println("Your result is: " + stackTop.peek());
        return stackTop.peek();
    }
}


//public class ReversePolishCalc {
//    public int answer(String[] tokens) {
//        // You'll need a variable here to keep track of the top of the stack
//        // The stack
//            private Stack<Double> stackTop = new Stack();
//            private String[] tokens;
//
//        // The array of the input string split up
//            tokens = input.split(",");
//
//    public double calculate(String input) {
//        // 1. Use the String split method to split the string into tokens at the commas
//              tokens = input.split(",");
//
//
//        // 2. Allocate a stack as big as the number of tokens
//              for (String token : tokens) {
//
//
//           3. write the algorithm
//
//                                  System.out.println("Now adding");
//              stackTop.push(stackTop.pop() + stackTop.pop());
//                  break;
//                  case "-":
//                  System.out.println("Now subtracting");
//                  stackTop.push(-stackTop.pop() + stackTop.pop());
//                  break;
//                  case "*":
//                  System.out.println("Now multiplying");
//                  stackTop.push(stackTop.pop() * stackTop.pop());
//                  break;
//                  case "/":
//                  System.out.println("Now dividing");
//                  double divisor = stackTop.pop();
//                  stackTop.push(stackTop.pop() / divisor);
//                  break;
//              default:
//                  double dToken = Double.parseDouble(token);
//                  stackTop.push(dToken);
//                  break;
// }
// }
//        }
//        // 4. return the result
//              System.out.println("Your result is: " + stackTop.peek());
//              return stackTop.peek();
//    }
//
//    private void push(String number) {
//        // push on the stack
//    }
//
//    private void push(double d) {
//        // change the double to a string and then push it on the stack
//    }
//
//    private double pop() {
//        // remove the string from the top of the stack and convert it to a double and return it
//    }
//}
//}
//
