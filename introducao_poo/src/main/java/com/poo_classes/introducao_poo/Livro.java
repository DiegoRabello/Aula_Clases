package com.poo_classes.introducao_poo;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;  

public class Livro {
    private   String nome;
    private   int edicao;
    private   LocalDate dtLivro ;
    
    public void setnomelivro(String nome){
        this.nome=nome;
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
    public int getedicao(){
        return edicao;
    }
    public LocalDate getdtlivro(){
        return dtLivro;
    }
}
