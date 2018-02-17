public class Main {
    public static void main(String[] args) {
        // Impresion en consola
        System.out.println("Bievenidos a PC2");

        /* Numeros Enteros
        byte, short, int, long
        */
        byte a1;
        a1 = 10;
        short a2 = 15;
        int a3 = 20;
        long a4 = 25;

        System.out.println("Enteros: " + a1 + " " + a2
                    + " " + a3 + " " + a4);

        /* Numeros Decimales
        float, double
        */
        float b1 = 0.000005f;
        double b2 = 150.150;

        System.out.println("Decimales: " + b1 + " " + b2);

        // Caracteres
        char sexo1 = 'M';
        // Cadenas
        String sexo2 = "M";
        System.out.println("Caracteres: " + sexo1);
        System.out.println("Cadenas: " + sexo2);

        // Booleanos
        boolean esAdmin = true;
        System.out.println("Booleano: " + esAdmin);

        // Operadores Aritmeticos
        System.out.println( 1+2 );
        System.out.println( 2-1 );
        System.out.println( 2*2 );
        System.out.println( 5/2.0 );
        System.out.println( 5%2 );
    }
}