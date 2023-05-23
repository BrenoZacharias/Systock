CREATE SEQUENCE sequenciaEndereco START WITH 1 INCREMENT BY 1;
CREATE TABLE endereco (
    id INTEGER DEFAULT sequenciaEndereco.NEXTVAL NOT NULL,
    cep VARCHAR(9) CHECK(LENGTH(cep)=9) NOT NULL,-- SE FOR CHAR ENTRA COM CARAC-
    -- TER A MENOS, N�O FAZ O CHECK CORRETAMENTE
    estado VARCHAR(50) NOT NULL,
    complemento VARCHAR(255),
    cidade VARCHAR(50) NOT NULL,
    numero INTEGER CHECK(numero>0) NOT NULL,
    logradouro VARCHAR(200) NOT NULL
);

ALTER TABLE endereco ADD CONSTRAINT pkEndereco PRIMARY KEY(id);


