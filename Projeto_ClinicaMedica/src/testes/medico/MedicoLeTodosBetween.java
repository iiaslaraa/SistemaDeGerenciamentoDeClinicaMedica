package testes.medico;

import java.util.List;
import modelo.Medico;
import persistencia.MedicoDAO;

public class MedicoLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<Medico> lista = MedicoDAO.leTodosBetween("10101010101", "99999999999");

        for (Medico m : lista) {

            System.out.println(m);

        }

    }

}