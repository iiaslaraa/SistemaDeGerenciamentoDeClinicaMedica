package testes.consultorio;

import java.util.List;
import modelo.Consultorio;
import persistencia.ConsultorioDAO;

public class ConsultorioLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<Consultorio> lista = ConsultorioDAO.leTodosNotIn(1);

        for (Consultorio c : lista) {
            System.out.println(c);
        }

    }

}