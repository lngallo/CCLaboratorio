package structures;

import java.util.List;
import java.util.ArrayList;

/**
 *
 *
 */
public class LinkedList<E> {

    /** Atributes */
    private List<E> list;
    /**
     * Empty list
     */
    public LinkedList() {
	list =  new ArrayList<E>();
    }


    public boolean remove(E e) {
	return list.remove(e);
    }

    public boolean add(E element) {
	return list.add(element);
    }

    public boolean add(E element, int index) {
	list.add(index, element);
	return true;
    }

    public void clear() {
	list.clear();
    }

    public E getElement(int index) {
	return list.get(index);
    }

    public E remove(int index) {
	return list.remove(index);
    }

    public int size() {
	return list.size();
    }
}
