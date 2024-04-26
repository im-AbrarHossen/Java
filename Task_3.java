class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }

    public void add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        simplify();
    }

    public void multiplication(Fraction fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        simplify();
    }

    public void division(Fraction fraction) {
        if (fraction.numerator != 0) {
            this.numerator = this.numerator * fraction.denominator;
            this.denominator = this.denominator * fraction.numerator;
            simplify();
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    private void simplify() {
        int gcd = findGCD(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public String toString() {
        return numerator + " / " + denominator;
    }
}

public class Task_3 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);

        System.out.println("Fraction 1: " + fraction1);
        System.out.println("Fraction 2: " + fraction2);

        fraction1.add(fraction2);
        System.out.println("After addition: " + fraction1);

        fraction1 = new Fraction(1, 4); // Reset to the original value
        fraction1.sub(fraction2);
        System.out.println("After subtraction: " + fraction1);

        fraction1 = new Fraction(1, 4); // Reset to the original value
        fraction1.multiplication(fraction2);
        System.out.println("After multiplication: " + fraction1);

        fraction1 = new Fraction(1, 4); // Reset to the original value
        fraction1.division(fraction2);
        System.out.println("After division: " + fraction1);
    }
}
