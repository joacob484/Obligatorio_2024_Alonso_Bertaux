package um.edu.uy.Hash;
import java.lang.Math;
public class HashCerrado<K extends Comparable<K>,V> implements MyHashInterface<K,V> {
private NodoHash<K,V>[] tablahash;
private int size;
private double LoadFactor =0.79;

public int capacity;

    public HashCerrado() {
        this.capacity = 1;
        this.tablahash = new NodoHash[capacity];
        this.size = 0;
    }

    private void resize() {
        NodoHash<K, V>[] oldTable = tablahash;
        capacity = 2 * capacity;
        size = 0;
        tablahash = new NodoHash[capacity];
        for (NodoHash<K, V> nodoTemp : oldTable) {
            if(nodoTemp != null ){
                put(nodoTemp.getKey(), nodoTemp.getValue());
            }
        }
    }

    @Override
    public void put(K key, V value) {
        int pos = HashFunction(key);
        NodoHash<K, V> nodoAgregado = new NodoHash<>(key, value);
        if (tablahash[pos] == null) {
            tablahash[pos] = nodoAgregado;
        } else {
            while (tablahash[pos] != null) {
                if(pos == capacity-1){
                    pos=0;
                }
                pos = pos + 1;
            }
            tablahash[pos] = nodoAgregado;
        }
        size ++;
        if((size) >= (int)(capacity * LoadFactor)) {
            resize();
        }

    }

    @Override
    public boolean contains(K key) {
        int pos = HashFunction(key);
        while (pos<capacity && tablahash[pos] != null){
            if(tablahash[pos].getKey().equals(key)){
                return true;
            }
            pos =pos +1;
        }
        return false;
    }

    @Override
    public void remove(K clave) {
        int pos = HashFunction(clave);
        while(tablahash[pos]!= null) {
            if (tablahash[pos].getKey().equals(clave)) {
                tablahash[pos] = null;
            }
            pos = (pos + 1)%capacity;
        }
        size --;
    }

    public int HashFunction(K key){
        int HashValue = key.hashCode();
        return Math.abs(HashValue) % capacity;
    }
}
