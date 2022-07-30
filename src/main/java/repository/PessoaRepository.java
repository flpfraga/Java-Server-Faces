package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Pessoa;
import persistencia.JpaUtil;

public class PessoaRepository {
	
	EntityManager manager = JpaUtil.getEntityManager();
	EntityTransaction tx = manager.getTransaction();

	
	public void salvar(Pessoa pessoa) {
		tx.begin();
		manager.persist(pessoa);
		tx.commit();
		manager.close();
		
	}

}
