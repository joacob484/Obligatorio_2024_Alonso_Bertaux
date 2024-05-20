public interface MyArbolInterface <K,T>{

    T find (K key);
    void inseert(K key, T data);
    void delete(K key);
}
