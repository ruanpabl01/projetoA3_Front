/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class CadRestaurante {
    private String nomeRestaurante;
    private String emailRestaurante;
    private String senhaRestaurante;
    
    public CadRestaurante(String nomeRestaurante, String emailRestaurante, String senhaRestaurante){
        this.nomeRestaurante = nomeRestaurante;
        this.emailRestaurante = emailRestaurante;
        this.senhaRestaurante = senhaRestaurante;
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
