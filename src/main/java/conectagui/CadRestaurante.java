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
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante, int nota){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
        this.nota = nota;
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
