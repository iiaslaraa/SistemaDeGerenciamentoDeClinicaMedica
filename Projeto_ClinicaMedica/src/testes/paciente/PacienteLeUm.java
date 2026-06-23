package testes.paciente;

import persistencia.PacienteDAO;

public class PacienteLeUm {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteDAO.leUm("12121212121"));

    }

}