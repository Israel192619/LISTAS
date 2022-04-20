public class Lista_SE {
    Nodo inicio;

    public Lista_SE(){
        this.inicio=null;
    }
    public boolean estavacio(){
        return inicio==null;
    }


    public int tamaño(){
        int contador = 1;
        Nodo aux=inicio;
        while (aux.getSiguiente() !=null){
            contador ++;
            aux=aux.getSiguiente();
        }
        if (contador != 0){
            contador ++;
        }
        return contador;
    }

    public Object ultinoDato(){
        Nodo aux = inicio;
        while (aux.getSiguiente() != null){
            aux=aux.getSiguiente();
        }
        return aux.getDato();
    }
    public void insertarInicio(Object dato){
        if(estavacio()){
            this.inicio = new Nodo(dato, null);
        }else {
            Nodo aux = inicio;
            this.inicio=new Nodo(dato, aux);
        }
    }

    public void eliminarInicio(){
        if (estavacio()){
            this.inicio= inicio.getSiguiente();
        }
    }
    public void mostrar(){
        if (estavacio()){
            System.out.println("esta vacio");
        }else {
            Nodo aux = inicio;
            while (aux != null){
                System.out.print(aux.getDato()+" ");
                aux = aux.getSiguiente();
            }
            System.out.println(" ");
        }
    }
}
