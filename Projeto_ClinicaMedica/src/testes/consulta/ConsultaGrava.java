package testes.consulta;

import persistencia.ConsultaDAO;

public class ConsultaGrava {

    public static void main(String[] args) throws Exception {

        System.out.println(ConsultaDAO.grava(11, "30/06/2026", "14:30:00", "10101010101", "11111111111"));

    }

}