package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Consultorio;

public class ConsultorioDAO {

    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Consultorio> leTodos() throws Exception {

        List<Consultorio> listConsultorios = new ArrayList<Consultorio>();

        try {

            String sql = "SELECT * FROM consultorio";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Consultorio c = new Consultorio();

                c.setNumero(rs.getInt("numConsultorio"));

                c.setCorredor(rs.getString("corredor"));

                c.setNome(rs.getString("nome"));

                listConsultorios.add(c);

            }
            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultorios;

    }

    public static List<Consultorio> leTodosLike(String nome) throws Exception {

        List<Consultorio> listConsultorios = new ArrayList<Consultorio>();

        try {

            String sql = "SELECT * FROM consultorio WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + nome + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Consultorio c = new Consultorio();

                c.setNumero(rs.getInt("numConsultorio"));

                c.setCorredor(rs.getString("corredor"));

                c.setNome(rs.getString("nome"));

                listConsultorios.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultorios;

    }

    public static List<Consultorio> leTodosNotIn(int numero) throws Exception {

        List<Consultorio> listConsultorios = new ArrayList<Consultorio>();

        try {

            String sql = "SELECT * FROM consultorio WHERE numConsultorio NOT IN (?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, numero);

            rs = st.executeQuery();

            while (rs.next()) {

                Consultorio c = new Consultorio();

                c.setNumero(rs.getInt("numConsultorio"));

                c.setCorredor(rs.getString("corredor"));

                c.setNome(rs.getString("nome"));

                listConsultorios.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultorios;

    }

    public static List<Consultorio> leTodosBetween(int inicio, int fim) throws Exception {

        List<Consultorio> listConsultorios = new ArrayList<Consultorio>();

        try {

            String sql = "SELECT * FROM consultorio WHERE numConsultorio BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, inicio);

            st.setInt(2, fim);

            rs = st.executeQuery();

            while (rs.next()) {

                Consultorio c = new Consultorio();

                c.setNumero(rs.getInt("numConsultorio"));

                c.setCorredor(rs.getString("corredor"));

                c.setNome(rs.getString("nome"));

                listConsultorios.add(c);

            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listConsultorios;

    }

    public static Consultorio leUm(int numero) throws Exception {

        Consultorio consultorio = new Consultorio();

        try {

            String sql = "SELECT * FROM consultorio WHERE numConsultorio = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, numero);

            rs = st.executeQuery();

            if (rs.next()) {

                consultorio.setNumero(rs.getInt("numConsultorio"));

                consultorio.setCorredor(rs.getString("corredor"));

                consultorio.setNome(rs.getString("nome"));

            }
            rs.close();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return consultorio;

    }

    public static int grava(int numero, String corredor, String nome) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO consultorio (numConsultorio, corredor, nome) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, numero);

            st.setString(2, corredor);

            st.setString(3, nome);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(String corredor, String nome, int numero) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE consultorio SET corredor = ?, nome = ? WHERE numConsultorio = ? AND numConsultorio > 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, corredor);

            st.setString(2, nome);

            st.setInt(3, numero);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int numero) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM consultorio WHERE numConsultorio = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, numero);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

}