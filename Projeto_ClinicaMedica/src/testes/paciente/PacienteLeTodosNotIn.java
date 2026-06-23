package testes.paciente;

import java.util.List;
import modelo.Paciente;
import persistencia.PacienteDAO;

public class PacienteLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<Paciente> lista = PacienteDAO.leTodosNotIn("12121212121");

        for (Paciente p : lista) {

            System.out.println(p);

        }

    }

}
