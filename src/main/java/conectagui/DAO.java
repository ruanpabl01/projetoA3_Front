package conectagui;

import conectagui.entities.Cliente;
import conectagui.entities.Restaurante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.xml.stream.XMLStreamConstants.CHARACTERS;

public class DAO {

    //Realiza a busca na tabela de 'Cliente' do BD
    public boolean existeCliente(DadosUsuario usuario) throws Exception {
        String sql = "SELECT * FROM cliente WHERE emailCliente=? AND senhaCliente=?";
        try (
                Connection conn = ConexaoBD.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    //Realiza a busca na tabela 'Restaurante' do BD
    public boolean existeRestaurante(DadosUsuario usuario) throws Exception {
        String sql = "SELECT * FROM restaurante WHERE cnpjRestaurante=? AND senhaRestaurante=?";
        try (Connection conn = ConexaoBD.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    //Realiza a busca de Admin na tabela 'Cliente' do BD
    public boolean existeAdmin(DadosUsuario usuario) throws Exception {
        String sql = "SELECT * FROM cliente WHERE emailCliente=? AND senhaCliente=?";
        try (Connection conn = ConexaoBD.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    //Realiza o cadastro do cliente no BD
    public void inserirCliente(Cliente cliente) throws Exception {
        String sql = "INSERT INTO cliente (emailCliente, nomeCliente, senhaCliente) VALUES (?, ?, ?);";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getEmailCliente());
            ps.setString(3, cliente.getSenhaCliente());
            ps.execute();
            System.out.println("Cadastro realizado (classe DAO)" + cliente.getNomeCliente() + ", "
                    + cliente.getEmailCliente() + ", " + cliente.getSenhaCliente());
        } catch (Exception ex) {
            System.out.println("Não foi possível realizar o cadastro.");
        }

    }

    //Realiza o cadastro do Restaurante no BD em uma lista para aprovação
    public void inserirRestaurante(Restaurante restaurante) throws Exception {

        String sql = "INSERT INTO restaurante (cnpjRestaurante, statusCadastroRestaurante, nomeRestaurante, senhaRestaurante) VALUES (?, ?, ?, ?);";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            System.out.println("passei aq");
            ps.setString(3, restaurante.getNomeRestaurante());
            ps.setInt(1, Integer.parseInt(restaurante.getCnpjRestaurante()));
            ps.setString(4, restaurante.getSenhaRestaurante());
            ps.setString(2, "pendente");
            ps.execute();

            System.out.println("Cadastro realizado (classe DAO)"
                    + restaurante.getNomeRestaurante()
                    + ", "
                    + restaurante.getCnpjRestaurante()
                    + ", "
                    + restaurante.getSenhaRestaurante()
                    + ", "
                    + restaurante.getStatusCadastroRestaurante());

            JOptionPane.showMessageDialog(null, "Cadastro realizado! Aguarde ser aprovado.");

        } catch (Exception ex) {

            System.out.println("Não foi possível realizar o cadastro do restaurante." + ex);
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro. Tente novamente.");
        }

    }

    //Recebe o CNPJ cujo cadastro foi reprovado. O restaurante deve ser removido da tabela de restaurantes pendentes aprovação.
    public void reprovarRestaurante(Integer cnpj) throws Exception {
        String sql = "DELETE FROM restaurante WHERE cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, cnpj);
            ps.execute();
        }
        System.out.println("Restaurante reprovado: " + cnpj);
    }

    public void deletarRestaurante(Integer cnpj) throws Exception {
        String sql = "DELETE FROM restaurante WHERE id = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, cnpj);
            ps.execute();
        }
        System.out.println(cnpj);
    }

    public void atualizarRestaurante(String cnpj, String nome) throws Exception {
        String sql = "UPDATE restaurante SET nomeRestaurante = ? WHERE cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(2, cnpj);
            ps.setString(1, nome);
            ps.execute();

            System.out.println("Cadastro atualizado (classe DAO)" + nome + ", " + cnpj);
            JOptionPane.showMessageDialog(null, "Atualização realizada!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Atualização não realizada!");
            System.out.println("Não foi possível atualizar o nome do restaurante");

        }

    }

    public void avaliarRestaurante(String cliente, int cnpj, String comentario, int nota) throws Exception {
        String sql = "INSERT INTO avaliacao (Cliente_emailCliente, Restaurante_cnpjRestaurante, comentarioAvaliacao, notaAvaliacao) VALUES (?, ?, ?, ?)";
 
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, cliente);
            ps.setInt(2, cnpj);
            ps.setString(3, comentario);
            ps.setInt(4, nota);

            ps.execute();

            System.out.println("Avaliação registrada na tabela de Avaliação(classe DAO)");

        }

    }

    //Será chamado toda vez que uma avaliação for realizada. 
    //Recebe Nome e CNPJ do restaurante, e-mail e nota do usuário avaliador. Deve ser incrementado 1 na quantidade de avaliações do usuário com e-mail recebido.
    //Aqui será necessário um IF para verificar se o usuário já avaliou 3x, se sim, chamar função 'geraCupom' passando o LoginAvaliador para armazenar um cupom no cliente;
    //Importante concatenar usuário avaliador e comentário antes de inserir no banco 
    public void atualizarAvaliacaoRestaurante(int cnpj) throws Exception {
        String sql = "UPDATE restaurante SET mediaAvaliacao = ? where cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            int mediaAvaliacao = calculaMediaRestaurante(cnpj);

            ps.setInt(1, mediaAvaliacao);
            ps.setInt(2, cnpj);
            ps.execute();

            System.out.println("Avaliação registrada (classe DAO)");
            JOptionPane.showMessageDialog(null, "Avaliação registrada com sucesso!");

        } catch (Exception ex) {
            System.out.println("Avaliação não registrada (classe DAO)");
            JOptionPane.showMessageDialog(null, "Avaliação registrada sem sucesso :C ");

        }

    }

    public Integer calculaMediaRestaurante(int cnpj) throws Exception {
        List<Integer> notas = new ArrayList<>();
        int somatoria = 0;
        int media = 0;

        String sql = "SELECT notaAvaliacao FROM avaliacao where Restaurante_cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, cnpj);

            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {
                    int a = rs.getInt("notaAvaliacao");
                    notas.add(a);
                }

            }
            int qtd = notas.size();

            for (Integer nota : notas) {
                somatoria += nota;
            }

            media = somatoria / qtd;
        }

        return media;

    }

//##################################################MÉTODOS################################################################################
//Realiza uma busca por CNPJ no banco (base de restaurantes cadastrados) e retorna nome e media;
    public String[] retornaRestaurantesPorCNPJ(int cnpj) {
        String[] resultados = new String[2];

        String sql = "SELECT nomeRestaurante, mediaAvaliacao FROM restaurante where cnpjRestaurante = ?;";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, cnpj);
            ResultSet rs = ps.executeQuery();

            if (rs != null && rs.next()) {
                resultados[0] = rs.getString("nomeRestaurante");
                resultados[1] = rs.getInt("mediaAvaliacao") + "";
            }

            System.out.println("Busca por CNPJ no banco realizada. CNPJ: " + cnpj + "Nome: " + resultados[0] + "Media: " + resultados[1]);

            return resultados;

        } catch (Exception ex) {

            System.out.println("Não foi possível realizar a busca por CNPJ no banco." + ex);

            return resultados;
        }
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
    public Restaurante[] retornaListaRestaurantesCadastrados() {

        Restaurante[] restaurantesCad = new Restaurante[3];
        restaurantesCad[0] = new Restaurante("Oliver Garden", "47380257000180", 10);
        restaurantesCad[1] = new Restaurante("MCDonalds", "16523966000143", "123456", 8);
        restaurantesCad[2] = new Restaurante("BK", "27824158000132", "123456", 6);

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
            if (cupom.equals(cupons.get(i))) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
