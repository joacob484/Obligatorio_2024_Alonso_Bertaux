package um.edu.uy.Stack;

import org.junit.Test;
import um.edu.uy.Lista.ListaEnlazada;

import static org.junit.Assert.*;

public class TestStack {



    @Test
    public void StackPrueba() {

        MyStackInterface<Integer> colStack = new ListaEnlazada<>();

        colStack.push(new Integer(2));
        colStack.push(new Integer(4));
        colStack.push(new Integer(7));

        assertEquals(new Integer(7), colStack.top());

        try {

            assertEquals(new Integer(7), colStack.pop());

        } catch (EmptyStackException e) {

            fail(e.getMessage());

        }

        assertEquals(new Integer(4), colStack.top());

        try {

            assertEquals(new Integer(4), colStack.pop());

        } catch (EmptyStackException e) {

            fail(e.getMessage());

        }

        try {

            assertEquals(new Integer(2), colStack.pop());

        } catch (EmptyStackException e) {

            fail(e.getMessage());

        }
        try {

            colStack.pop();

            fail("El stack deberia estar vacio");

        } catch (EmptyStackException e) {

            assertTrue(true);

        }
    }

}
