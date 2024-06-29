package com.poo_classes.introducao_poo;

import java.rmi.server.LogStream;

import org.apache.commons.logging.Log;

public class Endereco {
    private String Cidade;
    private String Logradouro;
    private String Complemento;
    private String Estado;
    private int    numero;

    public void setCidade (String Cidade) {
       if ((Cidade.length()<=58)) {
            this.Cidade=Cidade;
       } 
    }
    public void setLogradouro (String Logradouro) {
        if ((Logradouro.length())<=100) {
            this.Logradouro=Logradouro;
        }
    }
    public void setComplemento (String Complemento) {
        if ((Complemento.length())<=100) {
            this.Complemento=Complemento;
        }
    }
    public void setEstado (String Estado) {
        if ((Estado.length())<=50) {
            this.Estado = Estado;
        }
    }
    public void setNumero (int numero) {
        this.numero=numero;
    }
    public String getCidade() {
        return Cidade;
    }
    public String getLogradouro() {
        return Logradouro;
    }
    public String getComplemento() {
        return Complemento;
    }
    public String getEstado() {
        return Estado;
    }
    public int getNumero() {
        return numero;
    }
    
}
