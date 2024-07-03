package com.poo_classes.introducao_poo;

import java.rmi.server.LogStream;

import org.apache.commons.logging.Log;

public class Endereco {
    private static int contador=1;
    
    private int    idEndereco;
    private int    cep;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String estado;
    private int    numero;
    
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getIdEndereco() {
        return idEndereco;
    }
    public void setCidade (String cidade) {
       if ((cidade.length()<=58)) {
            this.cidade=cidade;
            idEndereco++;
       } 
    }
    public void setlogradouro (String logradouro) {
        if ((logradouro.length())<=100) {
            this.logradouro=logradouro;
        }
    }
    public void setComplemento (String complemento) {
        if ((complemento.length())<=100) {
            this.complemento=complemento;
        }
    }
    public void setEstado (String estado) {
        if ((estado.length())<=50) {
            this.estado = estado;
        }
    }
    public void setNumero (int numero) {
        this.numero=numero;
    }
    public String getCidade() {
        return cidade;
    }
    public String getlogradouro() {
        return logradouro;
    }
    public String getcomplemento() {
        return complemento;
    }
    public String getEstado() {
        return estado;
    }
    public int getNumero() {
        return numero;
    }
    // construtores
    public Endereco (int cep,String cidade,String logradouro,String complemento,String estado,int numero){
        this.cep=cep;
        this.cidade=cidade;
        this.logradouro=logradouro;
        this.complemento=complemento;
        this.estado=estado;
        this.numero=numero;
        this.idEndereco=contador;
        contador++;
    }
    public Endereco(int cep){
        this.cep=cep;
    }
}
