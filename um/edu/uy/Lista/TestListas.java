package um.edu.uy.Lista;

import org.junit.Test;
import um.edu.uy.Queue.EmptyQueueException;
import um.edu.uy.Queue.MyQueueInterface;
import um.edu.uy.Stack.MyStackInterface;
import um.edu.uy.Lista.ListaEnlazada;
import um.edu.uy.Lista.ListaEnlazadaInterface;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class TestListas {

    @Test
    public void PruebaListaEnlazada(){

        ListaEnlazadaInterface<Integer> listaPrueba = new ListaEnlazada<>();

        listaPrueba.add(1);
        listaPrueba.add(8);
        listaPrueba.add(3);
        listaPrueba.add(5);

        assertEquals(4, listaPrueba.size());

        assertEquals(new Integer(1), listaPrueba.get(0));
        assertEquals(new Integer(5), listaPrueba.get(3));

        assertTrue(listaPrueba.contains(5));

        assertFalse(listaPrueba.contains(12));
        listaPrueba.remove(12);
        assertEquals(4, listaPrueba.size());

        listaPrueba.remove(8);
        listaPrueba.remove(3);
        listaPrueba.remove(1);

        assertEquals(1, listaPrueba.size());
        assertNull(listaPrueba.get(2));
        assertEquals(new Integer(5), listaPrueba.get(0));



    }


}
