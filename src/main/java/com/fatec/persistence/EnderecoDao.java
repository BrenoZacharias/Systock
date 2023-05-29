package com.fatec.persistence;

import com.fatec.model.Endereco;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDao {

    public void cadastrarEndereco(Endereco endereco) {
        String sql = "INSERT INTO ENDERECO(CIDADE,CEP, ESTADO, NUMERO,LOGRADOURO, COMPLEMENTO) VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = GenericDao.getConnection().prepareStatement(sql);
            ps.setString(1, endereco.getCidade());
            ps.setString(2, endereco.getCep());
            ps.setString(3, endereco.getEstado());
            ps.setInt(4, endereco.getNumero());
            ps.setString(5, endereco.getRua());
            ps.setString(6, endereco.getComplemento());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
