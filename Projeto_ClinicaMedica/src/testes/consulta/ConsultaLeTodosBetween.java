package testes.consulta;

import java.util.List;
import modelo.Consulta;
import persistencia.ConsultaDAO;

public class ConsultaLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<Consulta> lista = ConsultaDAO.leTodosBetween(3, 8);

        for (Consulta c : lista) {

            System.out.println(c);

        }

    }

}