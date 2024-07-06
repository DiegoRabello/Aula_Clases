package com.poo_classes.introducao_poo;

public class Funcionario extends Pessoas implements Calcula{
    private int contador=1;
    private int idFuncionario;
    private double salario;
    private String login;
    private String senha;
    private String cargo;
    Endereco endereco;
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    // construtor de funcionario
    public Funcionario (String nome, String cpf, String rg,Endereco endereco,String login ,String senha) {
        super(nome, cpf, rg);
        this.login=login;
        this.senha=senha;
        this.endereco=endereco;
        idFuncionario=contador;
        contador++;

    }

    public boolean Autentica (String login,String senha) {
       return this.login.equals(login) && this.senha.equals(senha);
    }
    Funcionario funcionario;

    public void imprimeContraCheque () {
        System.out.println("----- Contra Cheque -----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: "+  this.getCargo()  );
        System.out.println("Salário Bruto: R$ "+this.getSalario());
        System.out.println("Saldo FGTS: R$ "+calculaFGTS());
        System.out.println("Saldo INSS: R$ "+calculaINSS());
        
    }
   
    @Override
     public double calculaINSS (){
        return this.getSalario()*0.11;

    }
    public double calculaFGTS() {
        return this.getSalario()*0.08;
    }
}
