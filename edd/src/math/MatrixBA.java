package math;

/**
 * Comment...
 *
 */
public class MatrixBA<E> extends Matrix<E> {

    private E[][] biArray;

    /**
     *
     */
    public MatrixBA(E[][] biArray) {
	this.biArray = biArray;
    }

    @Override
    public int getNColumns() {
	return 0;
    }

    @Override
    public int getNRows() {
	return 0;
    }

    @Override
    public E getElement(int i, int j) {
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
	Integer[][] intM = {{1,2},{2,3}};
	Matrix m = new MatrixBA(intM);

	System.out.println("Mostamos la matriz :\n" + m );
    }

}
