package testes.paciente;

import java.util.List;
import modelo.Paciente;
import persistencia.PacienteDAO;

public class PacienteLeTodos {

    public static void main(String[] args) throws Exception {

        List<Paciente> lista = PacienteDAO.leTodos();

        for (Paciente p : lista) {

            System.out.println(p);

        }

    }

}