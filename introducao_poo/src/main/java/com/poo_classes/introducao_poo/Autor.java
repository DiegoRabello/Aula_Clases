package com.poo_classes.introducao_poo;

import java.security.PublicKey;

public class Autor extends Pessoas {
    private static int contador=1;
    private int idAutor;
    Endereco endereco;
    public int getIdAutor() {
        return idAutor;
    }
    public Autor (String nome, String cpf, String rg,Endereco endereco){
        super(nome, cpf, rg);
        this.endereco=endereco;
        this.idAutor=contador;
        contador++;
    }


}
