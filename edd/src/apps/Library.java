package apps;

import structures.AVLTree;
import java.util.Collection;

/**
 *
 *
 */
public class Library<E extends Comparable<E>> {


    public AVLTree<E> library;

    /**
     *
     */
    public Library() {
	this.library = new AVLTree<E>();
    }

    /**
     *
     *
     */
    public void fillCollection(Collection<E> collection) {
	collection.forEach((element) -> {
	    library.insert(element);
	});
    }

    /**
     *
     */
    public void add(E element) {
	// implements...
    }

    /**
     *
     */
    public void delete(E element) {
	//implements...
    }

    /**
     *
     */
    @Override
    public String toString() {
	return "";
    }
}
