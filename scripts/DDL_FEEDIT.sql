# Criar a base
# CREATE DATABASE feedit;

USE feedit;

CREATE TABLE Restaurante (
  cnpjRestaurante INTEGER NOT NULL AUTO_INCREMENT,
  statusCadastroRestaurante VARCHAR(20) NOT NULL,
  nomeRestaurante VARCHAR(50) NOT NULL,
  senhaRestaurante VARCHAR(50) NOT NULL,
  mediaAvaliacao INTEGER NULL,
PRIMARY KEY(cnpjRestaurante)
);



CREATE TABLE Cliente (
  emailCliente VARCHAR(50) NOT NULL,
  nomeCliente VARCHAR(50),
  senhaCliente VARCHAR(20),
PRIMARY KEY(emailCliente));


CREATE TABLE Avaliacao (
  idAvaliacao INTEGER NOT NULL AUTO_INCREMENT,
  Cliente_emailCliente VARCHAR(50) NOT NULL,
  Restaurante_cnpjRestaurante INTEGER NOT NULL,
  comentarioAvaliacao VARCHAR(250),
  notaAvaliacao INTEGER NOT NULL,
PRIMARY KEY(idAvaliacao, Cliente_emailCliente)  ,
INDEX Avaliacao_FKIndex1(Restaurante_cnpjRestaurante)  ,
INDEX Avaliacao_FKIndex2(Cliente_emailCliente),
  FOREIGN KEY(Restaurante_cnpjRestaurante)
    REFERENCES Restaurante(cnpjRestaurante)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Cliente_emailCliente)
    REFERENCES Cliente(emailCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE Cupom (
  codigoCupom INTEGER NOT NULL AUTO_INCREMENT,
  Cliente_emailCliente VARCHAR(50) NOT NULL,
  Restaurante_cnpjRestaurante INTEGER NOT NULL    ,
PRIMARY KEY(codigoCupom, Cliente_emailCliente, Restaurante_cnpjRestaurante)  ,
INDEX Cupom_FKIndex1(Cliente_emailCliente)  ,
INDEX Cupom_FKIndex2(Restaurante_cnpjRestaurante),
  FOREIGN KEY(Cliente_emailCliente)
    REFERENCES Cliente(emailCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Restaurante_cnpjRestaurante)
    REFERENCES Restaurante(cnpjRestaurante)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



