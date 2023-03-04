package prog2.midterm;

public class MixedFractionBuilder {
    private int numerator;
    private int denominator;
    private int wholeNumber;

    public MixedFractionBuilder setNumerator(int numerator) {
        this.numerator = numerator;
        return this;
    }

    public MixedFractionBuilder setDenominator(int denominator) {
        this.denominator = denominator;
        return this;
    }

    public MixedFractionBuilder setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
        return this;
    }

    public MixedFraction createMixedFraction() {
        return new MixedFraction();
    }
}