package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class DbData {
    private final String driver= "com.mysql.cj.jdbc.Driver"; // Cambiado a la nueva clase del controlador
    private final String user = "root";
    private final String pass = ""; // Reemplaza con la contraseña de tu base de datos si la tienes
    private final String url = "jdbc:mysql://localhost:3306/pet_manager"; // Cambiado al puerto predeterminado

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getUrl() {
        return url;
    }

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            // Manejo de errores aquí
            e.printStackTrace(); // Cambia esto al manejo de errores apropiado en tu aplicación
        }
        return conn;
    }
}