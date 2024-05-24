package um.edu.uy.ArbolBinario;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestArbol {
        @Test
        public void testAdd(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.contains(3));
                assertTrue(arbol.contains(7));
                assertTrue(arbol.contains(2));
                assertTrue(arbol.contains(4));
        }
        @Test
        public void testRemove(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                arbol.remove(3);
                arbol.remove(2);
                arbol.remove(7);
                arbol.remove(4);
                assertTrue(!arbol.contains(3));
                assertTrue(!arbol.contains(7));
                assertTrue(!arbol.contains(2));
                assertTrue(!arbol.contains(4));
        }
        @Test
        public void testContains(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.contains(3));
                assertTrue(arbol.contains(7));
                assertTrue(arbol.contains(2));
                assertTrue(arbol.contains(4));
        }
        @Test
        public void testFind(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.find(3) == 3);
                assertTrue(arbol.find(7) == 7);
                assertTrue(arbol.find(2) == 2);
                assertTrue(arbol.find(4) == 4);
        }
        @Test
        public void testPreOrder(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.preOrder().get(0) == 5);
                assertTrue(arbol.preOrder().get(1) == 3);
                assertTrue(arbol.preOrder().get(2) == 2);
                assertTrue(arbol.preOrder().get(3) == 4);
                assertTrue(arbol.preOrder().get(4) == 7);
        }
        @Test
        public void testPosOrder(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.posOrder().get(0) == 2);
                assertTrue(arbol.posOrder().get(1) == 4);
                assertTrue(arbol.posOrder().get(2) == 3);
                assertTrue(arbol.posOrder().get(3) == 7);
                assertTrue(arbol.posOrder().get(4) == 5);
        }
        @Test
        public void testInOrder(){
                ArbolBinario<Integer> arbol = new ArbolBinario<>(5);
                arbol.add(3);
                arbol.add(7);
                arbol.add(2);
                arbol.add(4);
                assertTrue(arbol.inOrder().get(0) == 2);
                assertTrue(arbol.inOrder().get(1) == 3);
                assertTrue(arbol.inOrder().get(2) == 4);
                assertTrue(arbol.inOrder().get(3) == 5);
                assertTrue(arbol.inOrder().get(4) == 7);
        }


}
