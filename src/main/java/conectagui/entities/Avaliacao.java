/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui.entities;

/**
 *
 * @author amand
 */
public class Avaliacao {

    private String emailCliente;
    private String cnpjRestaurante;
    private String senhaRestaurante;
    private String comentarioAvaliacao;
    private int notaAvaliacao;

    public Avaliacao(String emailCliente, String cnpjRestaurante, String senhaRestaurante, String comentarioAvaliacao, int notaAvaliacao) {
        this.emailCliente = emailCliente;
        this.cnpjRestaurante = cnpjRestaurante;
        this.senhaRestaurante = senhaRestaurante;
        this.comentarioAvaliacao = comentarioAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
    }
    
     public Avaliacao() {
 
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public String getCnpjRestaurante() {
        return cnpjRestaurante;
    }

    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }

    public String getComentarioAvaliacao() {
        return comentarioAvaliacao;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void setCnpjRestaurante(String cnpjRestaurante) {
        this.cnpjRestaurante = cnpjRestaurante;
    }

    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }

    public void setComentarioAvaliacao(String comentarioAvaliacao) {
        this.comentarioAvaliacao = comentarioAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

  

}
