/**
 * Group 9
 * Class Code and Course Number: 9301 - CS 122
 * Schedule: TF 9:00 - 10:30 AM
 * <p>
 *     RABANG, Gebreyl Isaac P.
 *     RAGUDOS, Hannah T.
 *     RAMOS, Jerwin Kyle R.
 *     ROQUE, Rey Daniel L.
 *     ROXAS, Johan Rickardo A.
 * </p>
 * The FractionArithmetic Class.
 * An executable class that computes the sum, difference, product, and quotient of two fractions.
 * This executable class uses a graphical user interface using JOptionPane.
 * Algorithm:
 * <p>
 *     Input: user choice, numerator, denominator
 *     Output: introduction, menu, sum, difference, product, quotient
 *     Process:
 *          1. Display an introduction to the program.
 *          <p>
 *              Welcome to our Fraction Calculator by Group 9
 *              Programmers:
 *                  RABANG, Gebreyl Isaac P.
 *                  RAGUDOS, Hannah T.
 *                  RAMOS, Jerwin Kyle R.
 *                  ROQUE, Rey Daniel L.
 *                  ROXAS, Johan Rickardo A.
 *              9301 CS 122 - Computer Programming 2
 *              AY 2022-2023
 *          </p>
 *          <p>
 *              This program will ask for your following inputs:
 *                  Fraction 1:
 *                      Numerator
 *                      Denominator
 *                  Fraction 2:
 *                      Numerator
 *                      Denominator
 *              This program will compute the following:
 *                  Sum of Fraction 1 and Fraction 2
 *                  Difference of Fraction 1 and Fraction 2
 *                  Product of Fraction 1 and Fraction 2
 *                  Quotient of Fraction 1 and Fraction 2
 *          </p>
 *          2. Display Menu
 *          <p>
 *              1. Enter the value of Fraction 1
 *              2. Enter the value of Fraction 2
 *              3. Add Fractions
 *              4. Subtract Fractions
 *              5. Multiply Fractions
 *              6. Divide Fractions
 *              7. Quit
 *          </p>
 *          3. Read/Accept user choice
 *              3.1. If user choice = 1
 *                  Invoke readFraction method
 *                  Repeat 2
 *              3.2. If user choice = 2
 *                  Go to 4
 *                  Repeat 2
 *              3.3. If user choice = 3
 *                  3.3.1. If fraction 1 != null && fraction 2 = null
 *                      Display prompt message
 *                      Go to 3.2
 *                  3.3.2. If fraction 1 = null && fraction 2 != null
 *                      Display prompt message
 *                      Go to 3.1
 *                  3.3.3. Else
 *                      Invoke add method
 *                      Repeat 2
 *              3.4. If user choice = 4
 *                  3.4.1. If fraction 1 != null && fraction 2 = null
 *                      Display prompt message
 *                      Go to 3.2
 *                  3.4.2. If fraction 1 = null && fraction 2 != null
 *                      Display prompt message
 *                      Go to 3.1
 *                  3.4.3. Else
 *                      Invoke subtract method
 *                      Repeat 2
 *              3.5. If user choice = 5
 *                  3.5.1. If fraction 1 != null && fraction 2 = null
 *                      Display prompt message
 *                      Go to 3.2
 *                  3.5.2. If fraction 1 = null && fraction 2 != null
 *                      Display prompt message
 *                      Go to 3.1
 *                  3.5.3. Else
 *                      Invoke multiplyBy method
 *                      Repeat 2
 *              3.6. If user choice = 6
 *                  3.6.1. If fraction 1 != null && fraction 2 = null
 *                      Display prompt message
 *                      Go to 3.2
 *                  3.6.2. If fraction 1 = null && fraction 2 != null
 *                      Display prompt message
 *                      Go to 3.1
 *                  3.6.3. Else
 *                      Invoke divideBy method
 *                      Repeat 2
 *              3.7. If user choice = 7
 *                  Display prompt message
 *                  Close application
 *      4. readFraction method
 *          4.1. Go to 5
 *          4.2. Go to 6
 *      5. readNumerator method
 *          // TO DO
 * </p>
 * Sample Run
 * <p>
 *  // TO DO
 * </p>
 */
package prelim;

import javax.swing.*;
import java.lang.*;

public class FractionArithmetic {
    static String inputString = ""; // static object for input
    static String outputString = ""; // static object for output
    static double output = 0.0; // static object of output

    /**
     * Main entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(); // instantiates fraction1 with default attribute values
        Fraction fraction2 = new Fraction(); // instantiates fraction2 with default attribute values
        String choice = "";
        int userChoice = 0;

        showIntroduction();

        do {
            choice = showMenu();
            userChoice = convertChoices(choice);
            System.out.println("User choice: " + userChoice);

            switch (userChoice) {
                case 1:
                    fraction1 = fraction1();
                    break;
                case 2:
                    fraction2 = fraction2();
                    break;
                case 3:
                    outputString = fraction1.add(fraction2).toString();
                    displayFraction(outputString, "Sum in Simplified Fraction Form");
                    output = fraction1.add(fraction2).toDouble();
                    displayDecimal(output, "Sum in Decimal Form");
                    showSolution(fraction1, fraction2, "+","Sum", outputString, output);
                    break;
                case 4:
                    outputString = fraction1.subtract(fraction2).toString();
                    displayFraction(outputString, "Difference in Simplified Fraction Form");
                    output = fraction1.subtract(fraction2).toDouble();
                    displayDecimal(output, "Difference in Decimal Form");
                    showSolution(fraction1, fraction2, "-","Difference", outputString, output);
                    break;
                case 5:
                    outputString = fraction1.multiplyBy(fraction2).toString();
                    displayFraction(outputString, "Product in Simplified Fraction Form");
                    output = fraction1.multiplyBy(fraction2).toDouble();
                    displayDecimal(output, "Product in Simplified Form");
                    showSolution(fraction1, fraction2, "x","Product", outputString, output);
                    break;
                case 6:
                    outputString = fraction1.divideBy(fraction2).toString();
                    displayFraction(outputString, "Quotient in Simplified Fraction Form");
                    output = fraction2.multiplyBy(fraction2).toDouble();
                    displayDecimal(output, "Quotient in Decimal Form");
                    showSolution(fraction1, fraction2, "/","Quotient", outputString, output);
                    break;
                case 7:
                    outputString = fraction1.reduce().toString();
                    displayFraction(outputString, "Reduced Fraction 1 in Simplified Fraction Form");
                    output = fraction1.reduce().toDouble();
                    displayDecimal(output, "Reduced Fraction 1 in Decimal Form");
                    outputString = fraction2.reduce().toString();
                    displayFraction(outputString, "Reduced Fraction 2 in Simplified Fraction Form");
                    output = fraction2.reduce().toDouble();
                    displayDecimal(output, "Reduced Fraction 2 in Decimal Form");
                    break;
                case 8:
                    showOutro();
                    System.exit(0);
                    break;
                default:
                    fraction1 = fraction1();
                    break;
            } // end of switch-case
        } while (userChoice < 8);
    } // end of main method

    /**
     * Instantiates a new Fraction named fraction1
     * @return fraction1
     */
    public static Fraction fraction1() {
        Fraction fraction1;
        fraction1 = readFraction("Fraction 1");
        return fraction1;
    } // end of fraction1 method

    /**
     * Instantiates a new Fraction named fraction2
     * @return fraction2
     */
    public static Fraction fraction2() {
        Fraction fraction2;
        fraction2 = readFraction("Fraction 2");
        return fraction2;
    } // end of fraction2 method

    /**
     * Reads and accepts the state of instantiated Fraction attributes
     * @param promptMessage Fraction object (Fraction1 or Fraction2)
     * @return new Fraction object
     */
    protected static Fraction readFraction(String promptMessage) {
        Fraction fraction = new Fraction();
        int numerator = 0; // holds the value of numerator of Fraction
        int denominator = 0; // holds the value of denominator of Fraction

        try {
            numerator = readNumerator("Numerator for " + promptMessage);
            fraction.setNumerator(numerator);
            denominator = readDenominator("Denominator for " + promptMessage);
            fraction.setDenominator(denominator);
        } catch (NoNumeratorException | NoDenominatorException noNumerator) {
            fraction = new Fraction(); // instantiates new Fraction with default values
        } finally {
            System.out.println(promptMessage + ": " + fraction);
            return fraction;
        } // end of try-catch
    } // end of readFraction method

    /**
     * Reads and accepts user input of numerator of a given Fraction
     * @param promptMessage required user input of numerator
     * @return user input of numerator
     */
    protected static int readNumerator(String promptMessage) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        int numerator = 0;

        inputString = JOptionPane.showInputDialog(null, promptMessage + ": ",
                "Fraction Calculator" , JOptionPane.PLAIN_MESSAGE);
        numerator = Integer.parseInt(inputString);

        return numerator;
    } // end of readNumerator method

    /**
     * Reads and Accepts user input of denominator of a given Fraction
     * @param promptMessage required user input of denominator
     * @return user input of denominator
     */
    protected static int readDenominator(String promptMessage) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        int denominator = 0;

        inputString = JOptionPane.showInputDialog(null, promptMessage + ": ",
                "Fraction Calculator" , JOptionPane.PLAIN_MESSAGE);
        denominator = Integer.parseInt(inputString);

        return denominator;
    } // end of readDenominator method

    /**
     * Displays the fraction
     * @param fraction given Fraction
     * @param promptMessage type of output
     */
    protected static void displayFraction(String fraction, String promptMessage) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        JOptionPane.showMessageDialog(null, promptMessage + ": \n " + fraction,
                "Fraction Calculator", JOptionPane.INFORMATION_MESSAGE);
    } // end of showFraction method

    /**
     * Displays the decimal
     * @param decimal given Fraction converted to decimal
     * @param promptMessage type of output
     */
    protected static void displayDecimal(double decimal, String promptMessage) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        JOptionPane.showMessageDialog(null, promptMessage + ": \n" + decimal,
                "Fraction Calculator", JOptionPane.INFORMATION_MESSAGE);
    } // end of displayDecimal method

    /**
     * Introduces the user to the program
     */
    private static void showIntroduction() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        // first page
        outputString = """
                 Welcome to our Fraction Calculator by Group 9
                -------------------------------------------- \s
                 Programmers:\s
                 \t\tRABANG, Gebreyl Isaac P.\s
                 \t\tRAGUDOS, Hannah T.\s
                 \t\tRAMOS, Jerwin Kyle R.\s
                 \t\tROQUE, Rey Daniel L.\s
                 \t\tROXAS, Johan Rickardo A.\s
                --------------------------------------------\s
                 9301 CS 122 - Computer Programming 2\s
                 AY 2022-2023\s""";
        JOptionPane.showMessageDialog(null, outputString);
        // second page
        outputString = """
                This program will ask for your following inputs:\s
                 Fraction 1:\s
                 \t\tNumerator\s
                 \t\tDenominator\s
                 Fraction 2:\s
                 \t\tNumerator\s
                 \t\tDenominator\s
                 This program will compute the following:\s
                 \t\tSum of Fraction 1 and Fraction 2\s
                 \t\tDifference of Fraction 1 and Fraction 2\s
                 \t\tProduct of Fraction 1 and Fraction 2\s
                 \t\tQuotient of Fraction 1 and Fraction 2\s""";
        JOptionPane.showMessageDialog(null, outputString);
    } // end of showIntroduction method

    /**
     * Displays a "Thank You" message upon exit of application.
     */
    private static void showOutro() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        outputString = "Thank you for using the Fraction Calculator!";
        JOptionPane.showMessageDialog(null, outputString, "Fraction Calculator" ,
                JOptionPane.INFORMATION_MESSAGE);
    } // end of showOutro method

    /**
     * Displays the menu of possible user options.
     * Options are enumerated.
     * userChoices can be accessed using a dropdown menu.
     * userChoice[1] is the default value.
     * @return element of user choice
     */
    private static String showMenu() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        String[] options = {"1","2","3","4","5","6","7","8"};
        int[] userChoices = {1,2,3,4,5,6,7,8};
        int input = 0;
        outputString = """
                1. Enter the value of Fraction 1
                2. Enter the value of Fraction 2
                3. Add Fractions
                4. Subtract Fractions
                5. Multiply Fractions
                6. Divide Fractions
                7. Reduce a fraction
                8. Quit""";
        inputString = (String) JOptionPane.showInputDialog(null,
                outputString, "Fraction Calculator",
                JOptionPane.QUESTION_MESSAGE, null, options, userChoices[1]);
        return inputString;
    } // end of showMenu method

    /**
     * Converts the userChoice of array to an integer to be used in the main method.
     * @param givenChoice choice (String)
     * @return choice (integer)
     */
    private static int convertChoices(String givenChoice) {
        int choice = 0;
        choice = Integer.valueOf(givenChoice);
        return choice;
    } // end of convertChoices method

    /**
     * Displays the solution in the console.
     */
    protected static void showSolution(Fraction operand1, Fraction operand2, String operation, String promptMessage,
                                       String answerFraction, double answerDecimal) {
        System.out.printf("%-20s %-5s %-20s %n" , "Fraction 1" , "" , "Fraction 2");
        System.out.printf("%-20s %-5s %-20s %n" , operand1.toString() , operation , operand2.toString());
        System.out.printf("%-20s %-5s %-20f %n" , answerFraction , "or" , answerDecimal);
    } // end of showSolution method
} // end of class FractionArithmetic