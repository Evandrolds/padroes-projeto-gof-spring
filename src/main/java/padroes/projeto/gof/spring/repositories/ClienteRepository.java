package padroes.projeto.gof.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import padroes.projeto.gof.spring.entities.Cliente;
/**
 * 
 * @author Evandro
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}