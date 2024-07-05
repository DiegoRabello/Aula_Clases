package com.poo_classes.introducao_poo;

public class Gerente extends Funcionario{
    private int contador=1;
    private int idGerente;
   

    public int getIdGerente() {
        return idGerente;
    }
    public Gerente(String login ,String senha,String nome, String cpf , String rg , Endereco endereco){
        super(nome, cpf, rg, endereco, login, senha);
        this.endereco=endereco;
        this.idGerente = contador;
        contador++;

    }
}
