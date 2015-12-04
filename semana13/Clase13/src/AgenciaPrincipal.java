
public class AgenciaPrincipal {

	public static void main(String[] args) {
		AgenciaRenta agencia = new AgenciaRenta();
		AgenciaRentaUI ui = new AgenciaRentaUI(agencia);
		ui.iniciar();
	}

}
