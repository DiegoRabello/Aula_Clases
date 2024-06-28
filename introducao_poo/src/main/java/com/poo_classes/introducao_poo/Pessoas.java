package com.poo_classes.introducao_poo;

public class Pessoas {
    public String nome;
	public Object CPF;
    int RG;
    void imprimeCadastro() {
        System.out.println("========== Cadastro da Pessoa ==========");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+CPF);
        System.out.println("RG: "+RG);
    }
}
