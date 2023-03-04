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

import prog2.prelim.FractionArithmetic;
import java.lang.*;
import javax.swing.*;

public class MixedFractionArithmetic extends FractionArithmetic {
    static String inputString = "";
    static String outputString = "";
    static double output = 0.0;

    /**
     * This part was made on 3 March 2023.
     * This part was made by ROXAS, Johan Rickardo
     * Main entry point of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // TO DO

        MixedFraction mixedFraction1 = new MixedFractionBuilder().setNumerator(0).setDenominator(1).createMixedFraction();
        MixedFraction mixedFraction2 = new MixedFractionBuilder().setNumerator(0).setDenominator(1).createMixedFraction();
        String choice = "";
        int userChoice = 0;

        showIntroduction();

        // mixedFraction1.

    } // end of main method

    // Hindi ko pa masiyado gets paano mag-inherit and override ng methods. - Johan

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
