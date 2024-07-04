package com.poo_classes.introducao_poo;

public abstract class Pessoas {
    private static int contador=1;

    private String nome;
	private String cpf;
    private String rg;
    private int    idPessoa;

    public int getIdPessoa() {
        return idPessoa;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setcpf(String cpf){
        String cpfNumerico = cpf.replaceAll("\\D", "");
        if ((cpfNumerico.length())==11) {
            
            this.cpf=cpf;
        }
    }
    public void setrg (String rg) {
        String rgNumerico = rg.replaceAll("\\D", "");
        if ((rgNumerico.length())==9) {
            
            this.rg=rg;
        }
    }
    public String getNome() {
        return nome;
    }
    public String getcpf () {
        return cpf;
    }
    public String getrg () {
        return rg;
    }

    // construtores
    public Pessoas(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idPessoa=contador;
        contador++;
    }
}
