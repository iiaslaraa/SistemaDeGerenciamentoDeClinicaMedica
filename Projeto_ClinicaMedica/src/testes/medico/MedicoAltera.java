package testes.medico;

import persistencia.MedicoDAO;

public class MedicoAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(MedicoDAO.altera("Roberto Almeida", "Neurologia", "1000", "61988887777", "roberto@outlook.com", 3, "12312312312"));

    }

}