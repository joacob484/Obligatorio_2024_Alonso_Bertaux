package um.edu.uy.Stack;

import java.util.EmptyStackException;

public interface MyStackInterface<T> {
    void pop () throws EmptyStackException;
    T top() throws EmptyStackException;
    void push(T element);


    boolean isEmpty ();
    void makeEmpty();


}
