package com.fatec.model;

import java.util.ArrayList;
import java.util.List;

public class CompanhiaFornecedor extends Companhia{

	private List<Fornecedor> fornecedores;
	
	public CompanhiaFornecedor(String cnpj, String name, String email, List<CompanhiaPhone> phones,
			String estadoDeRegistro, Endereco endereco, List<Fornecedor> fornecedores) {
		super(cnpj, name, email, phones, estadoDeRegistro, endereco);
		this.fornecedores = fornecedores;
	}
	
	public CompanhiaFornecedor(String cnpj, String name, String email, List<CompanhiaPhone> phones,
			String estadoDeRegistro, Endereco endereco) {
		super(cnpj, name, email, phones, estadoDeRegistro, endereco);
		this.fornecedores = new ArrayList<Fornecedor>();
	}
	
	public CompanhiaFornecedor(String cnpj, String name, String email,
			String estadoDeRegistro, Endereco endereco, List<Fornecedor> fornecedores) {
		super(cnpj, name, email, estadoDeRegistro, endereco);
		this.fornecedores = fornecedores;
	}
	
	public CompanhiaFornecedor(String cnpj, String name, String email,
			String estadoDeRegistro, Endereco endereco) {
		super(cnpj, name, email, estadoDeRegistro, endereco);
		this.fornecedores = new ArrayList<Fornecedor>();
	}

}
