package tasks.fraction_calculator;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 9/25/13
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(29, 4);
        Fraction f2 = new Fraction(14, 3);

        Calculator calculator = new Calculator();

        Fraction added = calculator.add(f1, f2);
        System.out.println("Add: " + added.getNumerator() + "/" + added.getDenominator());

        Fraction subtracted = calculator.subtract(f1, f2);
        System.out.println("Subtract: " + subtracted.getNumerator() + "/" + subtracted.getDenominator());

        Fraction multiplied = calculator.multiply(f1, f2);
        System.out.println("Multiply: " + multiplied.getNumerator() + "/" + multiplied.getDenominator());

        Fraction divided = calculator.divide(f1, f2);
        System.out.println("Divide: " + divided.getNumerator() + "/" + divided.getDenominator());
    }
}
