package um.edu.uy.Lista;

import org.junit.Test;
import um.edu.uy.Queue.EmptyQueueException;
import um.edu.uy.Queue.MyQueueInterface;
import um.edu.uy.Stack.MyStackInterface;

import static org.junit.Assert.assertEquals;

public class TestListas {

    @Test
    public void testAdd(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(1);
        assertEquals(1, lista.size());
        assertEquals(1,lista.get(0));
    }
    @Test
    public void testRemove(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.remove(1);
        assertEquals(2, lista.size());
        assertEquals(2,lista.get(0));
        assertEquals(3,lista.get(1));
    }
    @Test
    public void testSize(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(3, lista.size());
    }
    @Test
    public void testGet(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(2, lista.get(1));
    }

    @Test
    public void testContains(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(true, lista.contains(2));
        assertEquals(false, lista.contains(4));

    }
    @Test
    public void testenqueue() throws EmptyQueueException {
        MyQueueInterface cola = new ListaEnlazada();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        assertEquals(1, cola.dequeue());
        assertEquals(2, cola.dequeue());
        assertEquals(3, cola.dequeue());
    }
@Test
    public void testdequeue() throws EmptyQueueException {
        MyQueueInterface cola = new ListaEnlazada();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        assertEquals(1, cola.dequeue());
        assertEquals(2, cola.dequeue());
        assertEquals(3, cola.dequeue());
    }
    @Test
    public void testpop(){
        MyStackInterface pila = new ListaEnlazada();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        assertEquals(3, pila.pop());
        assertEquals(2, pila.pop());
        assertEquals(1, pila.pop());
    }
    @Test
    public void testtop(){
        MyStackInterface pila = new ListaEnlazada();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        assertEquals(3, pila.top());
    }
    @Test
    public void testPush(){
        MyStackInterface pila = new ListaEnlazada();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        assertEquals(3, pila.pop());
        assertEquals(2, pila.pop());
        assertEquals(1, pila.pop());
    }


}
