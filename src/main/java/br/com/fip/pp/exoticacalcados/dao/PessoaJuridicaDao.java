package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;






import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.PessoaJuridica;


public class PessoaJuridicaDao implements Serializable {
	private Session session;
	private Transaction trans;
	private PessoaJuridica pessoaJuridica;
	private List<PessoaJuridica> listaPessoaJuridica = new ArrayList<PessoaJuridica>();

	public void adicionarPessoaJuridica(PessoaJuridica pessoa) {
		/*
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			trans = session.beginTransaction();
			session.save(pessoa);
			trans.commit();

		} catch (HibernateException e) {
			trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		*/
		listaPessoaJuridica.add(pessoaJuridica);
	}

	public List<PessoaJuridica> getListaPessoaJuridica() {
		/*
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			trans = session.beginTransaction();

			Criteria cri = session.createCriteria(PessoaJuridica.class);
			this.listaPessoaJuridica = cri.list();
		} catch (HibernateException e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		*/
		return listaPessoaJuridica;
	}

	public void removerPessoaJuridica(PessoaJuridica pessoa) {
		/*
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			trans = session.beginTransaction();

			pessoaJuridica = new PessoaJuridica();
			pessoaJuridica = pessoa;

			session.delete(pessoaJuridica);
			trans.commit();
		} catch (HibernateException e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		*/
		listaPessoaJuridica.remove(listaPessoaJuridica);

	}
	public void atualizarPessoaJuridica(PessoaJuridica pessoa) {
		/*
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(pessoa);
            trans.commit();
        } catch (HibernateException e) {
        	trans.rollback();
        	e.printStackTrace();
        } finally {
            session.close();
        }

*/
		
    }

}
