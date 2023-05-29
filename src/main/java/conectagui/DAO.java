package conectagui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static javax.xml.stream.XMLStreamConstants.CHARACTERS;

public class DAO {

    //Realiza a busca na tabela de 'Clientes' do BD
    public boolean existeCliente(DadosUsuario usuario) throws Exception {
//        String sql="SELECT * FROM tb_usuario WHERE nome=? AND senha=?";
//        try(Connection conn=ConexaoBD.obterConexao()){
//                PreparedStatement ps = conn.prepareStatement(sql);
//                    ps.setString(1,usuario.getNome());
//                    ps.setString(2,usuario.getSenha());
//                    try(ResultSet rs = ps.executeQuery()){
//                        return rs.next();
//                    }        
//        }
        return true;
    }

    //Realiza a busca na tabela 'Restaurantes' do BD
    public boolean existeRestaurante(DadosUsuario usuario) throws Exception {
//        String sql="SELECT * FROM tb_usuario WHERE nome=? AND senha=?";
//        try(Connection conn=ConexaoBD.obterConexao()){
//                PreparedStatement ps = conn.prepareStatement(sql);
//                    ps.setString(1,usuario.getNome());
//                    ps.setString(2,usuario.getSenha());
//                    try(ResultSet rs = ps.executeQuery()){
//                        return rs.next();
//                    }        
//        }         
        return true;
    }

    //Realiza a busca na tabela 'Admins' do BD
    public boolean existeAdmin(DadosUsuario usuario) throws Exception {
//        String sql="SELECT * FROM tb_usuario WHERE nome=? AND senha=?";
//        try(Connection conn=ConexaoBD.obterConexao()){
//                PreparedStatement ps = conn.prepareStatement(sql);
//                    ps.setString(1,usuario.getNome());
//                    ps.setString(2,usuario.getSenha());
//                    try(ResultSet rs = ps.executeQuery()){
//                        return rs.next();
//                    }        
//        }         
        return true;
    }

    //Faz o cadastro do cliente no BD
    public void inserirCliente(CadCliente cliente) throws Exception {
//        String sql = "INSERT INTO tb_curso (nome, tipo) VALUES (?, ?);";
//        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
//            ps.setString(1, curso.getNome());
//            ps.setString(2, curso.getTipo());
//            ps.execute();
//        }
        System.out.println("Cadastro realizado (classe DAO)" + cliente.getNomeCliente() + ", "
                + cliente.getEmailCliente() + ", " + cliente.getSenhaCliente());
    }

    //Faz o cadastro do cliente no BD numa lista para aprovação
    public void inserirRestaurante(CadRestaurante restaurante) throws Exception {
//        String sql = "INSERT INTO tb_curso (nome, tipo) VALUES (?, ?);";
//        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
//            ps.setString(1, curso.getNome());
//            ps.setString(2, curso.getTipo());
//            ps.execute();
//        }
        System.out.println("Cadastro realizado (classe DAO)" + restaurante.getNomeRestaurante() + ", "
                + restaurante.getCnpjRestaurante() + ", " + restaurante.getSenhaRestaurante());
    }

    //Recebe o CNPJ cujo cadastro foi reprovado. O restaurante deve ser removido da tabela de restaurantes pendentes aprovação.
    public void reprovarRestaurante(CadRestaurante cnpj) throws Exception {
//        String sql = "DELETE FROM tb_curso WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql);){ 
//            ps.setInt (1, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println(cnpj.getCnpjRestaurante());
    }

    public void deletarRestaurante(CadRestaurante cnpj) throws Exception {
//        String sql = "DELETE FROM tb_curso WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql);){ 
//            ps.setInt (1, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println(cnpj.getCnpjRestaurante());
    }

    public void atualizarRestaurante(CadRestaurante restaurante) throws Exception {
//        String sql = "UPDATE tb_curso SET nome = ?, tipo = ? WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql)){ 
//            ps.setString (1, curso.getNome()); 
//            ps.setString (2, curso.getTipo()); 
//            ps.setInt (3, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println("Cadastro atualizado (classe DAO)" + restaurante.getNomeRestaurante() + ", "
                + restaurante.getCnpjRestaurante() + ", " + restaurante.getNota());
    }

    //Será chamado toda vez que uma avaliação for realizada. 
    //Recebe Nome e CNPJ do restaurante, e-mail e nota do usuário avaliador. Deve ser incrementado 1 na quantidade de avaliações do usuário com e-mail recebido.
    //Aqui será necessário um IF para verificar se o usuário já avaliou 3x, se sim, chamar função 'geraCupom' passando o LoginAvaliador para armazenar um cupom no cliente;
    //Importante concatenar usuário avaliador e comentário antes de inserir no banco 
    public void atualizarAvaliacaoRestaurante(CadRestaurante restaurante) throws Exception {
//        String sql = "UPDATE tb_curso SET nome = ?, tipo = ? WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql)){ 
//            ps.setString (1, curso.getNome()); 
//            ps.setString (2, curso.getTipo()); 
//            ps.setInt (3, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println("Avaliação registrada (classe DAO): "
                + "\nNome do restaurante: " + restaurante.getNomeRestaurante()
                + "\nCNPJ do restaurante: " + restaurante.getCnpjRestaurante()
                + "\nAvaliação dada: " + restaurante.getNotaAvaliacao()
                + "\nComentário inserido: " + restaurante.getLoginAvaliador() + " escreveu " + restaurante.getComentario()
        );
    }

    //##################################################MÉTODOS################################################################################
    //Realiza uma busca por CNPJ no banco (base de restaurantes cadastrados) e retorna nome;
    public CadRestaurante[] retornaRestaurantesPorCNPJ(String cnpj) {

        CadRestaurante[] restaurantes = new CadRestaurante[3];
        restaurantes[0] = new CadRestaurante("Oliver Garden", "47380257000180", 10);
        restaurantes[1] = new CadRestaurante("MCDonalds", "16523966000143", 8);
        restaurantes[2] = new CadRestaurante("BK", "27824158000132", 6);

        return restaurantes;
    }

    //Seta os restaurantes pendentes aprovações na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes pendentes aprovação.
    public DadosRestaurantes[] retornaListaRestaurantesPendentes() {

        DadosRestaurantes[] restaurantes = new DadosRestaurantes[3];
        restaurantes[0] = new DadosRestaurantes("Oliver Garden", "47380257000180");
        restaurantes[1] = new DadosRestaurantes("MCDonalds", "16523966000143");
        restaurantes[2] = new DadosRestaurantes("BK", "27824158000132");

        return restaurantes;

    }

    //Seta os restaurantes cadastrados na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes cadastrados.
    public CadRestaurante[] retornaListaRestaurantesCadastrados() {

        CadRestaurante[] restaurantesCad = new CadRestaurante[3];
        restaurantesCad[0] = new CadRestaurante("Oliver Garden", "47380257000180", 10);
        restaurantesCad[1] = new CadRestaurante("MCDonalds", "16523966000143", "123456", 8);
        restaurantesCad[2] = new CadRestaurante("BK", "27824158000132", "123456", 6);

        return restaurantesCad;
    }

    //Aqui será recebido o CNPJ, a partir dele, será necessário percorrer os comentários do restaurante em questão para setar na variável comentários e devolver para a classe chamadora
    public List<String> retornaComentariosRestaurantesCadastrados(String cnpj) {

        System.out.println(cnpj);
        List<String> comentarios = new ArrayList<>();

        comentarios.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        comentarios.add("Ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        comentarios.add("Dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        return comentarios;
    }

    //A cada nova geração, necessário realizar inserção no banco de dados;
    //Necessário receber o usuario ao qual o cupom vai ser inserido;
    public void gerarCupons(String usuario) {
        //Script para gerar cupom:
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder coupon = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(CHARACTERS.length());
            coupon.append(CHARACTERS.charAt(index));
        }
        System.out.println(coupon);
    }

    //Será chamada quando o usuário clicar em 'Meus cupons'.
    //Necessário consulta no banco dos cupons do cliente e inserir na lista 'cupons'.
    public List<String> retornaCuponsCliente(String usuario) {
        System.out.println(usuario);
        List<String> cupons = new ArrayList<>();

        cupons.add("ABCDE");
        cupons.add("FGHIJ");
        cupons.add("KLMNO");

        return cupons;
    }
    
    //Aqui é o restaurante validando o cupom. 
    //Toda vez que for validado, necessário deletar o cupom do cliente (por isso está sendo passado aqui o e-mail do cliente, que é pedido no front no momento da validação.
    public boolean validaCupom(String usuario, String cupom) {
        System.out.println("Usuário: " + usuario);
        System.out.println("Cupom: " + cupom);
        boolean flag = false;
        List<String> cupons = new ArrayList<>();
        cupons.add("ABCDE");
        cupons.add("FGHIJ");
        cupons.add("KLMNO");
        for (int i = 0; i < cupons.size(); i++) {
            System.out.println(i);
            if(cupom.equals(cupons.get(i))){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        return flag;
    }
}
