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
    private String cnpjRestaurante;
    private String senhaRestaurante;
    private String comentario;
    private String loginAvaliador;
    private int nota;
    private int notaAvaliacao;
    
    public CadRestaurante(String nomeRestaurante, String cnpjRestaurante, int notaAvaliacao, String comentario, String login) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
        this.notaAvaliacao = notaAvaliacao;
        this.comentario = comentario;
        this.loginAvaliador = login;
    }

    
    public CadRestaurante(String nomeRestaurante, String cnpjRestaurante, String senhaRestaurante, int nota) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
        this.senhaRestaurante = senhaRestaurante;
        this.nota = nota;
    }
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, int nota) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = emailRestaurante;
        this.nota = nota;
    }

    public CadRestaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
    }

    public CadRestaurante(String nomeRestaurante, String cnpjRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
    }

    public CadRestaurante(String cnpjRestaurante) {
        this.cnpjRestaurante = cnpjRestaurante;
    }
    
    public String getLoginAvaliador() {
        return loginAvaliador;
    }

    public void setLoginAvaliador(String loginAvaliador) {
        this.loginAvaliador = loginAvaliador;
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

    public String getCnpjRestaurante() {
        return cnpjRestaurante;
    }

    public void setEmailRestaurante(String cnpjRestaurante) {
        this.cnpjRestaurante = cnpjRestaurante;
    }

    public String getSenhaRestaurante() {
        return senhaRestaurante;
    }

    public void setSenhaRestaurante(String senhaRestaurante) {
        this.senhaRestaurante = senhaRestaurante;
    }
}
