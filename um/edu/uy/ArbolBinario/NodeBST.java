package um.edu.uy.ArbolBinario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NodeBST <K, T> {
    private K key;
    private T data;
    private NodeBST<K, T> leftChild;
    private NodeBST<K, T> rightChild;

    public NodeBST(K key, T data){
        this.key = key;
        this.data = data;
    }

    public NodeBST<K, T> find(K key){
        if (this.getKey() == key){
            return this;
        }
        NodeBST<K, T> result = null;
        if (this.getLeftChild() != null){
            result = this.getLeftChild().find(key);
        }
        if (result == null && this.getRightChild() != null){
            result = this.getRightChild().find(key);
        }
        return result;
    }

    public NodeBST<K, T> findParent(K key){
        if (this.getKey() == key){
            return this;
        }
        NodeBST<K, T> result = null;
        if (this.getLeftChild() != null){
            result = this.getLeftChild().findParent(key);
        }
        if (result == null && this.getRightChild() != null){
            result = this.getRightChild().findParent(key);
        }

        if (result != null && result.getKey() == key){
            result = this;
        }

        return result;
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

    public NodeBST<K, T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodeBST<K, T> leftChild) {
        this.leftChild = leftChild;
    }

    public NodeBST<K, T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeBST<K, T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean equals(NodeBST<K, T> node) {
        return node.getKey().equals(this.key);
    }
}

