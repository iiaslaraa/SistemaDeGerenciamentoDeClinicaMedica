package testes.medico;

import java.util.List;
import modelo.Medico;
import persistencia.MedicoDAO;

public class MedicoLeTodos {

    public static void main(String[] args) throws Exception {

        List<Medico> lista = MedicoDAO.leTodos();

        for (Medico m : lista) {

            System.out.println(m);

        }

    }

}