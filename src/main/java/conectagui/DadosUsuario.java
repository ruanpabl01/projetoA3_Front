package conectagui;


public class DadosUsuario {
    private String nome;
    private String senha;
    
    public DadosUsuario(String nome, String senha){
        this.nome=nome;
        this.senha=senha;
    }

    DadosUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
