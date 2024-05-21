public class ListaDoblementeEnlazada <T> implements ListaEnlazadaInterface<T>{

    public Nodo <T> primero;
    public int Length;

    public ListaDoblementeEnlazada() {
        this.primero = null;
        Length = 0;
    }
    @Override
    public void add(T value) {
        if (primero != null){
            Nodo <T> temp = primero;
            while(temp.getNext()!= null)
                temp = temp.getNext();
            Nodo <T> NuevoNodo =  new Nodo<>(value);
            temp.setNext(NuevoNodo);
            NuevoNodo.setAnterior(temp);
            Length = Length+1;
        }
        else
            primero = new Nodo<>(value);
    }

    @Override
    public void remove(int posicion) {
        if (primero != null){
            Nodo <T> temp = primero;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getNext();
            }
            if (temp.getNext().getNext() != null){
                temp.setNext(temp.getNext().getNext());
                temp.getNext().getNext().setAnterior(temp);
            }
            else
                temp.setNext(null);
        }

        Length = Length -1;
    }

    @Override
    public T get(int position) {
        Nodo <T> temp = primero;
        while (temp != null){
            for (int i = 0; i < position; i=i+1) {
                temp = temp.getNext();
            }
            return temp.getValue();
        }
        return null;
    }

    public int size(){
        return Length;
    }

    public void AddFirst(T value){
        Nodo<T> temp = new Nodo<>(value);
        if (primero != null){
            temp.setNext(primero);
            primero.setAnterior(temp);
            primero = temp;
        }
        Length ++;

    }

}
