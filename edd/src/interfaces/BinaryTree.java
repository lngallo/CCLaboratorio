package interfaces;

/**
 *
 * COMMENT...
 * @author
 * @param <E>
 */
public interface BinaryTree<E> {

    /**
     * COMMENT...
     * @return
     */
    boolean isEmpty();

    /**
     * COMMENT...
     * @return
     */
    int height();

    /**
     * COMMENT...
     * @param
     */
    void insert(E element);

    /**
     * COMMENT...
     * @param
     */
    void delete(E element);
}
