package lcde;

public class Nodo {

    private Nodo anterio;
    private Object dato;
    private Nodo siguiente;

    public Nodo(){

    }

    public Nodo getAnterio() {
        return anterio;
    }

    public void setAnterio(Nodo anterio) {
        this.anterio = anterio;
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
