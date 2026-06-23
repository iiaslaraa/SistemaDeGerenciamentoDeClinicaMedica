package testes.paciente;

import java.util.List;
import modelo.Paciente;
import persistencia.PacienteDAO;

public class PacienteLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<Paciente> lista = PacienteDAO.leTodosLike("Carlos");

        for (Paciente p : lista) {

            System.out.println(p);

        }

    }

}