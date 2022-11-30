package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnectDb() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");        
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test", "root", "Guimaraes2");
        //System.out.println("Banco de dados - Conectado com sucesso");
        return cn;
    }

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public DatabaseConnection() {

    }

    public void connectToDatabase() throws SQLException {

        String server = "localhost";
        String port = "3306";
        String database = "db_test";
        String userName = "root";
        String password = "Guimaraes2";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
        System.out.println("Banco de dados - Conectado com sucesso");

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

  
}
