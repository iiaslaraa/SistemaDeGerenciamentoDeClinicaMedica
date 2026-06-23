package testes.exame;

import persistencia.ExameDAO;

public class ExameGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(ExameDAO.grava(11, "Ultrassom", "Sem alterações", 220.00));
    }
    
}