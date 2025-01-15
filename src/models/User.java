package models;

import java.sql.*;

public class User {
    private Connection connection;

    public User(){
        try{
            String url = "jdbc:mysql://localhost:3306/warehub";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public boolean isValid(String id_admin, String password){
        String query = "SELECT * FROM admin WHERE nama = ? AND password = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, id_admin);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void tutupKoneksi() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
