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

        listaPrueba.add(4);
        listaPrueba.add(8);


    }


}
