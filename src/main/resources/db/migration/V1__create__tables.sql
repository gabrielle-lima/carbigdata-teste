CREATE SEQUENCE IF NOT EXISTS cliente_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS endereco_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS foto_ocorrencia_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS ocorrencia_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE cliente
(
    cod_cliente    BIGINT NOT NULL,
    nme_cliente    VARCHAR(255),
    dta_nascimento date,
    nro_cpf        VARCHAR(255),
    dta_criacao    TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_cliente PRIMARY KEY (cod_cliente)
);

CREATE TABLE endereco
(
    cod_endereco   BIGINT NOT NULL,
    nme_logradouro VARCHAR(255),
    nme_bairro     VARCHAR(255),
    nro_cep        VARCHAR(255),
    nme_cidade     VARCHAR(255),
    nme_estado     VARCHAR(255),
    CONSTRAINT pk_endereco PRIMARY KEY (cod_endereco)
);

CREATE TABLE foto_ocorrencia
(
    cod_foto_ocorrencia BIGINT NOT NULL,
    cod_ocorrencia      BIGINT,
    dta_criacao         TIMESTAMP WITHOUT TIME ZONE,
    dsc_path_bucket     VARCHAR(255),
    dsc_hash_objeto     VARCHAR(255),
    CONSTRAINT pk_fotoocorrencia PRIMARY KEY (cod_foto_ocorrencia)
);

CREATE TABLE ocorrencia
(
    cod_ocorrencia    BIGINT NOT NULL,
    cod_cliente       BIGINT,
    cod_endereco      BIGINT,
    dta_ocorrencia    TIMESTAMP WITHOUT TIME ZONE,
    status_ocorrencia VARCHAR(255),
    CONSTRAINT pk_ocorrencia PRIMARY KEY (cod_ocorrencia)
);

ALTER TABLE foto_ocorrencia
    ADD CONSTRAINT FK_FOTOOCORRENCIA_ON_COD_OCORRENCIA FOREIGN KEY (cod_ocorrencia) REFERENCES ocorrencia (cod_ocorrencia);

ALTER TABLE ocorrencia
    ADD CONSTRAINT FK_OCORRENCIA_ON_COD_CLIENTE FOREIGN KEY (cod_cliente) REFERENCES cliente (cod_cliente);

ALTER TABLE ocorrencia
    ADD CONSTRAINT FK_OCORRENCIA_ON_COD_ENDERECO FOREIGN KEY (cod_endereco) REFERENCES endereco (cod_endereco);