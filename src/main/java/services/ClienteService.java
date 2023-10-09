/**
 * 
 */
 package services;

import dao.IClienteDao;
import domain.Cliente;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import services.generic.GenericJpaService;




public class ClienteService extends GenericJpaService<Cliente, Long> implements IClienteService {
	
	private IClienteDao clienteDAO;
	
	public ClienteService(IClienteDao clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
