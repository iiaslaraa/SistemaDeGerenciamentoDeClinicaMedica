package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Consulta;

public class ConsultaDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Consulta> leTodos() throws Exception {

        List<Consulta> listConsultas = new ArrayList<Consulta>();

        try {

            String sql = "SELECT * FROM consulta";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();

                c.setIdConsulta(rs.getInt("idConsulta"));
                c.setData(rs.getString("data"));
                c.setHora(rs.getString("hora"));

                listConsultas.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }

    public static List<Consulta> leTodosLike(String data) throws Exception {

        List<Consulta> listConsultas = new ArrayList<Consulta>();

        try {

            String sql = "SELECT * FROM consulta WHERE data LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + data + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();

                c.setIdConsulta(rs.getInt("idConsulta"));
                c.setData(rs.getString("data"));
                c.setHora(rs.getString("hora"));

                listConsultas.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }

    public static List<Consulta> leTodosNotIn(int idConsulta) throws Exception {

        List<Consulta> listConsultas = new ArrayList<Consulta>();

        try {

            String sql = "SELECT * FROM consulta WHERE idConsulta NOT IN (?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsulta);

            rs = st.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();

                c.setIdConsulta(rs.getInt("idConsulta"));
                c.setData(rs.getString("data"));
                c.setHora(rs.getString("hora"));

                listConsultas.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }

    public static List<Consulta> leTodosBetween(int inicio, int fim) throws Exception {

        List<Consulta> listConsultas = new ArrayList<Consulta>();

        try {

            String sql = "SELECT * FROM consulta WHERE idConsulta BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, inicio);
            st.setInt(2, fim);

            rs = st.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();

                c.setIdConsulta(rs.getInt("idConsulta"));
                c.setData(rs.getString("data"));
                c.setHora(rs.getString("hora"));

                listConsultas.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }

    public static Consulta leUm(int idConsulta) throws Exception {

        Consulta consulta = new Consulta();

        try {

            String sql = "SELECT * FROM consulta WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsulta);

            rs = st.executeQuery();

            if (rs.next()) {

                consulta.setIdConsulta(rs.getInt("idConsulta"));
                consulta.setData(rs.getString("data"));
                consulta.setHora(rs.getString("hora"));

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return consulta;

    }

    public static int grava(int idConsulta, String data, String hora, String cpfMedico, String cpfPaciente) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO consulta (idConsulta, data, hora, cpfMedico, cpfPaciente) VALUES (?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsulta);
            st.setString(2, data);
            st.setString(3, hora);
            st.setString(4, cpfMedico);
            st.setString(5, cpfPaciente);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(String data, String hora, int idConsulta) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE consulta SET data = ?, hora = ? WHERE idConsulta = ? AND idConsulta > 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, data);
            st.setString(2, hora);
            st.setInt(3, idConsulta);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int idConsulta) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM consulta WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsulta);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

}