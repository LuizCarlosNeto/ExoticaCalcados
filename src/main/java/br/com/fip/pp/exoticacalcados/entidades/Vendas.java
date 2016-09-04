package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;

public class Vendas implements Serializable{
	private long id;
	private PessoaFisica pessoa;
	private FormaDePagamento pagamento;
	private Produto produtos;
	private int quantidade;
	private double total;
	private long getId() {
		return id;
	}
	private void setId(long id) {
		this.id = id;
	}
	private PessoaFisica getPessoa() {
		return pessoa;
	}
	private void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
	private FormaDePagamento getPagamento() {
		return pagamento;
	}
	private void setPagamento(FormaDePagamento pagamento) {
		this.pagamento = pagamento;
	}
	private Produto getProdutos() {
		return produtos;
	}
	private void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
	private int getQuantidade() {
		return quantidade;
	}
	private void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	private double getTotal() {
		return total;
	}
	private void setTotal(double total) {
		this.total = total;
	}
	
	

}
