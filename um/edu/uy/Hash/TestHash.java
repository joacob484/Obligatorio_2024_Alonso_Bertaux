package um.edu.uy.Hash;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestHash {


    @Test
    public void PruebaHash(){
        MyHashInterface<Integer,Integer> HashPrueba = new HashCerrado<>();
        HashPrueba.put(3,3);
        HashPrueba.put(5,5);
        HashPrueba.put(7,7);
        HashPrueba.put(1,1);
        HashPrueba.put(13,13);
        HashPrueba.put(4,4);
        HashPrueba.put(9,9);
        HashPrueba.put(2,2);
        HashPrueba.put(17,17);
        assertEquals(true, HashPrueba.contains(4));
        assertEquals(true, HashPrueba.contains(7));
        assertEquals(true, HashPrueba.contains(5));
        assertEquals(true, HashPrueba.contains(13));
        assertEquals(true, HashPrueba.contains(2));
        assertEquals(true, HashPrueba.contains(17));
        HashPrueba.remove(2);
        HashPrueba.remove(17);
        HashPrueba.remove(5);
        HashPrueba.remove(3);

    }

}
