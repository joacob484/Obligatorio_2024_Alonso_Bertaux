package um.edu.uy.Hash;

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

    private void resize(){
        NodoHash<K,V>[] oldTable = tablahash;
        capacity = 2 * capacity;
        size = 0;
        tablahash = new NodoHash[capacity];
        for (NodoHash<K,V> nodoTemp: oldTable)
            while (nodoTemp != null && !nodoTemp.getBorrado()) {
                put(nodoTemp.getKey(), nodoTemp.getValue());
                nodoTemp = nodoTemp.getNext();
            }
    }

    @Override
    public void put(K key, V value) {
        if((double)(size + 1) >= capacity * LoadFactor) {
            resize();
        }
        else{
            int pos = HashFunction(key);
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
        int pos = HashFunction(key);
        while (tablahash[pos] != null){
            if(tablahash[pos].getKey().equals(key)){
                return true;
            }
            pos = pos +1;
        }
        return false;
    }

    @Override
    public void remove(K clave) {
        int pos = HashFunction(clave);
        while(tablahash[pos]!= null) {
            if (tablahash[pos].getKey().equals(clave)) {
                tablahash[pos].setBorrado(true);
                tablahash[pos] = null;
            }
            pos = pos + 1;
        }
    }

    public int HashFunction(K key){
        int HashValue = key.hashCode();
        return Math.abs(HashValue) % capacity;
    }
}
