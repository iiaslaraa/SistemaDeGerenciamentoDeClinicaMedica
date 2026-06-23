package testes.consulta;

import java.util.List;
import modelo.Consulta;
import persistencia.ConsultaDAO;

public class ConsultaLeTodos {

    public static void main(String[] args) throws Exception {

        List<Consulta> lista = ConsultaDAO.leTodos();

        for (Consulta c : lista) {

            System.out.println(c);

        }

    }

}