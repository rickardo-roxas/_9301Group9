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

    // object field
    private int wholeNumber; // holds the whole number for MixedFraction

    /**
     * Construct a default mixed fraction with whole = 0
     */

    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        wholeNumber = 0; // numerator and denominator are already from Fraction class
    } // end of MixedFraction default constructor

    /**
     * Construct a mixed fraction with a given whole number part and fraction part
     * @param wholeNumber The whole number of the mixed fraction
     * @param fraction The fraction part of the mixed fraction
     */
    public MixedFraction(int wholeNumber, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNumber = wholeNumber;
    } // end of MixedFraction default constructor

    /**
     * Setter/Mutator Method
     * Sets the value of the whole of this mixed fraction to whole
     * @param wholeNum The whole number to be assigned
     */
    public void setWholeNumber(int wholeNum) {
        wholeNumber = wholeNum;
    } // end of setWholeNumber mutator method

    /**
     * Accessor/Getter Method
     * @return The value of the whole of this mixed fraction
     */
    public int getWholeNumber() {
        return wholeNumber;
    } // end of getWholeNumber accessor method

    /**
     * Concatenates the whole number, numerator, and denominator of Fraction.
     * Stringifies the mixed fraction
     * @return fraction as String
     */
    public String toString() {
        return getWholeNumber() + " " + getNumerator() + "/" + getDenominator();
    } // end of toString method

    /**
     * Computes the Mixed Fraction by multiplying the whole number with the denominator and
     * adding its product to the numerator.
     * Converts the mixed fraction to decimal form
     * @return mixed fraction converted to decimal
     */
    public double toDouble() {
        return (double) (getNumerator() / getDenominator()) + getWholeNumber();
    } // end of toDouble method

    /**
     * Takes a MixedFraction object and returns an equivalent Fraction object in improper form.
     * Assumes valid input with non-negative whole number, and positive numerator and denominator values.
     * @param mixedFraction the mixed fraction to convert
     * @return an equivalent Fraction object in improper form
     */
    public Fraction convertToImproper(MixedFraction mixedFraction) {
        int wholeNumber = getWholeNumber();
        int numerator = mixedFraction.getNumerator();
        int denominator = mixedFraction.getDenominator();
        numerator = denominator * wholeNumber + numerator;

        return new Fraction(numerator,denominator);
    } // end of convertToImproper method

    /**
     * Converts the given 'Fraction' object to a 'MixedFraction' object.
     * @param improperFraction the 'Fraction' object to be converted to a 'MixedFraction' object
     * @return the resulting 'MixedFraction' object
     */

    public MixedFraction convertToMixedNumbers(Fraction improperFraction) {
        int wholeNumber = 0;
        int numerator = improperFraction.getNumerator();
        int denominator = improperFraction.getDenominator();

        wholeNumber = numerator / denominator;
        numerator = numerator % denominator;

        Fraction fraction = new Fraction(numerator, denominator);
        MixedFraction mixedNumbers = new MixedFraction(wholeNumber, fraction);

        return mixedNumbers;
    } // end of convertToMixedNumbers method

    /**
     * This method was made on 4 March 2023 by ROXAS, Johan Rickardo.
     * Adds the Fraction1 addend and Fraction2 addend.
     * Method overridden from FractionArithmetic.
     * @param addend Fraction 2
     * @return simplified sum of Fraction 1 and Fraction 2.
     */
    @Override
    public Fraction add(Fraction addend) {
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

    protected MixedFraction multiplyBy(MixedFraction multiplier, MixedFraction multiplicand) {
        Fraction multiplierFraction = convertToImproper(multiplier);
        Fraction multiplicanFraction = convertToImproper(multiplicand);
        multiplierFraction.
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
    public Fraction reduce() {
        return super.reduce();
    } // end of overridden reduce method
} // end of class MixedFraction
