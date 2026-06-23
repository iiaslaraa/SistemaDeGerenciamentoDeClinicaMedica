package testes.consulta;

import java.util.List;
import modelo.Consulta;
import persistencia.ConsultaDAO;

public class ConsultaLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<Consulta> lista = ConsultaDAO.leTodosLike("30/06");

        for (Consulta c : lista) {

            System.out.println(c);

        }

    }

}