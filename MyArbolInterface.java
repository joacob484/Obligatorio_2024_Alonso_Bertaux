public interface MyArbolInterface <K extends Comparable<K>,T>{

    T find (K key);
    void inseert(K key, T data);
    void delete(K key);
}
