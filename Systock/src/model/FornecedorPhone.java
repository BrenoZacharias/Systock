package model;

public class FornecedorPhone extends Phone {

	private Long id_supplier;

	public FornecedorPhone(Long id, String numero, Long id_supplier) {
		super(id, numero);
		this.id_supplier = id_supplier;
	}

	public Long getId_supplier() {
		return id_supplier;
	}

	public void setId_supplier(Long id_supplier) {
		this.id_supplier = id_supplier;
	}

}
