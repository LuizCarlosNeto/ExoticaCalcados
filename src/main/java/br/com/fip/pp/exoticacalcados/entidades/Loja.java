package br.com.fip.pp.exoticacalcados.entidades;

import java.io.Serializable;



public class Loja implements Serializable{
	
	private long id;
	private int codig;
	private String nome;
	private String cidade;
	private String endereco;
	private String rua;
	private String bairro;
	private String cep;
	
	private long getId() {
		return id;
	}
	private void setId(long id) {
		this.id = id;
	}
	private int getCodig() {
		return codig;
	}
	private void setCodig(int codig) {
		this.codig = codig;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	private String getEndereco() {
		return endereco;
	}
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private String getRua() {
		return rua;
	}
	private void setRua(String rua) {
		this.rua = rua;
	}
	private String getBairro() {
		return bairro;
	}
	private void setBairro(String bairro) {
		this.bairro = bairro;
	}
	private String getCep() {
		return cep;
	}
	private void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codig;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (codig != other.codig)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
