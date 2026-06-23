package testes.consultorio;

import persistencia.ConsultorioDAO;

public class ConsultorioAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(ConsultorioDAO.altera("A", "Clínica Geral Atualizada", 1));
    }
}

