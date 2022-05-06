package DAO;

import java.sql.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MysqlConected {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private ResultSet results;
    private Map<String, String> resultMap;
    private static String[] collunmsDB = {"IDMASSAS","NAME_PRODUCT","CUSTOMIZATION",
            "DISPLAY","DISPLAY_RESOLUTION","DISPLAY_SIZE",
            "MEMORY","OPERATING_SYSTEM","PROCESSOR",
            "TOUCHSCREEN","WEIGHT","COLOR"};

    public MysqlConected() throws Exception {
        connectionDataBase();
    }

    public Connection connectionDataBase() throws Exception {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/banco_teste_automacao?"
                            + "user=root&password=admin");
        return connect;
    }

    public Map<String, String> serchMassa() throws Exception {
        String sql = "SELECT * from massas";
        try {
            statement = connect.createStatement();
        }catch (SQLNonTransientConnectionException e){
            connectionDataBase();
            statement = connect.createStatement();
        }
        results = statement.executeQuery(sql);
        resultMap = new HashMap<>();
        resultMap = mapResultDBGenerator(results ,collunmsDB);
        connect.close();
        return resultMap;
    }

    public void updateColorMassa(String color ) throws Exception {
        String sql = "UPDATE massas\n" +
                "SET COLOR = '"+color+"'\n" +
                "WHERE NAME_PRODUCT = 'HP PAVILION 15Z TOUCH LAPTOP'";
        try {
            statement = connect.createStatement();
        }catch (SQLNonTransientConnectionException e){
            connectionDataBase();
            statement = connect.createStatement();
        }
        statement.executeUpdate(sql);
        connect.close();
    }

    public static Map<String, String> mapResultDBGenerator(ResultSet results, String[] collunms) throws SQLException {
        Map<String, String> resultado = new HashMap<String, String>();
        if(!results.next()){
            return resultado;
        }
        String print= "Dados Coletados:";
        String result;
        for (String collunm : collunms) {
            if(results.isAfterLast())
                results.next();
            result = results.getString(collunm);
            resultado.put(collunm,result);
            print += " "+collunm+":" + result + " |";
        }
        mapResultDBGenerator(results, collunms);
        return resultado;
    }
}


