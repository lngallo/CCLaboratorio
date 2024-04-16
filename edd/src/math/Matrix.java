package math;

import interfaces.Operable;
/**
 * Comment...
 *
 */
public abstract class Matrix<E> implements Operable<Matrix>{

    /**
     * Comment...
     *
     */
    public abstract int getNColumns();

    /**
     * Comment...
     *
     */
    public abstract int getNRows();

    /**
     * Comment...
     *
     */
    public abstract E getElement(int i, int j);
}
