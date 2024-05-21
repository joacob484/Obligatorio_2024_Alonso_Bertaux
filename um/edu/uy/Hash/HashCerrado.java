package um.edu.uy.Hash;

public class HashCerrado<K extends Comparable<K>,V> implements MyHashInterface<K,V> {
private NodoHash<K,V>[] tablahash;
private int size;
private double LoadFactor =0.79;

public int capacity;

    public HashCerrado() {
        this.capacity = 0;
        this.tablahash = new NodoHash[capacity];
        this.size = 0;
    }

    private void resize(){
        NodoHash<K,V>[] oldTable = tablahash;
        capacity = 2 * capacity;
        size = 0;
        tablahash = new NodoHash[capacity];
        for (NodoHash<K,V> nodoTemp: oldTable){
            while(nodoTemp != null){
                put(nodoTemp.getKey(),nodoTemp.getValue());
                nodoTemp = nodoTemp.getNext();
            }
        }
    }

    @Override
    public void put(K key, V value) {
        if((double)(size + 1) >= capacity * LoadFactor) {
            resize();
        }
        else{
            int pos = key.hashCode() % size;
            NodoHash<K, V> nodoAgregado = new NodoHash<>(key, value);
            if (tablahash[pos] == null) {
                tablahash[pos] = nodoAgregado;
            } else {
                NodoHash<K, V> nodoTemp = tablahash[pos];
                while (nodoTemp.getNext() != null) {
                    nodoTemp = nodoAgregado.getNext();
                }
                nodoTemp.setNext(nodoAgregado);
            }
        }
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public void remove(K clave) {

    }

}
