package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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
	
	public List<Pessoa> buscarTodos(){
		tx.begin();
		TypedQuery<Pessoa> query = manager.createQuery("from Pessoa", Pessoa.class);
		List<Pessoa> pessoas =  query.getResultList();
		return pessoas;
	}

}
