public class PruebaEnum {
    Dia dia;

    public PruebaEnum(Dia dia) {
        this.dia = dia;
    }

    public void probarDia() {
        switch (dia) {
            case LUNES:
                System.out.println("Los lunes son aburridos.");
                break;
            case VIERNES:
                System.out.println("Los viernes son mejores.");
                break;
            case SABADO: case DOMINGO:
                System.out.println("Los fines de semana no deben acabar.");
                break;
            case JUEVES:
                System.out.println("Hay clases de PC-2.");
                break;
            default:
                System.out.println("Meh! Da igual.");
                break;
        }
    }

    public static void main(String[] args) {
        PruebaEnum primerDia = new PruebaEnum(Dia.LUNES);
        primerDia.probarDia();
    }
}
