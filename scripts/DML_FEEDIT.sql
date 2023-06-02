use feedit;
select * from restaurante;
select * from avaliacao;
select * from cliente;
select * from cupom;

INSERT INTO feedit.cliente VALUES ('admin',' admin', 'admin');

INSERT INTO feedit.cliente VALUES ('amanda@gmail.com',' Amanda', '123');
INSERT INTO feedit.restaurante (nomeRestaurante, cnpjRestaurante, senhaRestaurante, statusCadastroRestaurante) VALUES ('Restaurante2', 56789, '123', 'pendente');
UPDATE restaurante set nomeRestaurante = 'a' where cnpjRestaurante = 2;


INSERT INTO feedit.avaliacao (Cliente_emailCliente, Restaurante_cnpjRestaurante, comentarioAvaliacao, notaAvaliacao) VALUES ('a', 12345, 'aaaaaaaaaaaaaaaa', 10);
SELECT notaAvaliacao FROM avaliacao where Restaurante_cnpjRestaurante = ?;

##as r where  a.Restaurante_cnpjRestaurante =  r.cnpjRestaurante

INSERT INTO cupom (Cliente_emailCliente, Restaurante_cnpjRestaurante) VALUES ('a' , 2);

SELECT COUNT(*) AS QTD FROM cupom  WHERE Cliente_emailCliente = 'a' AND codigoCupom = 1 ;



SELECT nomeRestaurante, mediaAvaliacao, comentarioAvaliacao FROM restaurante AS r JOIN avaliacao AS a where a.Restaurante_cnpjRestaurante = r.cnpjRestaurante;