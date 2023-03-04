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

    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        wholeNumber = 0;
    } // end of MixedFraction default constructor

    public MixedFraction(int wholeNumber, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNumber = wholeNumber;
    } // end of MixedFraction default constructor

    public void setWholeNumber(int wholeNum) {
        wholeNumber = wholeNum;
    } // end of setWholeNumber mutator method

    public int getWholeNumber() {
        return wholeNumber;
    } // end of getWholeNumber accessor method

    /**
     * Concatenates the whole number, numerator, and denominator of Fraction.
     * @return fraction as String
     */
    public String toString() {
        return getWholeNumber() + " " + getNumerator() + "/" + getDenominator();
    } // end of toString method

    /**
     * Computes the Mixed Fraction by multiplying the whole number with the denominator and
     *  adding its product to the numerator.
     * @return mixed fraction converted to decimal
     */
    public double toDouble() {
        return (double) (getNumerator() / getDenominator()) + getWholeNumber();
    } // end of toDouble method



    /**
     * This method was made on 4 March 2023 by ROXAS, Johan Rickardo.
     * Adds the Fraction1 addend and Fraction2 addend.
     * Method overridden from FractionArithmetic.
     * @param addend Fraction 2
     * @return simplified sum of Fraction 1 and Fraction 2.
     */
    @Override
    protected Fraction add(Fraction addend) {
        return super.add(addend);
    } // end of overridden add method

    protected MixedFraction add(MixedFraction addend, Fraction fractionAddend) {
        int sumWholeNumber = this.wholeNumber + addend.getWholeNumber();
        Fraction sumFraction = add(fractionAddend);
        MixedFraction sum = new MixedFraction(sumWholeNumber, sumFraction);
        return sum;
    } // end of add method

    @Override
    protected Fraction subtract(Fraction subtrahend) {
        return super.subtract(subtrahend);
    } // end of overridden subtract method

    protected MixedFraction subtract(MixedFraction subtrahend, Fraction fractionSubtrahend) {
        int differenceWholeNumber = this.wholeNumber - subtrahend.getWholeNumber();
        Fraction differenceFraction = subtract(fractionSubtrahend);
        MixedFraction difference = new MixedFraction(differenceWholeNumber, differenceFraction);
        return difference;
    } // end of subtract method

    @Override
    protected Fraction multiplyBy(Fraction multiplicand) {
        return super.multiplyBy(multiplicand);
    } // end of overridden multiplyBy method

    protected MixedFraction multiplyBy(MixedFraction multiplicand, Fraction fractionMultiplicand) {
        int productWholeNumber = this.wholeNumber * multiplicand.getWholeNumber();
        Fraction productFraction = multiplyBy(fractionMultiplicand);
        MixedFraction product = new MixedFraction(productWholeNumber, productFraction);
        return product;
    } // edn of multiplyBy method

    @Override
    protected Fraction divideBy(Fraction dividend) {
        return super.divideBy(dividend);
    } // end of overridden divideBy method

    /*
    protected MixedFraction divideBy(MixedFraction dividend, Fraction fractionDividend) {
        int quotientWholeNumber = this
    }
    */

    @Override
    protected Fraction reduce() {
        return super.reduce();
    } // end of overridden reduce method
} // end of class MixedFraction
