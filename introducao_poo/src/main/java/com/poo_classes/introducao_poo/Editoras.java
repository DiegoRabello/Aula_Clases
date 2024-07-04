package com.poo_classes.introducao_poo;
public class Editoras {
  private static int contador =1;
  private int idEditoras;

  private  String nome;
  Endereco endereco;

  public int getIdEditoras() {
    return idEditoras;
  }
  public void setNomeEditora(String nome) {
      idEditoras++;
      this.nome = nome;
  }
  public String getNomeEditora() {
      return nome;
  }
 
  // construtor
  public Editoras(String nome,Endereco endereco) {
    this.nome=nome;
    this.endereco=endereco;
    this.idEditoras=contador;
    contador++;
  }
}