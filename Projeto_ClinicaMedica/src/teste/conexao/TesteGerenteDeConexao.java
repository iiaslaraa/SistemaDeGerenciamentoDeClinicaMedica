package teste.conexao;
import java.sql.SQLException;
import persistencia.GerenteDeConexao;

public class TesteGerenteDeConexao {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        System.out.println(GerenteDeConexao.getConnection());
    }
    
}
