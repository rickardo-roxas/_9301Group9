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
        super();
        wholeNumber = 0;
    } // end of MixedFraction default constructor

    public MixedFraction(Fraction fraction, int wholeNumber) {
        super();
        this.wholeNumber = wholeNumber;
    } // end of MixedFraction default constructor

    public void setWholeNumber(int wholeNum) {
        wholeNumber = wholeNum;
    } // end of setWholeNumber mutator method

    public int getWholeNumber() {
        return wholeNumber;
    } // end of getWholeNumber accessor method

    // TO DO
} // end of class MixedFraction
