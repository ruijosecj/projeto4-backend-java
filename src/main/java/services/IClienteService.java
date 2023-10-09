/**
 * 
 */
package services;

import domain.Cliente;
import exceptions.DAOException;
import services.generic.IGenericJpaService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericJpaService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
