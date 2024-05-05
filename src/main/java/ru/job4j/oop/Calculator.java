package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int m) {
        return x - m;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int s) {
        return sum(s) + multiply(s) + multiply(s) + divide(s);
    }

    public static void main(String[] args) {
        int resultSum = sum(10);
        System.out.println("sum is " + resultSum);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(2);
        System.out.println("multiply is " + resultMultiply);
        int resultMinus = minus(3);
        System.out.println("minus is " + resultMinus);
        int resultDivide = calculator.divide(10);
        System.out.println("divide is " + resultDivide);
        int resultSumAll = calculator.sumAllOperation(5);
        System.out.println("sumAllOperation is " + resultSumAll);
    }
}