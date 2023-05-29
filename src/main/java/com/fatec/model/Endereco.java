package com.fatec.model;

public class Endereco {

	private Long id;
	private String cidade;
	private String cep;
	private int numero;
	private String rua;
	private String complemento;
	private String estado;

	public Endereco(String cidade, String cep, String estado, int numero, String rua, String complemento) {
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.numero = numero;
		this.rua = rua;
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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

}
