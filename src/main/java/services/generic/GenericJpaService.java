/**
 * 
 */
package services.generic;

import java.io.Serializable;
import java.util.Collection;

import dao.Persistente;
import dao.generic.IGenericDao;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
		implements IGenericJpaService<T, E> {

	protected IGenericDao<T, E> dao;

	public GenericJpaService(IGenericDao<T, E> dao) {
		this.dao = dao;
	}

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}

}
