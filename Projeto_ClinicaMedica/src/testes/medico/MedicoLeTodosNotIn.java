package testes.medico;

import java.util.List;
import modelo.Medico;
import persistencia.MedicoDAO;

public class MedicoLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<Medico> lista = MedicoDAO.leTodosNotIn("12312312312");

        for (Medico m : lista) {

            System.out.println(m);

        }

    }

}