package com.poo_classes.introducao_poo;

public class Gerente extends Funcionario{
    private int contador=1;
    private int idGerente;
    // private int salario;


    // double fgts = salario * 0.08;
    // double inss = salario * 0.11;

   

    public int getIdGerente() {
        return idGerente;
    }
    public Gerente(String login ,String senha,String nome, String cpf , String rg , Endereco endereco){
        super(nome, cpf, rg, endereco, login, senha);
        this.endereco=endereco;
        this.idGerente = contador;
        contador++;

    }
    // public void imprimeContraCheque (Gerente gerente) {
    //     System.out.println("----- Contra Cheque -----");
    //     System.out.println("Nome: " + gerente.getNome());
    //     System.out.println("Cargo: Gerente"  );
    //     System.out.println("Salário Bruto: R$ "+gerente.getSalario());
    //     System.out.println("Saldo FGTS: R$ "+fgts);
    //     System.out.println("Saldo INSS: R$ "+inss);
    // }

}
