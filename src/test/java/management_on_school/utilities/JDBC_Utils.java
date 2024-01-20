package management_on_school.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Utils {


    //Bu method ManagementOnSchool database ile bağlantı kurup Connection data döner
    public static Connection connectToDatabase() {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


    //Bu method connectToDatabase() methodunu içinde çağırarak bir statement objesi oluşturup return yapar
    public static Statement createStatement() {
        Statement statement;
        try {
            statement = connectToDatabase().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }


    //Bu method bir SQL query'yi çalıştırıp data dönüyorsa true, dönmüyorsa false verir
    public static boolean execute(String sql) {

        try {
            return createStatement().execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    //Bu method bir SQL query'yi çalıştırıp sonucu ResultSet olarak döner
    public static ResultSet executeQuery(String sql) {

        try {
            return createStatement().executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Bu method istediğimiz bir table'ın isteğimiz bir sütunu list olarak döner
    public static List<Object> getColumnList(String tableName, String columnName) throws SQLException {

        List<Object> list = new ArrayList<>();

        ResultSet resultSet = executeQuery("select " + columnName + " from " + tableName);

        while (resultSet.next()) {
            list.add(resultSet.getObject(columnName));
        }

        return list;

    }

    //Bu method bağlantıyı kapatır
    public static void closeConnection() {

        try {
            connectToDatabase().close();
            createStatement().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
