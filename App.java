import java.sql.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Conectando ao banco de dados.");
        conectar();
    }

    public static Connection conectar() {
        String status = "Nada aconteceu ainda...";
        String mysqlHost = "127.0.0.1";
        String mysqlDb = "mysql_connector";
        String mysqlUser = "AllissonFelipe";
        String mysqlPassword = "";
        String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(mysqlUrl);
            status = "Conexão realida com sucesso!";
        } catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            status = "Ops! Algo de errado não está certo com a conexão com o banco de dados MYSQL! mensagem do servidor: " + e;
        }
        System.out.println(status);
        return conn;
    }
}

