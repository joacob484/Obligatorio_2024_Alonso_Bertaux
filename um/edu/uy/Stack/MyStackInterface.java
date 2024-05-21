package um.edu.uy.Stack;

import java.util.EmptyStackException;

public interface MyStackInterface<T> {
    T pop () throws EmptyStackException;
    T top() throws EmptyStackException;
    void push(T element);



}
