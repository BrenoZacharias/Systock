package com.fatec.model;

public class Endereco {

	private Long id;
	private String cidade;
	private String cep;
	private int numero;
	private String logradouro;
	private String complemento;
	private String estado;

	public Endereco() {
		super();
	}
	
	public Endereco(Long id, String cidade, String cep, String estado, int numero, String logradouro, String complemento) {
		this.id = id;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.numero = numero;
		this.logradouro = logradouro;
		this.complemento = complemento;
	}
	
	public Endereco(String cidade, String cep, String estado, int numero, String logradouro, String complemento) {
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.numero = numero;
		this.logradouro = logradouro;
		this.complemento = complemento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cidade=" + cidade + ", cep=" + cep + ", numero=" + numero + ", logradouro=" + logradouro
				+ ", complemento=" + complemento + ", estado=" + estado + "]";
	}

}
