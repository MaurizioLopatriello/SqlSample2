import java.sql.*;
import java.util.ArrayList;

public class SqlSample2 {


    public static void main(String[] args) {

        ArrayList<String> Surnames = new ArrayList<>();
        String query = "Select last_name from students;";


        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "dev1", "dev1");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
               Surnames.add(resultSet.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Surnames);


    }
}
