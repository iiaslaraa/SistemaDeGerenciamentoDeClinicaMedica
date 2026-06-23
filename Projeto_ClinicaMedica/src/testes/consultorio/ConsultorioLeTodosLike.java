package testes.consultorio;

import java.util.List;
import modelo.Consultorio;
import persistencia.ConsultorioDAO;

public class ConsultorioLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<Consultorio> lista = ConsultorioDAO.leTodosLike("Clínica");

        for (Consultorio c : lista) {
            System.out.println(c);
        }

    }

}
