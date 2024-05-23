package um.edu.uy.Stack;
import um.edu.uy.Stack.EmptyStackException;
public interface MyStackInterface<T> {
    void push(T value);

    T pop() throws EmptyStackException;

    T top();

    int size();



}
