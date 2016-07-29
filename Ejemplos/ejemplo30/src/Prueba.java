public class Prueba {
    public static void main(String args[]) {
        BaseDatos bd = new BaseDatos();
        bd.conectar("192.168.56.2","pepito","pepito","test");
        bd.cerrar();
        bd.obtener();
    }
}
