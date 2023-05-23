CREATE OR REPLACE PROCEDURE add_new_endereco (endereco_cep_in IN VARCHAR, 
    endereco_estado_in IN VARCHAR, endereco_complemento_in IN VARCHAR, 
    endereco_cidade_in IN VARCHAR, endereco_numero_in IN INTEGER, 
    endereco_logradouro_in IN VARCHAR)
IS
BEGIN
    INSERT INTO endereco (cep, estado, complemento, cidade, numero, 
        logradouro)
    VALUES (endereco_cep_in, endereco_estado_in, endereco_complemento_in, 
        endereco_cidade_in, endereco_numero_in, endereco_logradouro_in);
    EXCEPTION
        WHEN DUP_VAL_ON_INDEX THEN 
            raise_application_error(-20001, 'Já existe um endereco com o mesmo id');  
END;

BEGIN 
    add_new_endereco('154986238', 'YP', '', 'k', 5, 'Rua Olaia');
END;

SELECT id, cep, estado, complemento, cidade, numero, logradouro from endereco;