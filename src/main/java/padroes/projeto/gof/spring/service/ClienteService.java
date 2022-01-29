package padroes.projeto.gof.spring.service;

import padroes.projeto.gof.spring.entities.Cliente;


/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author Evandro
 */
public interface ClienteService {

	Iterable<Cliente> findAll();

	Cliente findById(Long id);

	void insert(Cliente cliente);

	void update(Long id, Cliente cliente);

	void deleteById(Long id);

}
