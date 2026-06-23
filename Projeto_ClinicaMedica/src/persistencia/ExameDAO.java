package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Exame;

public class ExameDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Exame> leTodos() throws Exception {

        List<Exame> listExames = new ArrayList<Exame>();

        try {

            String sql = "SELECT * FROM exame";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Exame e = new Exame();

                e.setIdExame(rs.getInt("idExame"));
                e.setTipoExame(rs.getString("tipoExame"));
                e.setResultado(rs.getString("resultado"));
                e.setValor(rs.getDouble("valor"));

                listExames.add(e);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listExames;

    }

    public static List<Exame> leTodosLike(String tipoExame) throws Exception {

        List<Exame> listExames = new ArrayList<Exame>();

        try {

            String sql = "SELECT * FROM exame WHERE tipoExame LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + tipoExame + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Exame e = new Exame();

                e.setIdExame(rs.getInt("idExame"));
                e.setTipoExame(rs.getString("tipoExame"));
                e.setResultado(rs.getString("resultado"));
                e.setValor(rs.getDouble("valor"));

                listExames.add(e);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listExames;

    }

    public static List<Exame> leTodosNotIn(int idExame) throws Exception {

        List<Exame> listExames = new ArrayList<Exame>();

        try {

            String sql = "SELECT * FROM exame WHERE idExame NOT IN (?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idExame);

            rs = st.executeQuery();

            while (rs.next()) {

                Exame e = new Exame();

                e.setIdExame(rs.getInt("idExame"));
                e.setTipoExame(rs.getString("tipoExame"));
                e.setResultado(rs.getString("resultado"));
                e.setValor(rs.getDouble("valor"));

                listExames.add(e);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listExames;

    }

    public static List<Exame> leTodosBetween(double valorInicial, double valorFinal) throws Exception {

        List<Exame> listExames = new ArrayList<Exame>();

        try {

            String sql = "SELECT * FROM exame WHERE valor BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setDouble(1, valorInicial);
            st.setDouble(2, valorFinal);

            rs = st.executeQuery();

            while (rs.next()) {

                Exame e = new Exame();

                e.setIdExame(rs.getInt("idExame"));
                e.setTipoExame(rs.getString("tipoExame"));
                e.setResultado(rs.getString("resultado"));
                e.setValor(rs.getDouble("valor"));

                listExames.add(e);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listExames;

    }

    public static Exame leUm(int idExame) throws Exception {

        Exame exame = new Exame();

        try {

            String sql = "SELECT * FROM exame WHERE idExame = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idExame);

            rs = st.executeQuery();

            if (rs.next()) {

                exame.setIdExame(rs.getInt("idExame"));
                exame.setTipoExame(rs.getString("tipoExame"));
                exame.setResultado(rs.getString("resultado"));
                exame.setValor(rs.getDouble("valor"));

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return exame;

    }

    public static int grava(int idExame, String tipoExame, String resultado, Double valor) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO exame (idExame, tipoExame, resultado, valor) VALUES (?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idExame);
            st.setString(2, tipoExame);
            st.setString(3, resultado);
            st.setDouble(4, valor);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(String resultado, Double valor, int idExame) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE exame SET resultado = ?, valor = ? WHERE idExame = ? AND valor > 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, resultado);
            st.setDouble(2, valor);
            st.setInt(3, idExame);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int idExame) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM exame WHERE idExame = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idExame);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

}