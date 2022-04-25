package lde;

public class ListaDoblementeEnlazada {
    Nodo inicio;
    public ListaDoblementeEnlazada(){
        inicio=null;
    }
    public boolean estaVacio(){
        return inicio == null;
    }

    public void insertar(Object dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null,dato,null);
            inicio=nuevo;
        }else {
            Nodo nuevo = new Nodo(null,dato,inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void eliminar(){
        if (!estaVacio()){
            if (inicio.getSiguiente()==null){
                inicio = inicio.getSiguiente();
            }else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }

    public void mostrarAdelante(){
        if (!estaVacio()) {
            Nodo temp = inicio;
            while (temp != null){
                System.out.print(temp.getDato()+"  ");
                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }

    public void mostrarAtras(){
        if (!estaVacio()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }

            Nodo temp = ultimo;
            while (temp != null){
                System.out.print(temp.getDato()+"  ");
                temp = temp.getAnterior();
            }
            System.out.println();
        }
    }
}
