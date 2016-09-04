package br.com.fip.pp.exoticacalcados.business;

import java.io.Serializable;
import java.util.List;

import br.com.fip.pp.exoticacalcados.dao.PessoaFisicaDao;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.entidades.PessoaFisica;
import br.com.fip.pp.exoticacalcados.repositorio.PessoaFisicaRepositorio;

public class PessoaFisicaBusiness implements Serializable,
		PessoaFisicaRepositorio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PessoaFisica> listaPessoaFisica;
	private PessoaFisicaDao dao;
	
	public PessoaFisicaBusiness() {
	dao = new PessoaFisicaDao();
	}

	@Override
	public void salvar(PessoaFisica pessoaFisica) {
		dao.salvar(pessoaFisica);
		
	}

	@Override
	public void alterar(PessoaFisica pessoaFisica) {
		dao.alterar(pessoaFisica);
		
	}

	@Override
	public void deletar(PessoaFisica pessoaFisica) {
		dao.deletar(pessoaFisica);
		
	}
	@Override
	public List<PessoaFisica> listar() {
		// TODO Auto-generated method stub
		return listaPessoaFisica;
	}

}
