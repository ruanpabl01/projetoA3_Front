use feedit;
select * from restaurante;
select * from avaliacao;
select * from cliente;
select * from cupom;

INSERT INTO feedit.cliente VALUES ('admin',' admin', 'admin');

INSERT INTO feedit.cliente VALUES ('amanda@gmail.com',' Amanda', '123');
INSERT INTO feedit.restaurante (nomeRestaurante, cnpjRestaurante, senhaRestaurante, statusCadastroRestaurante) VALUES ('Restaurante2', 56789, '123', 'pendente');
UPDATE restaurante set nomeRestaurante = 'a' where cnpjRestaurante = 2;


INSERT INTO feedit.avaliacao (Cliente_emailCliente, Restaurante_cnpjRestaurante, comentarioAvaliacao, notaAvaliacao) VALUES ('cliente@gmail.com', 2, 'blablablabla', 5);
SELECT notaAvaliacao FROM avaliacao where Restaurante_cnpjRestaurante = ?;



INSERT INTO cupom (Cliente_emailCliente, Restaurante_cnpjRestaurante) VALUES ('a' , 2);

SELECT COUNT(1) FROM cupom WHERE Cliente_emailCliente = 'a' AND Restaurante_cnpjRestaurante = 2 ;