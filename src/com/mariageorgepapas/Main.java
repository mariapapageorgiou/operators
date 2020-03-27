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

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {     // && is the Logical AND operator, both of the conditions need to be true
            System.out.println("Greater than the second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {           // || is the Logical OR operator, either or both of the conditions need to be true
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {                   // assignment operator = vs equals to operator ==
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {                   // ! is the NOT operator, aka Logical Complement operator
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;    // ?: is the Ternary operator
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operators Challenge
        // 1. Create a double variable with a value of 20.00
        double firstValue = 20.00d;
        // 2. Create a second variable of type double with the value 80.00
        double secondValue = 80.00d;
        // 3. Add both numbers together and multiply by 100.00
        double totalValue = (firstValue + secondValue) * 100.00;
        System.out.println("totalValue = " + totalValue);
        // 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00 is.
        double remainder = totalValue % 40.00d;
        System.out.println("remainder = " + remainder);
        // 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, false if it's not zero.
        boolean isRemainderZero = remainder == 0 ? true : false;
        // 6. Output the boolean variable.
        System.out.println("isRemainderZero = " + isRemainderZero);
        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        //    Be surprised if you see output for this step, where you might expect it not to show.
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}
