package um.edu.uy.Hash;
import um.edu.uy.Hash.HashCerrado;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;



public class TestHash {


    @Test
    public void testPut(){
        MyHashInterface<Integer, String> hash = new HashCerrado<>();
        hash.put(1, "uno");
        hash.put(2, "dos");
        hash.put(3, "tres");
        assertTrue(hash.contains(1));
        assertTrue(hash.contains(2));
        assertTrue(hash.contains(3));
    }
    public void testRemove(){
        MyHashInterface<Integer, String> hash = new HashCerrado<>();
        hash.put(1, "uno");
        hash.put(2, "dos");
        hash.remove(1);
        assertFalse(hash.contains(1));
    }


}
