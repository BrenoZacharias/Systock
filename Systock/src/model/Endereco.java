package model;

public class Endereco {

	private Long id;
	private String cidade;
	private String cep;
	private int numero;
	private String rua;
	private String complemento;

	public Endereco(Long id, String cidade, String cep, int numero, String rua, String complemento) {
		this.id = id;
		this.cidade = cidade;
		this.cep = cep;
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

}
