package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author rburgmac
 * Classe responsável pela conexão e persistência diretamente na base de dados
 */
public abstract class DAO {

    public final static Logger log = Logger.getLogger(String.valueOf(DAO.class));
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    private static Connection connect;

    public static void getConnection(String SERVER, String PORT, String DATABASE, String USERNAME, String PASSWORD) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_NAME);
        connect = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USERNAME, PASSWORD);
    }

}
