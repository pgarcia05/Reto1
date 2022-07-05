package Principal;

import Vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        //1. Llamar la clase conexión para conectar con la base de datos
        Conexion conexionDB = new Conexion();

        //2. Creamos la instancia de la vista login
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);

        //2. Crear instancia de la clase Conexión
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }

}
