package um.edu.uy.ArbolBinario;

import java.util.List;

public interface MyArbolInterface <T>{

    void add(T oElement);

    void remove(T oElement);

    boolean contains(T oElement);

    T find(T oElement);

    List<T> preOrder();

    List<T> posOrder();

    List<T> inOrder();
}
