package structures;

import interfaces.IStack;

/**
 *
 */
public class Stack<E> implements IStack<E> {

    //Atributes
    private LinkedList<E> stack;

    /**
     *
     */
    public Stack() {
	stack = new LinkedList<E>();
    }

    //    @Override
    public boolean push(E element) {
	return stack.add(element);
    }

    @Override
    public E pop() throws Exception {
	return stack.remove(stack.size() - 1);
    }

    //    @Override
    public E peek() {
	return null;
    }

    //    @Override
    public boolean empty() {
	return false;
    }
}
