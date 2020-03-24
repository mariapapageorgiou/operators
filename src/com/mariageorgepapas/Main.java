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


        // Abbreviating Operators

        // result = result + 1;
        result++;    // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // result = result - 1;
        result--;    // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result - 2;
        result -=2;  // 3 - 2 = 1
        System.out.println("3 - 2 = " + result);

        // result = result * 15;
        result *= 15; // 1 * 15 = 15
        System.out.println("1 * 15 = " + result);

        // result = result / 3;
        result /= 3; // 15 / 3 = 5
        System.out.println("15 / 3 = " + result);

        boolean isAlien = false;        // the = operator assigns the value false to the variable isAlien
        if (isAlien == false) {         // the == is testing to see whether the particular value is false
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than the second top score and less than 100");
        }

    }
}
