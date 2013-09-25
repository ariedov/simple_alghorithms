package tasks.fraction_calculator;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fraction {
    private int mNumerator;
    private int mDenominator;

    public Fraction(int numerator, int denominator) {
        mNumerator = numerator;
        mDenominator = denominator;
    }

    public int getNumerator() {
        return mNumerator;
    }

    public int getDenominator() {
        return mDenominator;
    }
}
