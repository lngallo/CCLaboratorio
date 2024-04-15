package structures;

import interfaces.BinaryTree;
/**
 * COMMENT...
 * @author 
 * @param <E>
 */
public class AVLTree<E extends Comparable<E>> implements BinaryTree<E> {
    
    /*
        Has uso de encapsulamiento e incluye los 
        métodos get y set para cada variable
    */
    Node<E> root;
    //...otras variables u objetos
    
    /**
     * COMMENT...
     */
    public AVLTree() {
       //implementation... 
    }

    @Override
    public boolean isEmpty() {
	return false;
    }

    @Override
    public int height() {
	return 0;
    }

    @Override
    public boolean insert(E element) {
	Node<E> node = new Node<>(element);
	if (root == null) {
	    root = node;
	} else {
	    
	}
	return false;
    }

    @Override
    public boolean delete(E element) {
	return false;
    }
    
    /**
     * COMMENT...
     * @param pivot
     */
    private void rotateLeft(Node<E> pivot) {
       //implementation... 
    }
    
    /**
     * COMMENT...
     * @param pivot
     */
    private void rotateRight(Node<E> pivot) {
	Node<E> aux1, aux2;
	//implementa el get para poder ejecutar la siguente línea
	//aux1 = pivot.getFather();
        
    }
    
    /**
     * COMÉNTAME...
     * @param elemento
     * @return 
     */
    public Node<E> search(E element) {
        return null;
    }
    
    @Override
    public String toString() {
	return root.toString();
    }

    public Node<E> getRoot() {
	return root;
    }


    public static void main(String[] args) {
	AVLTree<Integer> tree = new AVLTree<>();

	tree.insert(8);
	tree.insert(9);
	tree.insert(10);
	System.out.println(tree);

	//implementa los get para poder ejecutar la siguientes líneas
	//Node<Integer> pivote = tree.getRoot().getLeft();
	//tree.rotateRight(pivot);

	System.out.println(tree);

    }
}
