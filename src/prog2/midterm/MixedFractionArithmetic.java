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
import java.lang.*;
import java.util.Scanner;
import javax.swing.*;

public class MixedFractionArithmetic extends FractionArithmetic {
         try {
        int num, denom, whole;
        MixedFraction fraction = null, f2 = null, mixedFraction;
        Fraction fraction1 = null, fraction2 = null, mixedFraction;
        Scanner sc = new Scanner(System.in); //scanner object
        int ch;
        while (true) {
            //display menu
            System.out.println("==================================");
            System.out.println("Fraction/Mixed Fractions Menu:n");
            System.out.println("1. Add Mixed Fractions.n");
            System.out.println("2. Subtract Mixed Fractions.n");
            System.out.println("3. Multiply Mixed Fractions.n");
            System.out.println("4. Divide Mixed Fractions.n");
            System.out.println("5. Add Fractions.n");
            System.out.println("6. Subtract Fractions.n");
            System.out.println("7. Multiply Fractions.n");
            System.out.println("8. Divide Fractions.n");
            System.out.println("9. Quit.n");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt(); //get user choice
            if (ch == 9)
                break; //choice to quit
            if (ch >= 5 && ch <= 8) {
                //get first fraction
                System.out.println("...............................");
                System.out.println("ENTER THE FIRST FRACTION");
                System.out.print("Numerator of the fraction : ");
                int numerator = sc.nextInt();
                System.out.print("Denominator of the fraction: ");
                int denominator = sc.nextInt();
                fraction1 = new Fraction(numerator, denominator); //create Fraction object
                System.out.println("...............................");
                //get second fraction
                System.out.println("ENTER THE SECOND FRACTION");
                System.out.print("Numerator of the fraction : ");
                int numerator = sc.nextInt();
                System.out.print("Denominator of the fraction: ");
                int denominator = sc.nextInt();
                fraction2 = new Fraction(numerator, denominator); //create Fraction object
            } else {
                //get first MixedFraction
                System.out.println("...............................");
                System.out.println("ENTER THE FIRST MixedFraction");
                System.out.print("Whole of the MixedFraction : ");
                int wholeNumber = sc.nextInt();
                System.out.print("Numerator of the MixedFraction : ");
                int numerator = sc.nextInt();
                System.out.print("Denominator of the MixedFraction: ");
                int denominator = sc.nextInt();
                fraction1 = new MixedFraction(wholeNumber, numerator, denominator); //create MixedFraction object
                System.out.println("...............................");
                //get second MixedFraction
                System.out.println("ENTER THE SECOND MixedFraction");
                System.out.print("Whole of the MixedFraction : ");
                wholeNumber = sc.nextInt();
                System.out.print("Numerator of the MixedFraction : ");
                numerator = sc.nextInt();
                System.out.print("Denominator of the MixedFraction: ");
                denominator = sc.nextInt();
                fraction2 = new MixedFraction(wholeNumber, numerator, denominator); //create MixedFraction object
            }
            switch (ch) {
                case 1:
                    System.out.println("*****ANSWER*****");
                    //addition of two MixedFractions
                    mixedFraction = fraction1.add(fraction2); //add
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" + ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 2:
                    System.out.println("*****ANSWER*****");
                    //subtraction of MixedFractions
                    mixedFraction = ((MixedFraction) fraction1).subtract(fraction2); //subtract
                    //print result
                    //f3.reduce();
                    System.out.print(fraction1);
                    System.out.print(" - ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 3:
                    System.out.println("*****ANSWER*****");
                    //multiplication of MixedFractions
                    mixedFraction = ((MixedFraction) fraction1).multiplyBy(fraction2); //multiply
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" * ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 4:
                    System.out.println("*****ANSWER*****");
                    //division of MixedFractions
                    mixedFraction = fraction1.divideBy(fraction2); //divide
                    //f3.reduce(); //reduce
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" / ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 5:
                    System.out.println("*****ANSWER*****");
                    //addition of two fractions
                    mixedFraction = fraction1.add(fraction2); //add
                    mixedFraction.reduce(); //reduce
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" + ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 6:
                    System.out.println("ANSWER");
                    //subtraction of fractions
                    mixedFraction = fraction1.subtract(fraction2); //subtract
                    //print result
                    mixedFraction.reduce();
                    System.out.print(fraction1);
                    System.out.print(" - ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 7:
                    System.out.println("*****ANSWER*****");
                    //multiplication of fractions
                    mixedFraction = fraction1.multiplyBy(fraction2); //multiply
                    mixedFraction.reduce(); //reduce
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" * ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
                case 8:
                    System.out.println("*****ANSWER*****");
                    //division of fractions
                    mixedFraction = fraction1.divideBy(fraction2); //divide
                    mixedFraction.reduce(); //reduce
                    //print result
                    System.out.print(fraction1);
                    System.out.print(" / ");
                    System.out.print(fraction2);
                    System.out.print(" = ");
                    System.out.print(mixedFraction);
                    System.out.print(" or ");
                    System.out.print(mixedFraction.toDouble());
                    System.out.println("n");
                    break;
            }
        }
        sc.close(); //close scanner
    }
        catch (Exception ;) {
        e.printStackTrace();
    }


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

        MixedFraction mixedFraction1 = new MixedFraction(0,1);
        MixedFraction mixedFraction2 = new MixedFraction(0,1);
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
