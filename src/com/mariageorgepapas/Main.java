package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;    // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =" + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =" + previousResult);   // the previousResult is still 3 because it was assigned on line 9

        result = result * 10;  // 2 * 10 = 20  the result is currently set to 2 from line 11
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4    the result is currently set to 20 from line 15
        System.out.println("20 / 5 = " + result);

        result = result % 3;  // the remainder of (4 % 3) result set from line 18
        System.out.println("4 % 3 = " + result);

    }
}
