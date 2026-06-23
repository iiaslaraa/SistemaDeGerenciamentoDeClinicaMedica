package testes.consulta;

import persistencia.ConsultaDAO;

public class ConsultaAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(ConsultaDAO.altera("01/07/2026", "15:00:00", 11));

    }

}