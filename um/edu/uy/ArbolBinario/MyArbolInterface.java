package um.edu.uy.ArbolBinario;

import java.util.List;
import um.edu.uy.ArbolBinario.Exceptions.ChildsAreOccupied;
import um.edu.uy.ArbolBinario.Exceptions.KeyAlreadyExists;
import um.edu.uy.ArbolBinario.Exceptions.KeyDoesNotExist;
import um.edu.uy.ArbolBinario.Exceptions.WrongArgumentException;
import um.edu.uy.Lista.ListaEnlazada;
public interface MyArbolInterface < K extends Comparable<K>,T>{

    void insert(K key,T data,K parentKey) throws ChildsAreOccupied, WrongArgumentException, KeyDoesNotExist, KeyAlreadyExists;

    T find(K key) throws KeyDoesNotExist;
    void delete (K key);

    // cuenta	la	cantidad	de	elementos	dentro	del	árbol.
    int size(NodeBST<K, T> root);
    int size();

    // cuenta	la	cantidad	de	hojas	de	un	árbol.
    int countLeaf();

    // Cuenta el número	de nodos con subárboles
    // izquierdo y derecho no nulos.
    int countCompleteElements();

    ListaEnlazada<K> inOrder();

    ListaEnlazada<K> preOrder();

    ListaEnlazada<K> postOrder();

    ListaEnlazada<K> porNivel();

    void loadPostFijaExpression (String sPostFija);
}