CREATE DATABASE systock;
USE systock;

CREATE TABLE endereco (
    id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    cep CHAR(8) CHECK(LENGTH(cep)=8) NOT NULL,-- SE FOR CHAR ENTRA COM CARAC-
    -- TER A MENOS, NÃO FAZ O CHECK CORRETAMENTE
    estado VARCHAR(50) NOT NULL,
    complemento VARCHAR(255),
    cidade VARCHAR(50) NOT NULL,
    numero INTEGER CHECK(numero>0) NOT NULL,
    logradouro VARCHAR(200) NOT NULL
);

insert into endereco (cep, estado, complemento, cidade, numero, logradouro) 
values ('00000000', 'sp', '', 'sla', 11, 'qlr');

insert into endereco (cep, estado, complemento, cidade, numero, logradouro) 
values ('11111111', 'sp', '', 'sla', 11, 'qlr');

ALTER TABLE endereco ADD CONSTRAINT pkEndereco PRIMARY KEY(id);

select * from endereco