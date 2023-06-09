/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class CadCliente {
    private String nomeCliente;
    private String emailCliente;
    private String senhaCliente;
    private String cupomCliente;
    
    public CadCliente(String nomeCliente, String emailCliente, String senhaCliente){
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.senhaCliente = senhaCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
}