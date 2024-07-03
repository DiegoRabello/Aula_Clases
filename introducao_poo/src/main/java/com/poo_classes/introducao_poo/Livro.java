package com.poo_classes.introducao_poo;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;  

public class Livro {
    private static int contador =1;

    private   int idLivro;
    private   String nome;
    private   int edicao;
    private   LocalDate dtLivro ;
    
    public void setNomelivro(String nome){
        idLivro++;
        this.nome=nome;
    }
    public int getIdLivro() {
        return idLivro;
    }
    public void setEdicaoLivro(int edicao){
        this.edicao=edicao;
    }
    public void setDataLivro(LocalDate dtlivro){
        this.dtLivro=dtlivro;
    }
    public String getNome(){
        return nome;
    }
    public int getEdicao(){
        return edicao;
    }
    public LocalDate getDtlivro(){
        return dtLivro;
    }
    // construtores
    public Livro (String nome,int edicao,LocalDate dtLivro){
        this.nome=nome;
        this.edicao=edicao;
        this.dtLivro=dtLivro;
        this.idLivro=contador;
        contador++;
    }
}
