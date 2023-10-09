/**
 * 
 */
package services;

import dao.generic.IGenericDao;
import domain.Produto;
import services.generic.GenericJpaService;

public class ProdutoService extends GenericJpaService<Produto, String> implements IProdutoService {

	public ProdutoService(IGenericDao<Produto, String> dao) {
		super(dao);
	}

}
