/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui;

import java.util.UUID;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class CadRestaurante {
    private String nomeRestaurante;
    private String emailRestaurante;
    private String senhaRestaurante;
    private String cupons;
    private int nota;
    private int notaAvaliacao;
    private String comentario;
    private String loginAvaliador;
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante, int nota){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
        this.nota = nota;
    }
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, int notaAvaliacao, String comentario, String cupom, String login){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.notaAvaliacao = notaAvaliacao;
        this.comentario = comentario;
        this.cupons = cupom;
        this.loginAvaliador = login;
    }

    public String getLoginAvaliador() {
        return loginAvaliador;
    }

    public void setLoginAvaliador(String loginAvaliador) {
        this.loginAvaliador = loginAvaliador;
    }
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, int nota){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.nota = nota;
    }
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
    }
    
    public CadRestaurante(String emailRestaurante){
        this.emailRestaurante = emailRestaurante;
    }

    
    public CadRestaurante(String nomeRestaurante, String cnpjRestaurante){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = cnpjRestaurante;
    }

    public String getCupons() {
        return cupons;
    }

    public void setCupons(String cupons) {
        this.cupons = cupons;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEmailRestaurante() {
        return emailRestaurante;
    }

    public void setEmailRestaurante(String emailRestaurante) {
        this.emailRestaurante = emailRestaurante;
    }

    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }

    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }
}
