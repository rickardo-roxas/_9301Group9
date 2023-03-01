/*
/**
 * Group 9
 * <p>
 *     RABANG, Gebreyl Isaac P.
 *     RAGUDOS, Hannah T.
 *     RAMOS, Jerwin Kyle R.
 *     ROQUE, Rey Daniel L.
 *     ROXAS, Johan Rickardo A.
 * </p>
 * The FractionArithmetic Class.
 * An executable class that computes the sum, difference, product, and quotient of two fractions.
 * Algorithm:
 * <p>
 *     Input: user choice, numerator, denominator
 *     Output: menu, sum, difference, product, quotient
 *     Process:
 *          1. Display an introduction to the program.
 *          2. Display menu
 *          3. Read/Accept user choice
 *              3.1.1. If user choice = 1
 *
 * </p>
 * Sample Run:
 * <p>
 *
 * </p>
 */
/*
  3.3.1. If fraction 1 != null && fraction 2 = null
                       Display prompt message
                        Go to 3.2
 *                  3.3.2. If fraction 1 = null && fraction 2 != null
 *                      Display prompt message
 *                      Go to 3.1
 *                  3.3.3. Else
 *                      Invoke add method
 *                      Repeat 2
 */
import javax.swing.*;
import java.util.Scanner;
import java.lang.*;

public class FractionArithmetic {

}
    //static Scanner keyboard = new Scanner(System.in);
    //static String inputString = "";
    // static String outputString = "";

    /**
     * Main entry point of the program.
     * @param args command line arguments.

    public static void main(String[] args) {
        int wholeNumVal = 0;
        Fraction fraction = new Fraction(wholeNumVal); //to access the operational methods of Fraction class
        Fraction toDouble = new Fraction(wholeNumVal); //to access toDouble method of Fraction class
        Fraction fraction1 = null;  //declares fraction1 and initializes it to value null
        Fraction fraction2 = null; //declares fraction2 and initializes it to value null
        int choice = 0;

        showIntroduction(); // invokes method to introduce the user to the program

        do {
            choice = showGUIMenu();

            switch (choice) {
                case 1:
                    fraction1 = fraction1(wholeNumVal);
                    break;
                case 2:
                    fraction2 = fraction2();
                    break;
                case 3:
                    fraction1.add(fraction2,wholeNumVal).toString();
                    fraction1.add(fraction2, wholeNumVal).toDouble();
                    break;
                case 4:
                    fraction1.subtract(fraction2, wholeNumVal).toString();
                    fraction1.subtract(fraction2, wholeNumVal).toDouble();
                    break;
                case 5:
                    fraction1.multiplyBy(fraction2, wholeNumVal). toString();
                    fraction2.multiplyBy(fraction2, wholeNumVal).toDouble();
                    break;
                case 6:
                    fraction1.divideBy(fraction2, wholeNumVal).toString();
                    fraction1.divideBy(fraction2, wholeNumVal).toDouble();
                    break;
                case 7:
                    fraction1.reduce(wholeNumVal);
                    fraction1.toDouble();
                    fraction2.reduce(wholeNumVal);
                    fraction2.toDouble();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,
                            "Thank you for using the Fraction Calculator!");
                    System.exit(0);
            } // end of switch-case
        } while (choice < 8); // end of do-while

        /*
        do {
            showGUIMenu();
            showMenu();

            choice = enterChoice(1, 8);
            switch (choice) {
                case 1:
                    System.out.println();
                    fraction1 = fraction1(wholeNumVal);
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();
                    keyboard.nextLine();

                    break;
                case 2:
                    System.out.println();
                    fraction2 = fraction2();
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();
                    keyboard.nextLine();

                    break;
                case 3:
                    // outputs the sum of the two fractions
                    System.out.println();
                    System.out.println("The sum of the two fractions are " + fraction1.add(fraction2, wholeNumVal).toString());
                    System.out.println("The reduced form is: " + fraction1.add(fraction2, wholeNumVal).toDouble());
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 4:
                    // outputs the difference of the two fractions
                    System.out.println();
                    System.out.println("The difference of the two fractions are " + "" + fraction1.subtract(fraction2, wholeNumVal).toString());
                    System.out.println("The reduced for is: "+ fraction1.subtract(fraction2, wholeNumVal).toDouble());
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 5:
                    // outputs the product of the two fractions
                    System.out.println();
                    System.out.println("The product of the two fractions are " + fraction1.multiplyBy(fraction2, wholeNumVal).toString());
                    System.out.println("The reduced form is: "+ fraction1.multiplyBy(fraction2, wholeNumVal).toDouble());
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 6:
                    // outputs the quotient of the two fractions
                    System.out.println();
                    System.out.println("The quotient of the two fractions are " + fraction1.divideBy(fraction2, wholeNumVal).toString());
                    System.out.println("The reduced form is: "+fraction1.divideBy(fraction2, wholeNumVal).toDouble());
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 7:
                    System.out.println();
                    //calls the method reduce() to reduce fraction1
                    fraction1.reduce(wholeNumVal);
                    System.out.println("The reduced form of " + fraction1 + " : " + fraction1.toDouble());
                    //calls method reduce() to reduce fraction2
                    fraction2.reduce(wholeNumVal);
                    System.out.println("The reduced form of " + fraction2 + ": " + fraction2.toDouble());
                    System.out.println();

                    System.out.println("Press enter to continue...");
                    keyboard.nextLine();

                    break;
                case 8:
                    System.out.println("Thank you for using the Fraction Calculator!");
                    System.exit(0);
            }
        } while (choice < 8);
         */
     // end of main method

    /*
    /**
     * Reads/Accepts the user input of choice.
     * @param min lowest possible input
     * @param max highest possible input
     * @return user input of choice
    public static int enterChoice(int min, int max) {
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("Input the number corresponding to your choice: ");
            choice = kbd.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " + min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    } // end of enterChoice method
     */

    /*
    /**
     * Displays an introduction of the program to the user.
     * Prompts the user to
    public static void showIntro() {
        System.out.println("+-------------------------------------------------- +");
        System.out.println("|                Welcome to our                     |");
        System.out.println("|              Fraction Calculator                  |");
        System.out.println("+-------------------------------------------------- +");
        System.out.println("             Press enter to continue...              ");
    }

    public static void showMenu() {
        System.out.println("+-------------------------------------------------- +");
        System.out.println("| What do you want to do?                           |");
        System.out.println("|        1. Enter the value of fraction 1           |");
        System.out.println("|        2. Enter the value of fraction 2           |");
        System.out.println("|        3. Add fractions                           |");
        System.out.println("|        4. Subtract fractions                      |");
        System.out.println("|        5. Multiply fractions                      |");
        System.out.println("|        6. Divide fractions                        |");
        System.out.println("|        7. Reduce fractions                        |");
        System.out.println("|        8. Quit                                    |");
        System.out.println("+-------------------------------------------------- +");
    }
     */

    /*
    /**
     * Reads/Accepts user input for fraction 1 with its numerator and denominator.
     * @param wholeNumVal default or user-defined fraction
     * @return user input of fraction 1

    public static Fraction fraction1(int wholeNumVal) {
        Fraction operand1;
        operand1 = enterFraction("fraction 1", wholeNumVal);
        // operand1.reduce();
        JOptionPane.showMessageDialog(null, "Fraction 1: " + operand1);
        // System.out.println("Fraction 1: " + operand1);
        return operand1;
    } // end of fraction1 method

    /**
     * Reads/Accepts user input for fraction 2 with its numerator and denominator.
     * @return user input of fraction 2

    public static Fraction fraction2() {
        Fraction operand2;
        int wholeNumVal = 0;
        operand2 = enterFraction("fraction 2", wholeNumVal);
        // operand2.reduce();
        JOptionPane.showMessageDialog(null, "Fraction 2: " + operand2);
        // System.out.println("Fraction 2: " + operand2);
        return operand2;
    } // end of fraction2 method

    /**
     * Read/Accepts user input of fraction with its numerator and denominator.
     * @param operand fraction 1 or fraction 2
     * @param wholeNumVal default or user-defined fraction
     * @return user input of fraction
     */
/*
    private static Fraction enterFraction(String operand, int wholeNumVal) {
        Fraction fraction = null;
        int numerator = 0, denominator;
        try {
            numerator = enterFractionData("numerator", operand);
            denominator = enterFractionData("denominator", operand);
            fraction = new Fraction(numerator, denominator);
        } catch (NoNumeratorException | NoDenominatorException noNumerator) {
            fraction = new Fraction(wholeNumVal);
        } finally {
            return fraction;
        } // end of try-catch
    } // end of enterFraction method
*/
    /*
    /**
     * Changes the value of the numerator or denominator of the fraction.
     * @param part numerator or denominator
     * @param fractionInfo fraction
     * @return user input of fraction numerator or denominator
     */
    /*
    private static int enterFractionData(String part, String fractionInfo) {
        // Scanner keyboard = new Scanner(System.in);
        int input;

        //changed as a method that uses a loop instead of recursion.
        do {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter " +
                        part + "of " + fractionInfo + ": "));
                // System.out.print("Enter " + part + " of " + fractionInfo + ": ");


                if (part.equalsIgnoreCase("denominator") && input == 0)
                    JOptionPane.showMessageDialog(null, "Entered denominator is zero." +
                            "Operations will be undefined. Enter a new one.");
                // System.out.println("Entered denominator is zero. Operations will be undefined. Enter a new one.");
            } catch (Exception exc) {
                if (part.equalsIgnoreCase("numerator")) {
                    throw new NoNumeratorException();
                } else {
                    try {
                        throw new NoDenominatorException();
                    } catch (NoDenominatorException e) {
                        throw new RuntimeException(e);
                    } // end of try-catch
                } // end of if-else
            } // end of try-catch
        } while (part.equalsIgnoreCase("denominator") && input == 0);//loop will continue until denominator becomes zero
        return input;
    } // end of enterFractionData method

} // end of class FractionArithmetic
*/
