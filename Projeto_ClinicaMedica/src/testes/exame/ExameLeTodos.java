package testes.exame;

import java.util.List;
import modelo.Exame;
import persistencia.ExameDAO;

public class ExameLeTodos {

    public static void main(String[] args) throws Exception {

        List<Exame> lista = ExameDAO.leTodos();

        for (Exame e : lista) {
            System.out.println(e);
        }

    }

}