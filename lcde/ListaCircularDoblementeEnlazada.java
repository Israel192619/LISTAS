package lcde;

public class ListaCircularDoblementeEnlazada {
    Nodo inicio;
    public ListaCircularDoblementeEnlazada(){
        inicio = null;
    }
    public boolean estaVacia(){
        return inicio == null;
    }
    public void insertarFinal(Object dato){
        if (estaVacia()){
            Nodo nuevo = new Nodo();
            nuevo.setAnterio(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        }else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente()!=inicio) {
                ultimo = ultimo.getSiguiente();
            }

            Nodo nuevo = new Nodo();
            nuevo.setAnterio(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterio(nuevo);
        }
    }
    public void eliminarFinal(){
        if (!estaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }

            Nodo penultimo = ultimo.getAnterio();
            penultimo.setSiguiente(inicio);

            inicio.setAnterio(penultimo);
        }
    }
    public void mostrar(){
        if (!estaVacia()){
            Nodo temp = inicio;
            while (temp.getSiguiente() != inicio){
                System.out.print(temp.getDato()+"   ");

                temp = temp.getSiguiente();
            }
            System.out.println(temp.getDato());
        }
    }
    public void mostrarAdelante(int vueltas){
        if (!estaVacia()){
            Nodo temp = inicio;
            int contador = 0;
            while (contador < vueltas){
                if (temp.getSiguiente() == inicio){
                    contador++;
                }

                System.out.print(temp.getDato()+"   ");
                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostrarAtras(int vueltas){
        if (!estaVacia()){
            Nodo temp = inicio.getAnterio();
            int contador = 0;
            while (contador < vueltas){
                if (temp.getAnterio() == inicio){
                    contador++;
                }

                System.out.print(temp.getDato()+"   ");
                temp = temp.getAnterio();
            }
            System.out.println(temp.getDato());
        }
    }
}
