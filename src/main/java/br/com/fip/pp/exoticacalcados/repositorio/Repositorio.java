package br.com.fip.pp.exoticacalcados.repositorio;

import java.util.List;

public interface Repositorio<T> {

	public void salvar(T objeto);

	public void alterar(T objeto);

	public void deletar(T objeto);

	public List<T> listar();

}
