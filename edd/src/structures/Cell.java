package structures;

/**
 * Comment ...
 */
public class Cell<T> {

    /** Atributes */
    private T data;
    private Cell<T> next;

    /**
     *
     */
    public Cell() {
	this.data = null;
	this.next = null;
    }
    
    /**
     * Comment ...
     */
    public Cell(T data) {
	this.data = data;
    }

    /**
     * Comment ...
     */
    public T getData() {
	return data;
    }

    /**
     * Comment ...
     */
    public void setData(T data) {
	this.data = data;
    }

    /**
     * Comment ...
     */
    public Cell<T> getCell() {
	return next;
    }

    /**
     * Comment ...
     */
    public void setCell(Cell<T> next) {
	this.next = next;
    }

    @Override
    public String toString() {
	return data.toString();
    }

    @Override
    public boolean equals(Object o) {
	// cachar la excepción en caso de error al hacer la conversión
	Cell<T> tmp = (Cell<T>) o; 
	// alternativa usar instanceOf
	// if (o instanceOf Cell) {
	//     return false;
	// }
	if (this.data.equals(tmp.data)) {
	    if (this.next.equals(tmp.next)) {
		return true;
	    }
	}
	return false;
    }
}
