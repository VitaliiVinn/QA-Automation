package jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/clients_data";
        Connection connection = DriverManager.getConnection(url, "root", "Kt@jumbo822");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from clients_data.database");
        while (resultSet.next()){
            System.out.println(resultSet.getString("п»їevent_name"));
        }
//        int a = 0;
//        while (resultSet.next()){
//            a+= resultSet.getInt("balance");
////            System.out.println(resultSet.getString("balance"));
//        }
//        System.out.println(a);
        statement.executeUpdate("insert into clients_data.database (п»їevent_name, user_id, event_date, book_name) " +
                "values ('Barbos', '116126', '25.03.2023', 'Mizon')");
        System.out.println("Successful");

    }
}
