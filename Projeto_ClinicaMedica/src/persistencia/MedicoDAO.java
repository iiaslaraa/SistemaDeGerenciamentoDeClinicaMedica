package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Medico;

public class MedicoDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<Medico> leTodos() throws Exception {

        List<Medico> listMedicos = new ArrayList<Medico>();

        try {

            String sql = "SELECT * FROM medico";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Medico m = new Medico();

                m.setCpf(rs.getString("cpfMedico"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));

                listMedicos.add(m);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listMedicos;
    }

    public static List<Medico> leTodosLike(String nome) throws Exception {

        List<Medico> listMedicos = new ArrayList<Medico>();

        try {

            String sql = "SELECT * FROM medico WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, "%" + nome + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Medico m = new Medico();

                m.setCpf(rs.getString("cpfMedico"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));

                listMedicos.add(m);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listMedicos;
    }

    public static List<Medico> leTodosNotIn(String cpf) throws Exception {

        List<Medico> listMedicos = new ArrayList<Medico>();

        try {

            String sql = "SELECT * FROM medico WHERE cpfMedico NOT IN (?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            rs = st.executeQuery();

            while (rs.next()) {

                Medico m = new Medico();

                m.setCpf(rs.getString("cpfMedico"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));

                listMedicos.add(m);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listMedicos;
    }

    public static List<Medico> leTodosBetween(String cpfInicial, String cpfFinal) throws Exception {

        List<Medico> listMedicos = new ArrayList<Medico>();

        try {

            String sql = "SELECT * FROM medico WHERE cpfMedico BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpfInicial);
            st.setString(2, cpfFinal);

            rs = st.executeQuery();

            while (rs.next()) {

                Medico m = new Medico();

                m.setCpf(rs.getString("cpfMedico"));
                m.setNome(rs.getString("nome"));
                m.setEspecialidade(rs.getString("especialidade"));
                m.setCrm(rs.getString("crm"));
                m.setTelefone(rs.getString("telefone"));
                m.setEmail(rs.getString("email"));

                listMedicos.add(m);
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listMedicos;
    }

    public static Medico leUm(String cpf) throws Exception {

        Medico medico = new Medico();

        try {

            String sql = "SELECT * FROM medico WHERE cpfMedico = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            rs = st.executeQuery();

            if (rs.next()) {

                medico.setCpf(rs.getString("cpfMedico"));
                medico.setNome(rs.getString("nome"));
                medico.setEspecialidade(rs.getString("especialidade"));
                medico.setCrm(rs.getString("crm"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setEmail(rs.getString("email"));
            }
            rs.close();
            
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return medico;
    }

    public static int grava(String cpf, String nome, String especialidade, String crm,
            String telefone, String email, int numConsultorio) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO medico "
                    + "(cpfMedico, nome, especialidade, crm, telefone, email, numConsultorio) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);
            st.setString(2, nome);
            st.setString(3, especialidade);
            st.setString(4, crm);
            st.setString(5, telefone);
            st.setString(6, email);
            st.setInt(7, numConsultorio);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(String nome, String especialidade, String crm,
            String telefone, String email, int numConsultorio, String cpf) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE medico SET nome = ?, especialidade = ?, crm = ?, "
                    + "telefone = ?, email = ?, numConsultorio = ? "
                    + "WHERE cpfMedico = ? AND numConsultorio > 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, especialidade);
            st.setString(3, crm);
            st.setString(4, telefone);
            st.setString(5, email);
            st.setInt(6, numConsultorio);
            st.setString(7, cpf);

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

            String sql = "DELETE FROM medico WHERE cpfMedico = ?";

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
