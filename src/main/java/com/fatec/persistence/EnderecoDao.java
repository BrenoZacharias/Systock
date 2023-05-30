package com.fatec.persistence;

import com.fatec.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDao {

	private Connection c;

	public EnderecoDao() {
		c = GenericDao.getConnection();
	}

	public void cadastrarEndereco(Endereco endereco) throws SQLException {
		String sql = "INSERT INTO ENDERECO(CIDADE,CEP, ESTADO, NUMERO,LOGRADOURO, COMPLEMENTO) VALUES (?,?,?,?,?,?)";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, endereco.getCidade());
			ps.setString(2, endereco.getCep());
			ps.setString(3, endereco.getEstado());
			ps.setInt(4, endereco.getNumero());
			ps.setString(5, endereco.getLogradouro());
			ps.setString(6, endereco.getComplemento());

			ps.execute();
			ps.close();
	}

	public void atualizarEndereco(Endereco endereco) throws SQLException {
		String sql = "UPDATE ENDERECO SET CIDADE = ?, CEP=?, ESTADO=?, NUMERO=?,LOGRADOURO=?, COMPLEMENTO=? WHERE ID=?";

		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, endereco.getCidade());
		ps.setString(2, endereco.getCep());
		ps.setString(3, endereco.getEstado());
		ps.setInt(4, endereco.getNumero());
		ps.setString(5, endereco.getLogradouro());
		ps.setString(6, endereco.getComplemento());
		ps.setLong(7, endereco.getId());

		ps.execute();
		ps.close();
	}

	public void excluirEndereco(Endereco endereco) throws SQLException {
		String sql = "DELETE FROM endereco WHERE id = ?";

		PreparedStatement ps = c.prepareStatement(sql);
		ps.setLong(1, endereco.getId());

		ps.execute();
		ps.close();

	}

	public Endereco buscaEnderecoPorId(Endereco endereco) throws SQLException {
		String sql = "SELECT ID, CIDADE, CEP, NUMERO, LOGRADOURO, COMPLEMENTO, ESTADO FROM ENDERECO WHERE ID = ?";

		PreparedStatement ps = c.prepareStatement(sql);
		ps.setLong(1, endereco.getId());

		int cont = 0;
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			endereco.setCep(rs.getString("cep"));
			endereco.setCidade(rs.getString("cidade"));
			endereco.setComplemento(rs.getString("complemento"));
			endereco.setNumero(rs.getInt("numero"));
			endereco.setLogradouro(rs.getString("logradouro"));
			endereco.setEstado(rs.getString("estado"));
			cont++;
		}

		if (cont == 0) {
			endereco = new Endereco();
		}

		rs.close();
		ps.close();

		endereco = new Endereco();

		return endereco;
	}

	public List<Endereco> buscaEnderecos() throws SQLException {
		String sql = "SELECT ID, CIDADE, CEP, NUMERO, LOGRADOURO, COMPLEMENTO, ESTADO FROM ENDERECO";

		PreparedStatement ps = c.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<Endereco> listaEnderecos = new ArrayList<Endereco>();

		while (rs.next()) {
			Endereco endereco = new Endereco(rs.getLong("id"), rs.getString("cidade"), rs.getString("cep"),
					rs.getString("estado"), rs.getInt("numero"), rs.getString("logradouro"),
					rs.getString("complemento"));
			listaEnderecos.add(endereco);
		}

		rs.close();
		ps.close();

		return listaEnderecos;
	}

}
