/**
 * Group 9:
 * <p>
 *     RABANG, Gebreyl Isaac P.
 *     RAGUDOS, Hannah T.
 *     RAMOS, Jerwin Kyle R.
 *     ROQUE, Rey Daniel L.
 *     ROXAS, Johan Rickardo A.
 * </p>
 * The Fraction class.
 * A template for a fraction that has the form numerator/denominator.
 */

import javax.swing.*;

public class Fraction {
    // object fields
    private int numerator; // holds the numerator for this fraction
    private int denominator; // holds the denominator for this fraction

    /**
     * Constructs a fraction with numerator = 0 and denominator = 1.
     * This constructor allows a Fraction with an equivalent numeric value of zero.
     * This becomes the default constructor.
     * @param wholeNumVal whole number fraction
     */
    public Fraction(int wholeNumVal) {
        this(wholeNumVal, 1);
    } // end of default Fraction constructor

    /**
     * Constructs a Fraction using a given numerator and denominator.
     * <p>
     *     Example: Fraction f = new Fraction( 3, 8);
     * </p>
     * @param numerator value of the numerator
     * @param denominator value of the denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    } // end of Fraction constructor

    /**
     * Mutator/Setter Method for numerator of a fraction.
     * Sets the value of the numerator of this fraction to n.
     * @param n The numerator to assign
     */
    public void setNumerator(int n) {
        numerator = n;
    } // end of setNumerator method

    /**
     * Accessor/Getter Method for numerator of a fraction.
     * @return The value of the numerator of this fraction
     */
    public int getNumerator() {
        return numerator;
    } // end of getNumerator method

    /**
     * Mutator/Setter Method for denominator of a fraction.
     * Sets the value of the denominator of this fraction to d
     * @param d The denominator to assign
     */
    public void setDenominator(int d) {
        denominator = d;
    } // end of setDenominator method

    /**
     * Accessor/Getter Method for denominator of a fraction.
     * @return The value of the denominator of this fraction
     */
    public int getDenominator() {
        return denominator;
    } // end of getDenominator method

    /**
     * Concatenates a fraction to String
     *
     * @return A string form of the fraction following the numerator/denominator format
     */
    public String toString() { // this is an overridden method from the Object class
        // String r = JOptionPane.showMessageDialog(null, r);
        if ( numerator == 0 )
            // r = "0";
            JOptionPane.showMessageDialog(null, numerator);
        else if (denominator == 1)
            // r = numerator + "";
            JOptionPane.showMessageDialog(null, denominator);
        else
            // r = (numerator + "/" + denominator );
            JOptionPane.showMessageDialog(null, numerator + "/" + denominator);
        return null;
    } // end of toString method

    /**
     * Converts the fraction to a decimal form
     */
    public void toDouble() {
        double simplifiedFraction = (double) numerator / denominator;
        JOptionPane.showMessageDialog(null, simplifiedFraction);
    } // end of toDouble method

    /**
     * Reduces the fraction to its simplest form
     * @return The reduced (simplest) form of this fraction
     */
    public Fraction reduce(int wholeNumVal) {
        Fraction r = new Fraction(wholeNumVal); // constructs a fraction
        int GCD = computeGCD(); // determine the greatest common factor of numerator and denominator
        int newN = numerator / GCD;   //compute newN, the numerator's simplest form
        int newD = denominator / GCD; //compute newD, denominator's simplest form
        r.setNumerator(newN); // sets the new value of the numerator in its simplest form
        r.setDenominator(newD);// sets the new value of the denominator in its simplest form newD
        return r; // returns the simplest form of this fraction
    } // end of reduce method

    /**
     * Computes the greatest common factor of the numerator and denominator
     * @return The greatest common factor
     */
    private int computeGCD() {
        int GCD = 1;
        int lesser = 1;
        boolean value = false;
        lesser = computeLesser(numerator, denominator);
        for (int index = lesser; (index >= 1 && !value); index--) {
            if (numerator % index == 0 && denominator % index == 0) {
                value = true;
                GCD = index;
            } // end of if
        } // end of for
        return GCD;
    } // end of computeGCD method

    /**
     * Returns the lesser number of the two parameters.
     * @param n1 The first number to compare.
     * @param n2 The second number to compare.
     * @return The lesser value of integer between n1 and n2.
     */
    private int computeLesser (int n1, int n2) {
        int lesser = n1;
        if (n1 < n2)
            lesser = n1;
        else
            lesser = n2;
        return lesser;
    } // end of computeLesser method

    /**
     * Adds the two fractions.
     * @param addend first fraction
     * @param wholeNumVal default or user-defined fraction
     * @return sum of the two fractions in the simplest form.
     */
    public Fraction add(Fraction addend, int wholeNumVal) {
        Fraction sum = new Fraction(wholeNumVal); // instantiates a new object of sum
        int den = denominator * addend.getDenominator(); // holds the value of denominator
        int num = den / denominator * numerator +
                den / addend.getDenominator() * addend.getNumerator(); // holds the value of numerator
        sum.setNumerator(num); // mutates numerator
        sum.setDenominator(den); // mutates denominator
        return sum.reduce(wholeNumVal); // invokes method to reduce the sum in its simplest form
    } // end of add method

    /**
     * Subtracts the two fractions.
     * @param subtrahend the subtrahend fraction
     * @param wholeNumVal default or user-defined fraction
     * @return the difference of this fraction and another fraction
     */
    public Fraction subtract(Fraction subtrahend, int wholeNumVal) {
        Fraction difference = new Fraction(wholeNumVal); // instantiates a new object of difference
        int num = numerator * subtrahend.getDenominator() - subtrahend.getNumerator() * denominator;
        int den = denominator * subtrahend.getDenominator();
        difference.setNumerator(num);
        difference.setDenominator(den);
        return difference.reduce(wholeNumVal); // invokes a method to reduce the difference in its simplest form
    } // end of subtract method

    /**
     * Multiplies the two fractions
     * @param multiplier  The multiplier fraction
     * @param wholeNumVal default or user-defined fraction
     * @return The product of this fraction and another fraction
     */
    public Fraction multiplyBy(Fraction multiplier, int wholeNumVal) {
        Fraction product = new Fraction(wholeNumVal);
        int num = numerator * multiplier.getNumerator();
        int den = denominator * multiplier.getDenominator();
        product.setNumerator(num);
        product.setDenominator(den);
        return product.reduce(wholeNumVal);
    } // end of multiplyBy method

    /**
     * Divides the two fractions
     * @param divisor The divisor fraction
     * @param wholeNumVal default or user-defined fraction
     * @return The quotient of this fraction and another fraction
     **/
    public Fraction divideBy(Fraction divisor, int wholeNumVal) {
        Fraction quotient = new Fraction(wholeNumVal);
        int num = numerator * divisor.getDenominator();
        int den = denominator * divisor.getNumerator();
        quotient.setNumerator(num);
        quotient.setDenominator(den);
        return quotient.reduce(wholeNumVal);
    } // end of divideBy method
} // end of Fraction class

