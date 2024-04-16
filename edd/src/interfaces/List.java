package interfaces;

/**
 *
 *
 */
public interface List<E> {


    /**
     *
     */
    boolean addEnd(E element);

    /**
     *
     */
    boolean add(E element, int index);

    /**
     *
     */
    E remove(int index);

    /**
     *
     */
    boolean remove(E element)
}
