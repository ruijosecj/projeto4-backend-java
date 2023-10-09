/**
 * 
 */
package dao;

import dao.generic.GenericDao;
import domain.Produto;

public class ProdutoJpaDAO extends GenericDao<Produto, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(Produto.class);
	}

}
