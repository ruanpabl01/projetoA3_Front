/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui.entities;

import java.util.UUID;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class Restaurante {

    private String nomeRestaurante;
    private String cnpjRestaurante;
    private String senhaRestaurante;
    private String statusCadastroRestaurante;
    private int mediaAvaliacao;

    private String comentario;
    private String loginAvaliador;
    private int nota;

    public Restaurante(String cnpjRestaurante, String statusCadastroRestaurante, String nomeRestaurante, int mediaAvaliacao, String comentario, String login) {
        this.cnpjRestaurante = cnpjRestaurante;
        this.statusCadastroRestaurante = statusCadastroRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.mediaAvaliacao = mediaAvaliacao;

        this.comentario = comentario;
        this.loginAvaliador = login;
    }

    public Restaurante(String nomeRestaurante, String cnpjRestaurante, String senhaRestaurante, int nota) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
        this.senhaRestaurante = senhaRestaurante;
        this.nota = nota;
    }

    public Restaurante(String nomeRestaurante, String emailRestaurante, int nota) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = emailRestaurante;
        this.nota = nota;
    }

    public Restaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
    }

    public Restaurante(String nomeRestaurante, String cnpjRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
    }

    public Restaurante(String cnpjRestaurante) {
        this.cnpjRestaurante = cnpjRestaurante;
    }

    public String getLoginAvaliador() {
        return loginAvaliador;
    }

    public void setLoginAvaliador(String loginAvaliador) {
        this.loginAvaliador = loginAvaliador;
    }

    public int getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(int mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
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

    public String getStatusCadastroRestaurante() {
        return statusCadastroRestaurante;
    }

    public void setStatusCadastroRestaurante(String statusCadastroRestaurante) {
        this.statusCadastroRestaurante = statusCadastroRestaurante;
    }
}
