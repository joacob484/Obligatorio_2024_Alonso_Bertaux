import java.util.EmptyStackException;

public class Stack<T> implements MyStackInterface<T>{

    private Nodo <T> top = null;
    public Integer Length;
    public Stack(){
        top = null;
        Length = 0;
    }

    @Override
    public void pop() throws EmptyStackException {
        if (top.getValue() == null){
            throw new EmptyStackException();
        }
        else {
            top = top.getAnterior();
            Length = Length -1;
        }
    }

    @Override
    public T top() throws EmptyStackException {
        if (Length == 0){
            throw new EmptyStackException();
        }
        if (Length == 1){
            return top.getValue();
        }
        if (Length > 1){
            Nodo<T> temp = top;
            top = temp.getAnterior();
            return temp.getValue();
        }
        return null;
    }

    @Override
    public void push(T element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void makeEmpty() {

    }
}
