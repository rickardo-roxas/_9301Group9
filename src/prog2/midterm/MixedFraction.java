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

/**
 * This class implements mixed fraction
 */

public class MixedFraction extends Fraction {
    private int wholeNumber; // holds the whole number for MixedFraction

    /**
     * Construct a default mixed fraction with whole = 0
     */
    public MixedFraction() {
        super(numerator, denominator);
        wholeNumber = 0;
    } // end of MixedFraction default constructor

    /**
     * Construct a mixed fraction with a given whole number part and fraction part
     * whole The whole number of the mixed fraction
     * fraction The fraction part of the mixed fraction
     */
    public MixedFraction(int whole, Fraction fraction) {
        super();
        setNumerator(fraction.getNumerator());
        setDenominator(fraction.getDenominator());
        this.wholeNumber = whole;
    }

    /**
     * This constructor creates a Mixed Fraction using the explicit whole,
     * numerator and denominator values
     * Example usage: Fraction fraction = new MixedFraction(1, 1, 2)
     * whole The whole number of the mixed fraction
     * numerator The numerator of the mixed fraction
     * denominator The denominator of the mixed fraction
     */
    public MixedFraction(int whole, int numerator, int denominator) {
        super(numerator, denominator);
        this.wholeNumber = whole;
    }

    /**
     * This constructor creates a Mixed Fraction using an explicit fraction value
     */
    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.wholeNumber = 0;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }
    /**
     * Accessor/Getter Method
     * return The fraction part of this mixed fraction
     */
    public Fraction getFractionPart() {
        Fraction result = new Fraction();
        result.setNumerator(getNumerator());
        result.setDenominator(getDenominator());
        return result;
    }
    /**
     * Accessor/Getter Method
     * return The value of the fraction part of this mixed fraction
     */
    public Fraction toFraction() {
        Fraction result = new Fraction();
        result.setNumerator(getWholeNumber() * getDenominator() + getNumerator());
        result.setDenominator(getDenominator());
        return result;
    }
    /**
     * Setter/Mutator Method
     * Sets the value of the whole of this mixed fraction to whole
     * whole The whole number to be assigned
     */
    public void setWholePart(int whole) {
        this.wholeNumber = whole;
    }
    /**
     * Setter/Mutator Method
     * Sets the value of the numerator and denominator to fraction part
     * fraction The fraction to be assigned
     */
    public void setFractionPart(Fraction fraction) {
        super.setNumerator(fraction.getNumerator());
        super.setDenominator(fraction.getDenominator());
    }
    /**
     * Adds two mixed fractions
     * other An addend mixed fraction
     * return The sum of this mixed fraction and another mixed fraction
     */
    public MixedFraction add (MixedFraction other) {
        MixedFraction result = new MixedFraction(); //creating a new object
        result.setWholePart(getWholeNumber() + other.getWholeNumber());
        Fraction fPart;
        fPart = getFractionPart().add(other.getFractionPart());
        result.setDenominator(fPart.getDenominator());
        result.setNumerator(fPart.getNumerator());
        return result;
    }
    /**
     * Subtracts two mixed fractions
     * other The subtrahend mixed fraction
     * return The difference of this mixed fraction and another mixed fraction
     */
    public MixedFraction subtract(MixedFraction other) {
        MixedFraction result = new MixedFraction(); //creating a new object
        Fraction f1 = toFraction();
        Fraction f2 = other.toFraction();
        result.setNumerator(f1.getNumerator() * f2.getDenominator() -
                f1.getDenominator() * f2.getNumerator());
        result.setDenominator(f1.getDenominator() * f2.getDenominator());
        result.setWholePart(result.getNumerator() / result.getDenominator());
        result.setNumerator(result.getNumerator() - result.getWholeNumber() *
                result.getDenominator());
        result.setNumerator(Math.abs(result.getNumerator()));
        return result;
    }
    /**
     * Multiplies two mixed fractions
     * other The multiplier mixed fraction
     * return The product of this mixed fraction and another mixed fraction
     */
    public MixedFraction multiplyBy (MixedFraction other) {
        MixedFraction result = new MixedFraction(); // creating a new objec
        Fraction f1 = toFraction();
        Fraction f2 = other.toFraction();
        result.setNumerator(f1.getNumerator() * f2.getNumerator());
        result.setDenominator(f1.getDenominator() * f2.getDenominator());
        result.setWholePart(result.getNumerator() / result.getDenominator());
        result.setFractionPart(new Fraction(result.getNumerator() -
                result.getWholeNumber() * result.getDenominator(), result.getDenominator()).reduce());
        return result;
    }
    /**
     * Divides two mixed fractions
     * other The divisor mixed fraction
     * return The quotient of this mixed fraction and another mixed fraction
     */
    public MixedFraction divideBy(MixedFraction other) {
        MixedFraction result = new MixedFraction(); //creating a new object
        Fraction f1 = toFraction();
        Fraction f2 = other.toFraction();
        result.setNumerator(f1.getNumerator() * f2.getDenominator());
        result.setDenominator(f1.getDenominator() * f2.getNumerator());
        result.setWholePart(result.getNumerator() / result.getDenominator());
        result.setFractionPart(new Fraction(result.getNumerator() - result.getWholeNumber() *
                result.getDenominator(), result.getDenominator()).reduce());
        return result;
    }
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













    /*
    public void setWholeNumber(int wholeNum) {
        wholeNumber = wholeNum;
    } // end of setWholeNumber mutator method

    public int getWholeNumber() {
        return wholeNumber;
    } // end of getWholeNumber accessor method

     */

