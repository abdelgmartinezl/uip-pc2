package empresa;

/**
 * Clase que describe al cliente de una empresa.
 * @author Abdel G. Martinez L.
 * @version 1.0
 */

public class Cliente extends Persona {
	private String telefonoContacto;

	/**
	 * @return el telefono de contacto del cliente
	 */
	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	/**
	 * @param telefonoContacto el telefono de contacto por asignar al cliente
	 */
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

}
