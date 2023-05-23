package conectagui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAO {

    //Realiza a busca na tabela de 'Clientes' do BD
    public boolean existeCliente(LoginUsuario usuario) throws Exception {
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
    public boolean existeRestaurante(LoginUsuario usuario) throws Exception {
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
    public boolean existeAdmin(LoginUsuario usuario) throws Exception {
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
        + restaurante.getEmailRestaurante() + restaurante.getSenhaRestaurante());
    }
    
    //Recebe o CNPJ cujo cadastro foi reprovado. O restaurante deve ser removido da tabela de restaurantes pendentes aprovação.
    public void reprovarRestaurante (CadRestaurante cnpj) throws Exception{ 
//        String sql = "DELETE FROM tb_curso WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql);){ 
//            ps.setInt (1, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println(cnpj.getEmailRestaurante());
    }
    
    public void deletarRestaurante (CadRestaurante cnpj) throws Exception{ 
//        String sql = "DELETE FROM tb_curso WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql);){ 
//            ps.setInt (1, curso.getId()); 
//            ps.execute(); 
//        } 
        System.out.println(cnpj.getEmailRestaurante());
    }
    
    public void atualizarRestaurante (CadRestaurante restaurante) throws Exception{ 
//        String sql = "UPDATE tb_curso SET nome = ?, tipo = ? WHERE id = ?"; 
//        try (Connection conexao = ConexaoBD.obterConexao(); 
//                PreparedStatement ps = conexao.prepareStatement(sql)){ 
//            ps.setString (1, curso.getNome()); 
//            ps.setString (2, curso.getTipo()); 
//            ps.setInt (3, curso.getId()); 
//            ps.execute(); 
//        } 
               System.out.println("Cadastro atualizado (classe DAO)" + restaurante.getNomeRestaurante() + ", " 
        + restaurante.getEmailRestaurante() + ", " + restaurante.getNota());
    }
    
    //##################################################MÉTODOS################################################################################
     
    //Realiza uma busca por CNPJ no banco (base de restaurantes cadastrados) e retorna nome;
    public CadRestaurante[] retornaRestaurantesPorCNPJ(String cnpj){
        
        CadRestaurante [] restaurantes = new CadRestaurante[3]; 
        restaurantes[0] = new CadRestaurante("Oliver Garden", "47380257000180", 10);
        restaurantes[1] = new CadRestaurante("MCDonalds", "16523966000143", 8);
        restaurantes[2] = new CadRestaurante("BK", "27824158000132", 6);
        
        return restaurantes;
    }   
    
    
    
    //Seta os restaurantes pendentes aprovações na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes pendentes aprovação.
    public DadosRestaurantes [] retornaListaRestaurantesPendentes(){
        
        DadosRestaurantes [] restaurantes = new DadosRestaurantes[3]; 
        restaurantes[0] = new DadosRestaurantes("Oliver Garden", "47380257000180");
        restaurantes[1] = new DadosRestaurantes("MCDonalds", "16523966000143");
        restaurantes[2] = new DadosRestaurantes("BK", "27824158000132");

        return restaurantes;
        
    }
    
    //Seta os restaurantes cadastrados na lista 'Restaurantes' e devolve para a classe chamadora. A fonte será a tabela de restaurantes cadastrados.
    public CadRestaurante [] retornaListaRestaurantesCadastrados(){
        
        CadRestaurante [] restaurantesCad = new CadRestaurante[3];
        restaurantesCad[0] = new CadRestaurante("Oliver Garden", "47380257000180", "123456", 10);
        restaurantesCad[1] = new CadRestaurante("MCDonalds", "16523966000143", "123456", 8);
        restaurantesCad[2] = new CadRestaurante("BK", "27824158000132", "123456", 6);
        
        return restaurantesCad;        
    }

    
}
