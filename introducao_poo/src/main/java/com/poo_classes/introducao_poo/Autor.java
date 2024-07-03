package com.poo_classes.introducao_poo;

public class Autor {
    private static int contador=1;

    private String nome;
    private int idAutor;
    
    public void setNomeAutores(String nome) {
        idAutor++;
        this.nome = nome;
    }
    public String getNome() {
        
        return nome;
    }
    public int getIdAutor() {
        return idAutor;
    }
    //construtor
    public Autor(String nome){
        this.nome=nome;
        this.idAutor=contador;
    }


}
