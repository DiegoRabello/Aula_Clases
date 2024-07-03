package com.poo_classes.introducao_poo;
public class Editoras {
  private static int contador =1;

  private  String nome;
  private int idEditoras;

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
  public Editoras(String nome) {
    this.nome=nome;
    this.idEditoras=contador;
    contador++;
  }
}