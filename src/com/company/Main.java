package com.company;
/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "3.2,24.2,-";
        expectedResult = -21.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "7.7,7.1,*";
        expectedResult = 54.67;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "9,4,/";
        expectedResult = 2.25;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        rpnExpression = "3,2,+,4,*,+,7,-";
        expectedResult = 15.25;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}

