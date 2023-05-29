package com.fatec.persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fatec.model.Companhia;

public class CompanhiaDao {

	public void cadastrarCompanhia(Companhia companhia) {
		String sql = "INSERT INTO COMPANHIA(CNPJ, NOME, EMAIL,EstadoDeRegistro, EnderecoId) VALUES (?,?,?,?,?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = GenericDao.getConnection().prepareStatement(sql);
			ps.setString(1, companhia.getCnpj());
			ps.setString(2, companhia.getName());
			ps.setString(3, companhia.getEmail());
			ps.setString(4, companhia.getEstadoDeRegistro());
			
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
