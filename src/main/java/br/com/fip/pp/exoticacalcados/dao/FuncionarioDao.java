package br.com.fip.pp.exoticacalcados.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.Funcionario;
import br.com.fip.pp.exoticacalcados.entidades.Pessoa;
import br.com.fip.pp.exoticacalcados.repositorio.FuncionarioRepositorio;

public class FuncionarioDao extends GenericDAO<Funcionario>  implements Serializable , FuncionarioRepositorio {
	private static final long serialVersionUID = 1L;
	private Funcionario funcionario;
	private Pessoa pessoa;
	private List<Funcionario> listaFuncionario;
	private Session session ;
	private Transaction trans;
	
	public FuncionarioDao() {
     super(Funcionario.class) ;
    
	}

  
}
