package testes.consultorio;

import persistencia.ConsultorioDAO;

public class ConsultorioGrava {
    public static void main(String[] args)throws Exception {
        System.out.println(ConsultorioDAO.grava(6,"F","Neurologia"));
    }
    
}
