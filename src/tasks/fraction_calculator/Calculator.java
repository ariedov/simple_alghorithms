package tasks.fraction_calculator;

import tasks.common_divisor.GreatestCommonDivisor;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public Fraction add(Fraction first, Fraction second) {
        int newFirstNumerator = first.getNumerator() * second.getDenominator();
        int newSecondNumerator = second.getNumerator() * first.getDenominator();

        int newDenominator = first.getDenominator() * second.getDenominator();
        int newNumerator = newFirstNumerator + newSecondNumerator;

        return getSimplifiedFraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction first, Fraction second) {
        int newFirstNumerator = first.getNumerator() * second.getDenominator();
        int newSecondNumerator = second.getNumerator() * first.getDenominator();

        int newDenominator = first.getDenominator() * second.getDenominator();
        int newNumerator = newFirstNumerator - newSecondNumerator;

        return getSimplifiedFraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction first, Fraction second) {
        int newNumerator = first.getNumerator() * second.getNumerator();
        int newDenominator = first.getDenominator() * second.getDenominator();

        return getSimplifiedFraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction first, Fraction second) {
        int newNumerator = first.getNumerator() * second.getDenominator();
        int newDenominator = first.getDenominator() * second.getNumerator();

        return getSimplifiedFraction(newNumerator, newDenominator);
    }

    private Fraction getSimplifiedFraction(int numerator, int denominator) {
        int gcd = new GreatestCommonDivisor().euclidAlgorithm(numerator, denominator);
        numerator = numerator  / gcd;
        denominator = denominator / gcd;
        return new Fraction(numerator, denominator);
    }
}
