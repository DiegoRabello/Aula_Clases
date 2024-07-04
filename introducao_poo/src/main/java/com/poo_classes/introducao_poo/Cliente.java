package com.poo_classes.introducao_poo;

public class Cliente extends Pessoas {
    private int contador=1;
    private int idCliente;
    
    public int getIdCliente() {
        return idCliente;
    }
    Endereco endereco;
    public Cliente(String nome, String cpf , String rg , Endereco endereco){
        super(nome, cpf, rg);
        this.endereco= endereco;
        this.idCliente= contador;
        contador++;
    }

}
