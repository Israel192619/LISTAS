package lde;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguiente;

    public Nodo(Nodo anterior, Object dato, Nodo siguiente) {
        this.setAnterior(anterior);
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }


    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
