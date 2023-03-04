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
 * The MixedFractionArithmetic Class.
 */
package prog2.midterm;

import prog2.prelim.Fraction;
import prog2.prelim.FractionArithmetic;
import prog2.prelim.NoDenominatorException;
import prog2.prelim.NoNumeratorException;

import java.lang.*;
import java.util.InputMismatchException;
import javax.swing.*;

public class MixedFractionArithmetic extends FractionArithmetic {
    static String inputString = ""; // static object for input
    static String outputString = ""; // static object for output
    static double output = 0.0; // static object of decimal output

    /**
     * This part was made on 3 March 2023.
     * This part was made by ROXAS, Johan Rickardo
     * Main entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // TO DO

        MixedFraction mixedFraction1 = new MixedFraction(0,new Fraction());
        MixedFraction mixedFraction2 = new MixedFraction(0,new Fraction());
        String choice = "";
        int userChoice = 0;

        showIntroduction(); // invokes a method that introduces the user to the program

        do {
            choice = showMenu();
            userChoice = convertChoices(choice);
            showUserChoice(userChoice);

            switch (userChoice) {
                case 1 ->
                    mixedFraction1 = fraction1();

                case 2 ->
                    mixedFraction2 = fraction2();

                case 3 -> {
                    outputString = mixedFraction1.add(mixedFraction2).toString();
                }
            } // end of switch-case

        } while (userChoice < 8);

    } // end of main method

    // Hindi ko pa masiyado gets paano mag-inherit and override ng methods. - Johan

    /**
     * This method was made on 4 March 2023.
     * Method made by ROXAS, Johan Rickardo
     * Overrides fraction1 method.
     * Instantiates a new MixedFraction named fraction1
     * @return fraction1 with whole number
     */
    public static MixedFraction fraction1() {
        MixedFraction fraction1;
        fraction1 = readFraction("Fraction 1");
        return fraction1;
    } // end of overridden fraction1 method

    /**
     * This method was made on 4 March 2023.
     * Method made by ROXAS, Johan Rickardo
     * Overrides fraction2 method from FractionArithmetic class.
     * Instantiates a new MixedFraction named fraction2
     * @return fraction2 with whole number
     */
    public static MixedFraction fraction2() {
        MixedFraction fraction2;
        fraction2 = readFraction("Fraction 2");
        return fraction2;
    } // end of overridden fraction2 method

    public static MixedFraction readFraction(String promptMessage) {
        MixedFraction mixedFraction = new MixedFraction(new Fraction());
        int wholeNumber = 0;

        try {
            wholeNumber = readWholeNumber("Whole number for " + promptMessage);
            mixedFraction.setWholeNumber(wholeNumber);
            mixedFraction.setNumerator(readNumerator(promptMessage));
            mixedFraction.setDenominator(readDenominator(promptMessage));
        } catch (NoNumeratorException | NoDenominatorException noNumerator) {
            mixedFraction = new MixedFraction(wholeNumber, new Fraction());
        } finally {
            System.out.println(promptMessage + ": " + mixedFraction);
        } // end of try-catch
        return mixedFraction;
    } // end of readFraction method

    /**
     * Reads and accepts user input of whole number of a given Mixed Fraction
     * Throws an exception when input is not an integer.
     * Input is rejected if it is less than zero.
     * @param promptMessage required user input of whole number
     * @return user input of whole number
     */
    protected static int readWholeNumber(String promptMessage) {
        JDialog.setDefaultLookAndFeelDecorated(true);
        boolean validValue = false;
        int wholeNumber = 0;

        while (!validValue) {
            try {
                inputString = JOptionPane.showInputDialog(null, promptMessage + ": ",
                        "Fraction Calculator" , JOptionPane.PLAIN_MESSAGE);
                wholeNumber = Integer.parseInt(inputString);
                if (wholeNumber < 0) {
                    outputString = "Invalid Input. Whole Number must not be negative.";
                    JOptionPane.showMessageDialog(null, outputString,
                            "Fraction Calculator" , JOptionPane.ERROR_MESSAGE);
                    validValue = false;
                } else
                    validValue = true;
            } catch (InputMismatchException exception) {
                outputString = "Invalid Input. Whole Number must be an integer.";
                JOptionPane.showMessageDialog(null, outputString,
                        "Fraction Calculator" , JOptionPane.ERROR_MESSAGE);
                validValue = false;
            } // end of try-catch
        } // end of while
        return wholeNumber;
    } // end of readWholeNumber method

    /**
     * Introduces the user to the program with its specifications.
     */
    static void showIntroduction() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        // first page
        outputString = """
                 Welcome to our Fraction Calculator by Group 9
                ------------------------------------------------------------------------------------------------- \s
                 Programmers:\s
                 -> RABANG, Gebreyl Isaac P.\s
                 -> RAGUDOS, Hannah T.\s
                 -> RAMOS, Jerwin Kyle R.\s
                 -> ROQUE, Rey Daniel L.\s
                 -> ROXAS, Johan Rickardo A.\s
                -------------------------------------------------------------------------------------------------\s
                 9301 CS 122 - Computer Programming 2\s
                 AY 2022-2023\s""";
        JOptionPane.showMessageDialog(null, outputString);
        // second page
        outputString = """
                This program will ask for your following inputs:\s
                Values enclosed in angle brackets (< >) are required values.
                Values enclosed in brackets ([ ]) are optional values.
                 Fraction 1:\s
                 -> [Whole Number]\s
                 -> <Numerator>\s
                 -> <Denominator>\s
                 Fraction 2:\s
                 -> [Whole Number]\s
                 -> <Numerator>\s
                 -> <Denominator>\s
                 This program will compute the following:\s
                 -> Sum of Fraction 1 and Fraction 2\s
                 -> Difference of Fraction 1 and Fraction 2\s
                 -> Product of Fraction 1 and Fraction 2\s
                 -> Quotient of Fraction 1 and Fraction 2\s""";
        JOptionPane.showMessageDialog(null, outputString);
    } // end of showIntroduction method


} // end of class MixedFractionArithmetic
