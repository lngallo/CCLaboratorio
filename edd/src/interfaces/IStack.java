package interfaces;

/**
 *
 *
 */
public interface IStack<E> {

    /**
     *
     */
    boolean push(E element);


    /**
     *
     */
    E pop() throws Exception;

    /**
     *
     */
    E peek();

    /**
     *
     */
    boolean empty();
}
