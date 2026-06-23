package testes.consultorio;

import java.util.List;
import modelo.Consultorio;
import persistencia.ConsultorioDAO;

public class ConsultorioLeTodos {

    public static void main(String[] args) throws Exception {

        List<Consultorio> lista = ConsultorioDAO.leTodos();

        for (Consultorio c : lista) {
            System.out.println(c);
        }

    }
}