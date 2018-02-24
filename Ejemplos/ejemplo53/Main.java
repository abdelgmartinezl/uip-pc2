import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String nombre = "", marca = "", modelo = "";
        int tanque = 0;

        BufferedReader x = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Nombre: ");
        try {
            nombre = x.readLine();
        } catch (Exception e) {
            System.out.println("Dato invalido");
        }
        System.out.print("Marca: ");
        try {
            marca = x.readLine();
        } catch (Exception e) {
            System.out.println("Dato invalido");
        }        
        System.out.print("Modelo: ");
        try {
            modelo = x.readLine();
        } catch (Exception e) {
            System.out.println("Dato invalido");
        }
        System.out.print("Tanque: ");
        try {
            tanque = Integer.parseInt(x.readLine());
        } catch (Exception e) {
            System.out.println("Dato invalido");
        }

        Carro c = new Carro(marca, modelo, tanque);
        System.out.println("¡Bienvenido(a), " + nombre 
            + " a tu " + c.getMarca() + " " + c.getModelo() + "!");
    }
}