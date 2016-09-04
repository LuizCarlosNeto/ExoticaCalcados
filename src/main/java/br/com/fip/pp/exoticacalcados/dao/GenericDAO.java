package br.com.fip.pp.exoticacalcados.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.repositorio.Repositorio;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public abstract class GenericDAO<T> implements Repositorio<T> {
	
private Session session;
private Transaction trans;
	
	private Class<T> classe;

	public GenericDAO(Class<T> classe) {
		this.classe = classe;
		this.session = HibernateUtil.getSessionFactory().openSession();
		this.trans = getCurrentSession().beginTransaction();
	}
		public void salvar(T objeto) {
		try {
			getCurrentSession().save(objeto);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		}finally{
			getCurrentSession().close();
		}
		
		
	}
	
	public void alterar(T entity) {
		getCurrentSession().update(entity);
		getCurrentSession().flush();
	}
	
	public void deletar(T entity) {
		getCurrentSession().delete(entity);
	}


	@SuppressWarnings("unchecked")
	public List<T> listar() {
		return getCurrentSession().createCriteria(classe).list();
	}
	
	public Session getCurrentSession() {
		return session;
	}
	
}
