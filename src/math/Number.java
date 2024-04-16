package math;

import java.lang.Comparable;

/**
 * Clase que abstrae la entidad matemática Número.
 * @version 1
 * @author leonardo.gallo
 */
public abstract class Number implements Comparable<Number> {

    /**
     * Devuelve la parte decimal del número.
     * @return parte decimal en tipo de dato primitivo...
     */
    public abstract double getDecimalPart();


    /**
     *
     */
    public abstract int getIntegerPart();

    //aproximación Real...

    @Override
    public int compareTo(Number o) {
	double realX = o.getIntegerPart() + o.getDecimalPart();
	double realY = this.getIntegerPart() + this.getDecimalPart();

	if (realY > realX)
	    return 1;
	if (realY < realX)
	    return -1;	
	return 0;
    }

    /**
     * Qué hace el método...
     * @param str la cadena con la que el método trabaja...
     * @return el entero resultante de procesar la entrada..
     */
    public abstract int miMetodo(String str);
    
}
