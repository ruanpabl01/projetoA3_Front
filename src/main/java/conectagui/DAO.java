package conectagui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        + restaurante.getEmailRestaurante() + ", " + restaurante.getSenhaRestaurante());
    }

}
