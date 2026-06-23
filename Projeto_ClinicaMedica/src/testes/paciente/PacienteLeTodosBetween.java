package testes.paciente;

import java.util.List;
import modelo.Paciente;
import persistencia.PacienteDAO;

public class PacienteLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<Paciente> lista = PacienteDAO.leTodosBetween("11111111111", "66666666666");

        for (Paciente p : lista) {

            System.out.println(p);

        }

    }

}