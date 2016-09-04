package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;
import br.com.fip.pp.exoticacalcados.repositorio.PessoaFisicaRepositorio;



public class PessoaFisicaDao extends GenericDAO<PessoaFisica> implements Serializable,PessoaFisicaRepositorio {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Session session;
	private Transaction trans;
	private PessoaFisica pessoaFisica;
	private List<PessoaFisica> listaPessoaFisica = new ArrayList<PessoaFisica>();
	public PessoaFisicaDao() {
		super(PessoaFisica.class);
		// TODO Auto-generated constructor stub
	}
 
	
}
