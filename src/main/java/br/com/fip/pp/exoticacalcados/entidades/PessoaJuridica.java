package br.com.fip.pp.exoticacalcados.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="PessoaJuridica")
public class PessoaJuridica extends Pessoa {
	private  long id;
	@Column
	private String inscEstadual;
	@Column
	private String cnpj;
	@Column
	private String Telefone;
	@Column
	private String nomeFantasia;
	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String getInscEstadual() {
		return inscEstadual;
	}
	private void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	private String getCnpj() {
		return cnpj;
	}
	private void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	private String getTelefone() {
		return Telefone;
	}
	private void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	
	

}
