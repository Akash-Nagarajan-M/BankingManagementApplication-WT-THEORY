import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {

    private Connection conn;
    private static javaconnect uniqueJavaConnect;

    private javaconnect() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:/home/akash/Downloads/BankingManagementApplication-master(2)/BankingManagementApplication-master/bank.sqlite");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static javaconnect getInstance() {
        if(uniqueJavaConnect == null) uniqueJavaConnect = new javaconnect();
        return uniqueJavaConnect;
    }

    public Connection ConnectDb(){
        return conn;
    }
}
