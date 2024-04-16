package math;

import java.lang.Comparable;

/**
 *Clase que abstrae la entidad matemática Número.
 *@version 1
 *@autor Fernando Colón
 */
public abstract class Number implements Comparable<Number>{

    /**
     *El método nos dice la parte decimal de un número.
     *@return parte decimal en tipo de dato double.
     */
    public abstract double getDecimalPart();

    /**
     *El método nos dice la parte entera de un número.
     *@return parte entera en tipo de dato int.
     */
    public abstract int getIntegerPart();

    @Override
    public int compareTo(Number o){
	double n1 = o.getDecimalPart() + o.getIntegerPart();
	double n2 = this.getDecimalPart() + this.getIntegerPart();

	if( n1 > n2){
	    return -1;
	}
	if(n1 < n2){
	    return 1;
	}
	return 0;
    }
    
}
