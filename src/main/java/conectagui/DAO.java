package conectagui;

import conectagui.entities.Cliente;
import conectagui.entities.Restaurante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.DefaultListModel;
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

    public void aprovarRestaurante(Restaurante restaurante) throws Exception {

        String sql = "UPDATE restaurante SET statusCadastroRestaurante = ? WHERE cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(2, Integer.parseInt(restaurante.getCnpjRestaurante()));
            ps.setString(1, "cadastrado");
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aprovado com sucesso! ");

        } catch (Exception ex) {

            System.out.println("Não foi possível aprovar." + ex);
            JOptionPane.showMessageDialog(null, "Não foi possível aprovar. Tente novamente.");
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
        String sql = "UPDATE restaurante SET statusCadastroRestaurante = 'excluido' WHERE cnpjRestaurante = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {

           
            ps.setInt(1, cnpj);
       
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualização realizada.");

          
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

    public List<Restaurante> retornaListaRestaurantesPendentes() throws Exception {
        List<Restaurante> rests = new ArrayList<>();

        String sql = "SELECT nomeRestaurante, cnpjRestaurante, statusCadastroRestaurante FROM restaurante WHERE statusCadastroRestaurante = ? ";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "pendente");
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {

                    Restaurante rest = new Restaurante();

                    rest.setNomeRestaurante(rs.getString("nomeRestaurante"));
                    rest.setCnpjRestaurante(Integer.toString(rs.getInt("cnpjRestaurante")));
                    rest.setStatusCadastroRestaurante(rs.getString("statusCadastroRestaurante"));

                    rests.add(rest);
                }

            }

        }

        return rests;

    }

    //Seta os restaurantes cadastrados na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes cadastrados.
    public List<String> retornaListaNomesRestaurantesCadastrados() throws Exception {
        String aux;
        List<String> rests = new ArrayList<>();
        boolean boleana = false;
        String sql = "SELECT nomeRestaurante FROM restaurante WHERE statusCadastroRestaurante = 'cadastrado'";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {
                    boleana = false;

                    if (rests.isEmpty() == true) {
                        rests.add(rs.getString("nomeRestaurante"));
                    } else {
                        for (String s : rests) {

                            System.out.println(s + " " + rs.getString("nomeRestaurante"));
                            if (s.equals(rs.getString("nomeRestaurante"))) {
                                boleana = true;
                                break;
                            } else {
                                continue;

                            }

                        }

                        if (boleana == false) {
                            rests.add(rs.getString("nomeRestaurante"));

                        }

                    }

                }

            }

        }

        return rests;
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
    /* public DadosRestaurantes[] retornaListaRestaurantesPendentes() {

        DadosRestaurantes[] restaurantes = new DadosRestaurantes[3];
        restaurantes[0] = new DadosRestaurantes("Oliver Garden", "47380257000180");
        restaurantes[1] = new DadosRestaurantes("MCDonalds", "16523966000143");
        restaurantes[2] = new DadosRestaurantes("BK", "27824158000132");

        return restaurantes;

    }*/
    //Seta os restaurantes cadastrados na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes cadastrados.
    public List<Restaurante> retornaListaRestaurantesCadastrados() throws Exception {

        List<Restaurante> rests = new ArrayList<>();

        String sql = "SELECT DISTINCT nomeRestaurante, mediaAvaliacao, comentarioAvaliacao FROM restaurante AS r JOIN avaliacao AS a where a.Restaurante_cnpjRestaurante = r.cnpjRestaurante and r.statusCadastroRestaurante = 'cadastrado'";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {

                    Restaurante rest = new Restaurante(
                            rs.getString("nomeRestaurante"),
                            rs.getInt("mediaAvaliacao"),
                            rs.getString("comentarioAvaliacao")
                    );

                    rests.add(rest);
                }

            }

        }

        return rests;
    }

    public Restaurante retornaRestauranteSelecionadoAdm(String nomeProcurado) throws Exception {

        Restaurante rest = new Restaurante();

        String sql = "SELECT nomeRestaurante, cnpjRestaurante, statusCadastroRestaurante FROM restaurante WHERE nomeRestaurante = ?";
        System.out.println(nomeProcurado + "nomeprocurado");
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, nomeProcurado);
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {

                    System.out.println(rs.getString("nomeRestaurante"));

                    rest.setNomeRestaurante(rs.getString("nomeRestaurante"));
                    rest.setStatusCadastroRestaurante(rs.getString("statusCadastroRestaurante"));
                    rest.setCnpjRestaurante(Integer.toString(rs.getInt("cnpjRestaurante")));

                }

            }

        } catch (Exception ex) {
            System.out.println("exception" + ex);

        }

        return rest;

    }

    public Restaurante retornaRestauranteSelecionadoAdmENota(String nomeProcurado) throws Exception {

        Restaurante rest = new Restaurante();

        String sql = "SELECT nomeRestaurante, cnpjRestaurante, statusCadastroRestaurante, mediaAvaliacao FROM restaurante WHERE nomeRestaurante = ?";
        System.out.println(nomeProcurado + "nomeprocurado");
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, nomeProcurado);
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {

                    System.out.println(rs.getString("nomeRestaurante"));

                    rest.setNomeRestaurante(rs.getString("nomeRestaurante"));
                    rest.setStatusCadastroRestaurante(rs.getString("statusCadastroRestaurante"));
                    rest.setCnpjRestaurante(Integer.toString(rs.getInt("cnpjRestaurante")));
                    rest.setMediaAvaliacao(rs.getInt("mediaAvaliacao"));

                }

            }

        } catch (Exception ex) {
            System.out.println("exception" + ex);

        }

        return rest;

    }

    public Restaurante retornaRestauranteSelecionado(String nomeProcurado, DefaultListModel comentarios) throws Exception {

        Restaurante rest = new Restaurante();

        String sql = "SELECT nomeRestaurante, cnpjRestaurante, mediaAvaliacao, comentarioAvaliacao FROM restaurante AS r JOIN avaliacao AS a where a.Restaurante_cnpjRestaurante = r.cnpjRestaurante";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {

                    if (nomeProcurado.equals(rs.getString("nomeRestaurante"))) {

                        rest.setNomeRestaurante(rs.getString("nomeRestaurante"));
                        rest.setMediaAvaliacao(rs.getInt("mediaAvaliacao"));
                        rest.setCnpjRestaurante(Integer.toString(rs.getInt("cnpjRestaurante")));

                        comentarios.addElement(rs.getString("comentarioAvaliacao"));

                    }
                }

            }

        }

        return rest;

    }

    //Aqui será recebido o CNPJ, a partir dele, será necessário percorrer os comentários do restaurante em questão para setar na variável comentários e devolver para a classe chamadora
    //  public List<String> retornaComentariosRestaurantesCadastrados(String cnpj) {
    //return comentarios;
    // }
    //A cada nova geração, necessário realizar inserção no banco de dados;
    //Necessário receber o usuario ao qual o cupom vai ser inserido;
    public void gerarCupom(String usuario, int cnpj) throws Exception {
        String sql = "INSERT INTO cupom (Cliente_emailCliente, Restaurante_cnpjRestaurante) VALUES (?, ?)";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setInt(2, cnpj);

            ps.execute();

            System.out.println("Cupom gerado para o cliente de email " + usuario);

        }
    }

    //Será chamada quando o usuário clicar em 'Meus cupons'.
    //Necessário consulta no banco dos cupons do cliente e inserir na lista 'cupons'.
    public void retornaCuponsCliente(String usuario, DefaultListModel lista) {

        String sql = "SELECT codigoCupom FROM cupom where Cliente_emailCliente = ?";
        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();

            int i = 0;

            if (rs != null) {

                while (rs.next()) {
                    int a = rs.getInt("codigoCupom");
                    lista.addElement(a);
                }

            }

        } catch (Exception ex) {

            System.out.println("Erro ao retornar cupons");

        }

    }

    public void deletaCupom(int cupom) throws Exception {
        String sql = "DELETE FROM cupom WHERE codigoCupom = ?";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, cupom);
            ps.executeUpdate();

        }

    }
    //Aqui é o restaurante validando o cupom. 
    //Toda vez que for validado, necessário deletar o cupom do cliente (por isso está sendo passado aqui o e-mail do cliente, que é pedido no front no momento da validação.

    public boolean validaCupom(String usuario, int cupom) {
        System.out.println("Usuário: " + usuario);
        System.out.println("Cupom: " + cupom);
        Integer a = 0;

        String sql = "SELECT COUNT(*) AS QTD FROM cupom WHERE Cliente_emailCliente = ? AND codigoCupom = ?";

        try (Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setInt(2, cupom);
            ResultSet rs = ps.executeQuery();
            rs.next();

            if (rs.getInt("QTD") == 0) {

                JOptionPane.showMessageDialog(null, "Cupom não encontrado!");

                return false;

            } else {

                JOptionPane.showMessageDialog(null, "Parabéns! O cliente possui 10% de desconto em sua loja!");

                deletaCupom(cupom);

            }

        } catch (Exception ex) {

            System.out.println("Erro ao retornar cupons" + ex);

        }

        return true;
    }
}
