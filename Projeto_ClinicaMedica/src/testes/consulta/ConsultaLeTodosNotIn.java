package testes.consulta;

import java.util.List;
import modelo.Consulta;
import persistencia.ConsultaDAO;

public class ConsultaLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<Consulta> lista = ConsultaDAO.leTodosNotIn(11);

        for (Consulta c : lista) {

            System.out.println(c);

        }

    }

}