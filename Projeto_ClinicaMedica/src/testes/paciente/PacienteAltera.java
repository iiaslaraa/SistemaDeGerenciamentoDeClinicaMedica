package testes.paciente;

import persistencia.PacienteDAO;

public class PacienteAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteDAO.altera("Carlos Eduardo Souza", "61988887777", "carlos.souza@email.com", "Taguatinga Norte", "10/05/1998", "12121212121"));

    }

}