public class Principal {
    public static void main(String[] args) {
        int i = 0;
        int[] conteo;
        conteo = new int[4];

        conteo[0] = 17;
        conteo[1] = conteo[0] * 5;
        conteo[2]++;
        conteo[3] -= 20;

        while (i < 4) {
            System.out.println("Usando WHILE : " + conteo[i]);
            i++;
        }

        for (i = 0; i < 4; i++) {
            System.out.println("Usando FOR : " + conteo[i]);
        }

    }
}
