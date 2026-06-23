package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Paciente;

public class PacienteDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Paciente> leTodos() throws Exception {

        List<Paciente> listPacientes = new ArrayList<Paciente>();

        try {

            String sql = "SELECT * FROM paciente";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setCpf(rs.getString("cpfPaciente"));
                p.setNome(rs.getString("nome"));
                p.setTelefone(rs.getString("telefone"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setDataNascimento(rs.getString("dataNascimento"));

                listPacientes.add(p);
            }
            rs.close();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listPacientes;
    }

    public static List<Paciente> leTodosLike(String nome) throws Exception {

        List<Paciente> listPacientes = new ArrayList<Paciente>();

        try {

            String sql = "SELECT * FROM paciente WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + nome + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setCpf(rs.getString("cpfPaciente"));
                p.setNome(rs.getString("nome"));
                p.setTelefone(rs.getString("telefone"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setDataNascimento(rs.getString("dataNascimento"));

                listPacientes.add(p);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listPacientes;
    }

    public static List<Paciente> leTodosNotIn(String cpf) throws Exception {

        List<Paciente> listPacientes = new ArrayList<Paciente>();

        try {

            String sql = "SELECT * FROM paciente WHERE cpfPaciente NOT IN (?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            rs = st.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setCpf(rs.getString("cpfPaciente"));
                p.setNome(rs.getString("nome"));
                p.setTelefone(rs.getString("telefone"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setDataNascimento(rs.getString("dataNascimento"));

                listPacientes.add(p);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listPacientes;
    }

    public static List<Paciente> leTodosBetween(String cpfInicial, String cpfFinal) throws Exception {

        List<Paciente> listPacientes = new ArrayList<Paciente>();

        try {

            String sql = "SELECT * FROM paciente WHERE cpfPaciente BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpfInicial);
            st.setString(2, cpfFinal);

            rs = st.executeQuery();

            while (rs.next()) {

                Paciente p = new Paciente();

                p.setCpf(rs.getString("cpfPaciente"));
                p.setNome(rs.getString("nome"));
                p.setTelefone(rs.getString("telefone"));
                p.setEmail(rs.getString("email"));
                p.setEndereco(rs.getString("endereco"));
                p.setDataNascimento(rs.getString("dataNascimento"));

                listPacientes.add(p);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listPacientes;
    }

    public static Paciente leUm(String cpf) throws Exception {

        Paciente paciente = new Paciente();

        try {

            String sql = "SELECT * FROM paciente WHERE cpfPaciente = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            rs = st.executeQuery();

            if (rs.next()) {

                paciente.setCpf(rs.getString("cpfPaciente"));
                paciente.setNome(rs.getString("nome"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setEmail(rs.getString("email"));
                paciente.setEndereco(rs.getString("endereco"));
                paciente.setDataNascimento(rs.getString("dataNascimento"));
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return paciente;
    }

    public static int grava(String cpf, String nome, String telefone, String email,
            String endereco, String dataNascimento) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO paciente "
                    + "(cpfPaciente, nome, telefone, email, endereco, dataNascimento) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);
            st.setString(2, nome);
            st.setString(3, telefone);
            st.setString(4, email);
            st.setString(5, endereco);
            st.setString(6, dataNascimento);

            ret = st.executeUpdate();

            st.close();
            connection.close();
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;
    }

    public static int altera(String nome, String telefone, String email,
            String endereco, String dataNascimento, String cpf) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE paciente SET nome = ?, telefone = ?, email = ?, "
                    + "endereco = ?, dataNascimento = ? "
                    + "WHERE cpfPaciente = ? AND nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, telefone);
            st.setString(3, email);
            st.setString(4, endereco);
            st.setString(5, dataNascimento);
            st.setString(6, cpf);
            st.setString(7, "%");

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;
    }

    public static int exclui(String cpf) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM paciente WHERE cpfPaciente = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;
    }
}