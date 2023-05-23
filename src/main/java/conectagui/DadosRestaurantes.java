/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectagui;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class DadosRestaurantes {
    private String nomeRestaurante;
    private String cnpjRestaurante;

    public DadosRestaurantes(String nomeRestaurante, String cnpjRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.cnpjRestaurante = cnpjRestaurante;
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

    public void setCnpjRestaurante(String cnpjRestaurante) {
        this.cnpjRestaurante = cnpjRestaurante;
    }
}
