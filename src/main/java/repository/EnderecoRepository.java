package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Endereco;
import persistencia.JpaUtil;

public class EnderecoRepository {
	
	EntityManager manager = JpaUtil.getEntityManager();
	EntityTransaction tx = manager.getTransaction();
	
	public void salvar(Endereco endereco) {
		tx.begin();
		manager.persist(endereco);
		tx.commit();
		manager.close();
		
	}

}
