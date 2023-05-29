package com.fatec;

import com.fatec.model.Endereco;
import com.fatec.persistence.EnderecoDao;

public class Application {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("São Paulo", "035760808", "SP",160, "sla", "");

        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.cadastrarEndereco(endereco);
    }
}
