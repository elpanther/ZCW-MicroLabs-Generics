package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private E[] elements;

    public ObjectStack(E[] elements) {
        this.elements = elements;
    }

    public ObjectStack( ) {
        elements = (E[])(new ArrayList<E>()).toArray();
        //  elements = (E[])new Object[1];
    }

    public void push(E foo) {
        elements = Arrays.copyOf(elements, elements.length +1);
        elements[elements.length -1] = foo;

    }

    public E pop() {
        E lastElement = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length -1);
        return lastElement;
    }

    public boolean isEmpty() {
        if (elements.length == 0){
            return true;
        }
        return false;
    }
}
