package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;



    public Stack(){
        elements = new ArrayList<E>();
    }

    public E pop() {
        if (elements.size()!=0) return elements.remove(elements.size() -1);
        else throw new IndexOutOfBoundsException();
    }

    public void push(E element) {
        elements.add(element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
