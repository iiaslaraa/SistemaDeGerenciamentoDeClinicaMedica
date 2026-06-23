package testes.medico;

import persistencia.MedicoDAO;

public class MedicoGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(MedicoDAO.grava("12312312312", "Roberto Almeida", "Neurologia", "999", "61999998888", "roberto@gmail.com", 2));

    }

}