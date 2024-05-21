package um.edu.uy.ArbolBinario;

import java.util.Objects;

public class NodeBST <K,T> {

    K key;
    T data;

    NodeBST<K,T> leftchild;
    NodeBST<K,T> rightchild;

    public NodeBST(K key, T data) {
        this.key = key;
        this.data = data;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeBST<K, T> getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(NodeBST<K, T> leftchild) {
        this.leftchild = leftchild;
    }

    public NodeBST<K, T> getRightchild() {
        return rightchild;
    }

    public void setRightchild(NodeBST<K, T> rightchild) {
        this.rightchild = rightchild;
    }


}
