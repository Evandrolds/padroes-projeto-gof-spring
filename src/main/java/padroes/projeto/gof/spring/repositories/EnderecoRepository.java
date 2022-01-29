package padroes.projeto.gof.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import padroes.projeto.gof.spring.entities.Endereco;

/**
 * 
 * @author Evandro
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}