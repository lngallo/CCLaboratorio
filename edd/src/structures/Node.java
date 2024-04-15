package structures;

/**
 * COMMENT...
 * 
 * @author 
 * @param <T>
 */
public class Node<T> {
    
    /*  
	Haz uso del encapsulamiento e incluye los
        métodos get y set para cada variable.
    */
    T value;
    Node<T> left;
    Node<T> right;
    Node<T> father; //opcional
    //incluye el nivel del nodo en caso de ser necesario
    
    /**
     * COMMET...
     */
    public Node() {
        //implementation...
    }

    /**
     * COMMENT...
     */
    public Node(T value) {
        //implementation...
	this.value = value;
    }
    
    @Override
    public String toString() {
	return "";
    }

}
