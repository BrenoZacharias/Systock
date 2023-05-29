package com.fatec.model;

public class CompanhiaPhone extends Phone{
	
	private String cnpj_company;
	
	public CompanhiaPhone(Long id, String numero, String cnpj_company) {
		super(id, numero);
		this.cnpj_company = cnpj_company;
	}

	
}
