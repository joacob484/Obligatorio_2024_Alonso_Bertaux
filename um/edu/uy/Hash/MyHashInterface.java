package um.edu.uy.Hash;

public interface MyHashInterface <K,V> {

    public void put(K key, V value);
    public boolean contains(K key);
    public void remove(K clave);
}
