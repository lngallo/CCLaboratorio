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
    boolean insert(E element);

    /**
     * COMMENT...
     * @param
     */
    boolean delete(E element);
}
