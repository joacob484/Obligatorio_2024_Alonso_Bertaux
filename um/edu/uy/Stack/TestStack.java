package um.edu.uy.Stack;

import org.junit.Test;
import um.edu.uy.Lista.ListaEnlazada;

import static org.junit.Assert.assertEquals;

public class TestStack {

    MyStackInterface<Integer> stackPrueba = new ListaEnlazada<>();

    @Test
    public void StackPrueba(){
        stackPrueba.push(1);
        stackPrueba.push(3);
        stackPrueba.push(4);
        stackPrueba.push(6);
        stackPrueba.push(7);
        stackPrueba.push(9);
        assertEquals(new Integer(9), stackPrueba.top());
        stackPrueba.pop();
        assertEquals(new Integer(7), stackPrueba.top());
        stackPrueba.pop();
        assertEquals(new Integer(6), stackPrueba.top());
        stackPrueba.pop();
        assertEquals(new Integer(4), stackPrueba.top());
        stackPrueba.pop();
        assertEquals(new Integer(3), stackPrueba.top());
        stackPrueba.pop();
        assertEquals(new Integer(1), stackPrueba.top());
        stackPrueba.pop();
    }
}
