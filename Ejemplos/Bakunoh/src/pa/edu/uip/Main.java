package pa.edu.uip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        double billete = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> corral = new HashMap<>();
        corral.put("Petra", 500.73);
        corral.put("Calixtra", 100.0);
        corral.put("Toribia", 137.0);
        corral.put("Norita", 1508.33);

        do {
            System.out.println("\n\nSistema Bakunoh");
            System.out.println("1. Ver vacas\n2. Ver peso\n3. Agregar vaca\n4. Vender vaca\n5. Salir");
            try {
                System.out.print("Opcion: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Data invalida :: " + e.getMessage());
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    if (corral.size() == 0) {
                        System.out.println("Largate a comprar vacas");
                    } else {
                        for (HashMap.Entry<String, Double> vaca : corral.entrySet()) {
                            System.out.print(vaca.getKey() + ", ");
                        }
                    }
                    break;
                case 2:
                    String nom_vac = "";
                    boolean existe = false;
                    if (corral.size() == 0) {
                        System.out.println("Largate a comprar vacas");
                    } else {
                        do {
                            try {
                                System.out.print("Nombre de la Vaca: ");
                                nom_vac = br.readLine();
                            } catch (Exception e) {
                                System.out.println("NO uses mas mi sistema");
                            }
                        } while (nom_vac.equals("") || nom_vac.equals(" "));

                        for (HashMap.Entry<String, Double> vaca : corral.entrySet()) {
                            if (vaca.getKey().toLowerCase().equals(nom_vac.toLowerCase())) {
                                existe = true;
                                System.out.println("La vaca " + nom_vac + " pesa " + vaca.getValue() + "lb.");
                            }
                        }

                        if (!existe) {
                            System.out.println("Esa vaca no la tengo yo, quizas el vecino...");
                        }
                    }
                    break;
                case 3:
                    String nombre = "";
                    double peso = 0.0;

                    do {
                        try {
                            System.out.print("Nombre de la Vaca: ");
                            nombre = br.readLine();
                        } catch (Exception e) {
                            System.out.println("NO uses mas mi sistema");
                        }
                    } while (nombre.equals("") || nombre.equals(" "));

                    do {
                        try {
                            System.out.print("Peso de la Vaca: ");
                            peso = Double.parseDouble(br.readLine());
                        } catch (Exception e) {
                            System.out.println("Tas loco, peso invalido!");
                        }
                        if (peso <= 0.0) {
                            System.out.println("No se Rick, me parece falso!");
                        }
                    } while (peso <= 0.0);

                    corral.put(nombre, peso);

                    break;
                case 4:
                    nom_vac = "";
                    existe = false;
                    if (corral.size() == 0) {
                        System.out.println("No puedes vender vacas fantasmas");
                    } else {
                        do {
                            try {
                                System.out.print("Nombre de la Vaca: ");
                                nom_vac = br.readLine();
                            } catch (Exception e) {
                                System.out.println("NO uses mas mi sistema");
                            }
                        } while (nom_vac.equals("") || nom_vac.equals(" "));

                        for (HashMap.Entry<String, Double> vaca : corral.entrySet()) {
                            if (vaca.getKey().toLowerCase().equals(nom_vac.toLowerCase())) {
                                existe = true;
                                System.out.println("Vendido! La vaca " + nom_vac + " te generó $" + vaca.getValue()*5);
                                billete += vaca.getValue()*5;
                                nom_vac = vaca.getKey();
                            }
                        }

                        if (!existe) {
                            System.out.println("Esa no la tengo, se la puedo transar al vecino...");
                        } else {
                            corral.remove(nom_vac);
                        }

                    }
                    break;
                case 5:
                    System.out.println("Largate!");
                    System.out.println("Hey... Sumaste $" + billete);
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while(opcion != 5);
    }
}
