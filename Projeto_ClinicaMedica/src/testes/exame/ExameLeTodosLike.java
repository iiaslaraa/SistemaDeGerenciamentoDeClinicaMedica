package testes.exame;

import java.util.List;
import modelo.Exame;
import persistencia.ExameDAO;

public class ExameLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<Exame> lista = ExameDAO.leTodosLike("Ultrassom");

        for (Exame e : lista) {
            System.out.println(e);
        }

    }

}