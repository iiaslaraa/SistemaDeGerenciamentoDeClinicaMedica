package testes.exame;

import java.util.List;
import modelo.Exame;
import persistencia.ExameDAO;

public class ExameLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<Exame> lista = ExameDAO.leTodosNotIn(11);

        for (Exame e : lista) {
            System.out.println(e);
        }

    }

}