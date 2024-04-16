package math;

import interfaces.Operable;

/**
 * Comment...
 *
 */
public class MatrixBA<E extends Operable> extends Matrix<E> {

    private E[][] biArray;

    /**
     *
     */
    public MatrixBA(E[][] biArray) {
	this.biArray = biArray;
    }

    @Override
    public int getNColumns() {
	return biArray[0].length;
    }

    @Override
    public int getNRows() {
	return biArray.length;
    }

    @Override
    public E getElement(int i, int j) {
	return biArray[i-1][j-1];
    }

    @Override
    public Matrix add(Matrix m) {
	//	Operable[][] matrix = new Operable[2][3];
	
	return null;
    }
    
    @Override
    public String toString() {
	String strMatrix = "";
	
	return "muestro matriz";
    }

    /**
     * Método principal.
     */
    public static void main(String[] args) {

    }

}
