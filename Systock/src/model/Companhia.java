package model;

import java.util.List;
import java.util.ArrayList;

public class Companhia {

	private String cnpj;
	private String name;
	private String email;
	private List<CompanhiaPhone> phones;
	private String estadoDeRegistro;
	private Endereco endereco;

	public Companhia(String cnpj, String name, String email, String estadoDeRegistro,
			Endereco endereco) {
		this.cnpj = cnpj;
		this.name = name;
		this.email = email;
		this.estadoDeRegistro = estadoDeRegistro;
		this.endereco = endereco;
		this.phones = new ArrayList<CompanhiaPhone>();
	}
	
	public Companhia(String cnpj, String name, String email, List<CompanhiaPhone> phones, String estadoDeRegistro,
			Endereco endereco) {
		this.cnpj = cnpj;
		this.name = name;
		this.email = email;
		this.phones = phones;
		this.estadoDeRegistro = estadoDeRegistro;
		this.endereco = endereco;
	}
	
	public void addPhone(CompanhiaPhone phone) {
		phones.add(phone);
	}
	
	public void removePhone(CompanhiaPhone phone) {
		phones.remove(phone);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CompanhiaPhone> getPhones() {
		return phones;
	}

	public void setPhones(List<CompanhiaPhone> phones) {
		this.phones = phones;
	}

	public String getEstadoDeRegistro() {
		return estadoDeRegistro;
	}

	public void setEstadoDeRegistro(String estadoDeRegistro) {
		this.estadoDeRegistro = estadoDeRegistro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
