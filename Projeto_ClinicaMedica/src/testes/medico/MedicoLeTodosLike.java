package testes.medico;

import java.util.List;
import modelo.Medico;
import persistencia.MedicoDAO;

public class MedicoLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<Medico> lista = MedicoDAO.leTodosLike("Roberto");

        for (Medico m : lista) {

            System.out.println(m);

        }

    }

}