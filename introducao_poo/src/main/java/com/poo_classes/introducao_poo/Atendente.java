package com.poo_classes.introducao_poo;

public class Atendente extends Funcionario{
    private int contador=1;
    private int idAtendente;
    private double salario;




    public int getIdAtendente() {
        return idAtendente;
    }
    public Atendente (String nome,String cpf,String rg,Endereco endereco,String login ,String senha){
        super(nome, cpf, rg, endereco, login, senha);
        this.endereco=endereco;
        this.idAtendente=contador;
        contador++;
    }
   
   
}
