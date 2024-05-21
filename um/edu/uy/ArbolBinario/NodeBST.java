package um.edu.uy.ArbolBinario;

import java.util.Objects;

public class NodeBST <K extends Comparable<K>,T> implements MyArbolInterface<K,T> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeBST<?, ?> nodeBST = (NodeBST<?, ?>) o;
        return Objects.equals(key, nodeBST.key);
    }


    @Override
    public T find(K key) {
        if(this.getKey().equals(key)){
            return this.getData();
        }
        if(this.getKey().compareTo(key)<0 && this.getLeftchild() != null){
            return this.getLeftchild().find(key);
        }
        if(this.getKey().compareTo(key)>0 && this.getRightchild() != null){
            return this.getRightchild().find(key);
        }
        return null;
    }

    @Override
    public void inseert(K key, T data) {
        NodeBST<K,T> nodoAgragado = new NodeBST<>(key,data);
        NodeBST<K,T> nodoTemp = this;
        if(nodoTemp == null){
            nodoTemp = nodoAgragado;
        }
        if(this.getKey().compareTo(key)<0){
            if(this.getLeftchild() == null){
                this.setLeftchild(nodoAgragado);
            }
            else{
                this.getLeftchild().inseert(key,data);
            }
        }
        if(this.getKey().compareTo(key)>0 ){
            if( this.getRightchild() == null){
                this.setRightchild(nodoAgragado);
            }
            else{
                this.getLeftchild().inseert(key,data);
            }
        }
    }

    @Override
    public void delete(K key) {
    }
}
