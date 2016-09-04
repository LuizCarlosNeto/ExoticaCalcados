package br.com.fip.pp.exoticalcados.testes;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.util.HibernateUtil;

public class main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.beginTransaction();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("google");
		session.save(pessoa);
		trans.commit();
	}

}
