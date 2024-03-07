package math;

import java.util.Scanner;

/**
 *Clase para crear objetos de tipo Fraction que extiende a Number.
 *@version 1
 *@autor Fernando Colón
 */
public class Fraction extends Number{

    private final int NUMERATOR;
    private final int DENOMINATOR;

    /**
     *Constructor de los objetos tipo Fraction.
     *
     */
    public Fraction(int numerator, int denominator){
	this.NUMERATOR  = numerator;
	this.DENOMINATOR = denominator;
    }

    @Override
    public int getIntegerPart(){
	return NUMERATOR/DENOMINATOR;
    }

    @Override
    public double getDecimalPart(){
	return (double) (NUMERATOR/DENOMINATOR)-getIntegerPart();
    }

    /**
     *El método hace la suma de la fracción con la fracción x.
     *@return la suma en tipo de dato Fraction.
     */
    public Fraction add(Fraction x) {
        int num = this.NUMERATOR * x.DENOMINATOR + x.NUMERATOR * this.DENOMINATOR;
	int den = this.DENOMINATOR * x.DENOMINATOR;
	return new Fraction(num, den);
    }

    /**
     *El método multiplica la fracción con la fracción x.
     *@return el producto en tipo de dato Fraction.
     */
    public Fraction multiply(Fraction x) {
	return new Fraction(this.NUMERATOR * x.NUMERATOR, this.DENOMINATOR * x.DENOMINATOR);
    }

    /**
     *
     */
    public static void main(String[] args) {
	
    }
   
}
