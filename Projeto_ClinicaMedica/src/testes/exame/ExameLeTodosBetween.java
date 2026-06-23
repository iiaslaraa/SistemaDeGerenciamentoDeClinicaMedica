package testes.exame;

import java.util.List;
import modelo.Exame;
import persistencia.ExameDAO;

public class ExameLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<Exame> lista = ExameDAO.leTodosBetween(100.00, 300.00);

        for (Exame e : lista) {
            System.out.println(e);
        }

    }

}