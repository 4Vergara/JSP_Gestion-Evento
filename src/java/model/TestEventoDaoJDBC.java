
package model;

/**
 *
 * @author Lytos
 */
import domain.Evento;
import java.util.List;
import model.EventoDaoJDBC;

public class TestEventoDaoJDBC {
    public static void main(String[] args) {
        EventoDaoJDBC eventoDao = new EventoDaoJDBC();
        List<Evento> eventos = EventoDaoJDBC.getNombres();
        for (Evento evento : eventos) {
                                    
            System.out.println(evento.getNombre());
                                   
        }
        ClienteDaoJDBC clienteDao = new ClienteDaoJDBC();
        long cedulaCliente = ClienteDaoJDBC.verificarCliente(1678902233);
    }
}