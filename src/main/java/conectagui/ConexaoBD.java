package conectagui;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBD {

    private static String usuario = "root";
    private static String host = "localhost";
    private static String senha = "35446";
    private static String db = "feedit";
    private static String porta = "3306";

    public static Connection obterConexao() throws Exception {

        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                db
        );
        return DriverManager.getConnection(url, usuario, senha);
    }
}
