package tests.fraction_calculator;

import junit.framework.TestCase;
import tasks.fraction_calculator.Calculator;
import tasks.fraction_calculator.Fraction;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 10:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class FractionCalculatorTest extends TestCase {
    private Calculator calculator = new Calculator();

    public void testSubtract() throws Exception {
        Fraction f1 = new Fraction(29, 4);
        Fraction f2 = new Fraction(14, 3);

        Fraction subtract = calculator.subtract(f1, f2);
        assertEquals(31, subtract.getNumerator());
        assertEquals(12, subtract.getDenominator());
    }

    public void testAdd() throws Exception {
        Fraction f1 = new Fraction(3, 7);
        Fraction f2 = new Fraction(2, 7);

        Fraction add = calculator.add(f1, f2);
        assertEquals(5, add.getNumerator());
        assertEquals(7, add.getDenominator());
    }

    public void testMultiply() throws Exception {
        Fraction f1 = new Fraction(2, 7);
        Fraction f2 = new Fraction(5, 9);

        Fraction multiply = calculator.multiply(f1, f2);
        assertEquals(10, multiply.getNumerator());
        assertEquals(63, multiply.getDenominator());
    }

    public void testDivide() throws Exception {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(12, 25);

        Fraction divide = calculator.divide(f1, f2);
        assertEquals(5, divide.getNumerator());
        assertEquals(4, divide.getDenominator());
    }
}
