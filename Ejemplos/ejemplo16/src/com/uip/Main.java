package com.uip;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Ejecutemos al sospechoso");
            System.out.println("Sospechoso 1");
            int n = Integer.parseInt("M"); // Error en ejecución
            System.out.println("Sospechoso 2");
            System.out.println("Sospechoso 3");
        } catch (NumberFormatException e) {
            System.out.println("Capturamos NumberFormatException");
        } catch (Exception e) {
            System.out.println("Capturamos Exception");
        } finally {
            System.out.println("Capturamos o no al sospechoso");
        }

        /*try {
            System.out.println("Bloque de codigo sospechoso");
        } catch (Exception e) {
            System.out.println("Ocurrio una excepcion");
        } finally {
            System.out.println("Siempre me ejecuto.");
        }*/
    }
}
