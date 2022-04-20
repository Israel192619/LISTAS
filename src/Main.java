public class Main {
    public static void main(String[] args) {
        // write your code here
        Lista_SE listp = new Lista_SE();
        listp.mostrar();

        listp.insertarInicio(5654);
        listp.insertarInicio(6584);
        listp.insertarInicio(98);
        listp.insertarInicio("INFO");
        listp.insertarInicio("ISRAEL");
        listp.insertarInicio("ZABALA");
        listp.insertarInicio("CUEVAS");

        listp.mostrar();
    }
}
