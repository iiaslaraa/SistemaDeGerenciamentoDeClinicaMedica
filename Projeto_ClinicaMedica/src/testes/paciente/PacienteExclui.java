package testes.paciente;

import persistencia.PacienteDAO;

public class PacienteExclui {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteDAO.exclui("12121212121"));

    }

}