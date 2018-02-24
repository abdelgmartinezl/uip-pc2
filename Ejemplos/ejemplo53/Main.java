import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String nombre, marca, modelo;
        int tanque;

        BufferedReader x = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Nombre: ");
        nombre = x.readLine();
        System.out.print("Marca: ");
        marca = x.readLine();
        System.out.print("Modelo: ");
        modelo = x.readLine();
        System.out.print("Tanque: ");
        tanque = Integer.parseInt(x.readLine());

        Carro c = new Carro(marca, modelo, tanque);
        System.out.println("¡Bienvenido(a), " + nombre 
            + " a tu " + c.getMarca() + " " + c.getModelo() + "!");
    }
}