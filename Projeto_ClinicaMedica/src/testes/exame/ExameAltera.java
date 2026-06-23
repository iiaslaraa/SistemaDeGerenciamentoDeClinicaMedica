package testes.exame;

import persistencia.ExameDAO;

public class ExameAltera {

    public static void main(String[] args) throws Exception {

        System.out.println(ExameDAO.altera("Resultado Atualizado",250.00,11));

    }

}