package testes.paciente;

import persistencia.PacienteDAO;

public class PacienteGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(PacienteDAO.grava("12121212121", "Carlos Eduardo Lima", "61999998888", "carlos@email.com", "QS 15 Conjunto A", "10/05/1998"));
    }

}