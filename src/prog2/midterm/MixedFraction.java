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
 * The MixedFraction Class.
 */
package prog2.midterm;

import prog2.prelim.Fraction;

public class MixedFraction extends Fraction {
    private int wholeNumber; // holds the whole number for MixedFraction

    public MixedFraction(int numerator, int denominator) {
        super(numerator, denominator);
        wholeNumber = 0;
    } // end of MixedFraction default constructor

    public MixedFraction(int numerator, int denominator, int wholeNumber) {
        super(numerator, denominator);
        this.wholeNumber = wholeNumber;
    } // end of MixedFraction default constructor

    public void setWholeNumber(int wholeNum) {
        wholeNumber = wholeNum;
    } // end of setWholeNumber mutator method

    public int getWholeNumber() {
        return wholeNumber;
    } // end of getWholeNumber accessor method

    /**
     * Converts the mixed
     * @return
     */
    public String toString() {
        String mixedFraction = getWholeNumber() + " " + getNumerator() + "/" + getDenominator();
        return mixedFraction;
    } // end of toString method

    /**
     * Computes the Mixed Fraction by multiplying the whole number with the denominator and
     *  adding its product to the numerator.
     * @return mixed fraction converted to decimal
     */
    public double toDouble() {
        double reducedFraction = (double) (getDenominator() * getDenominator()) + getNumerator();
        return reducedFraction;
    } // end of toDouble method

    @Override
    public Fraction add(Fraction addend) {
        return super.add(addend);
    } // end of overridden add method
} // end of class MixedFraction
