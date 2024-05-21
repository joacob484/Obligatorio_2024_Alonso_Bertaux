package um.edu.uy.Hash;

import java.util.Objects;

public class NodoHash <K,V>{
    private K key;
    private V value;

    private NodoHash<K,V> next;


    public NodoHash<K, V> getNext() {
        return next;
    }

    public NodoHash(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setNext(NodoHash<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodoHash<?, ?> nodoHash = (NodoHash<?, ?>) o;
        return Objects.equals(key, nodoHash.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
