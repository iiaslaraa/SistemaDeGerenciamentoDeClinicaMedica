package testes.consultorio;

import java.util.List;
import modelo.Consultorio;
import persistencia.ConsultorioDAO;

public class ConsultorioLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<Consultorio> lista = ConsultorioDAO.leTodosBetween(2, 5);

        for (Consultorio c : lista) {
            System.out.println(c);
        }

    }

}
