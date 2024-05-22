package um.edu.uy.Queue;

import org.junit.Test;
import um.edu.uy.Lista.ListaEnlazada;

import static org.junit.Assert.*;

public class TestQueue {

    @Test
    public void testQueue() {
        MyQueueInterface<Integer> queue = new ListaEnlazada<>();

        queue.enqueue(new Integer(21));
        queue.enqueue(new Integer(34));
        queue.enqueue(new Integer(3));

        assertTrue(queue.contains(21));
        assertEquals(3, queue.size());

        try {
            assertEquals(new Integer(21), queue.dequeue());
        }
        catch (EmptyQueueException e) {
            fail(e.getMessage());
        }

        assertFalse(queue.contains(21));
        assertEquals(2, queue.size());
        assertTrue(queue.contains(34));
        assertFalse(queue.contains(18));

        try {
            assertEquals(new Integer(34), queue.dequeue());
        }
        catch (EmptyQueueException e) {
            fail(e.getMessage());
        }
        try {
            assertEquals(new Integer(3), queue.dequeue());
        }
        catch (EmptyQueueException e) {
            fail(e.getMessage());
        }
        try {
            queue.dequeue();
            fail("Se espera excepcion");
        }
        catch (EmptyQueueException e) {
            assertTrue(true);
        }
    }
}
