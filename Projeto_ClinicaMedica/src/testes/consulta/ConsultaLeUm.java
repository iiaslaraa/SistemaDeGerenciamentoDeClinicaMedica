package testes.consulta;

import persistencia.ConsultaDAO;

public class ConsultaLeUm {

    public static void main(String[] args) throws Exception {

        System.out.println(ConsultaDAO.leUm(11));
    }

}