package um.edu.uy.Stack;

import java.util.EmptyStackException;

public interface MyStackInterface<T> {
    void push(T value);

    T pop() throws EmptyStackException;

    T top();

    int size();



}
