import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    BaseDatos: Clase para conectarse a base de datos MySQL/MariaDB
*/
public class BaseDatos {
    // Atributo estatico que representa una conexion SQL
    private static Connection con;

    /*
        Metodo para crear una conexion a la base de datos MySQL
        Parametros:
        ser = nombre de servidor o IP
        usu = nombre de usuario
        pas = contrasena del usuario
        nom = nombre de la base de datos
     */
    public void conectar(String ser, String usu, String pas, String nom) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Carga la clase Driver del paquete com.mysql.jdbc del conector
            con = DriverManager.getConnection("jdbc:mysql://" + ser + "/" + nom, usu, pas); // Crea la conexion
            System.out.println("Conexion exitosa.");
        } catch (ClassNotFoundException e) { // Esta excepcion ocurre cuando no encuentra el conector
            System.err.println("No encuentra conector MySQL.");
        } catch (SQLException e) { // Esta excepcion ocurre cuando hay un problema con la conexion a la base de datos
            System.err.println("Conexion fallida.");
        }
    }

    /*
        Metodo para cerrar la conexion al servidor de base de datos
     */
     public void cerrar() {
         try {
             con.close(); // Llamada a metodo que cierra la conexion
             System.out.println("Conexion cerrada.");
         } catch (SQLException e) { // Excepcion que puede ocurrir al cerrar la conexion
             System.err.println("Error al cerrar conexion.");
         }
    }

    public void obtener() {
        String consulta = "SELECT email FROM users";
        Statement st = null;
        try {
            st = con.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(consulta);

            while (resultSet.next()) {
                System.out.println("E-mail: " + resultSet.getString("email"));
            }

        } catch (SQLException e) {
            System.err.println("Vaya. No funciono.");
        }

    }
}
