package com.poo_classes.introducao_poo;

public class Pessoas {
    private String nome;
	private String CPF;
    private String RG;
    

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCpf(String CPF){
        String cpfNumerico = CPF.replaceAll("\\D", "");
        if ((cpfNumerico.length())==11) {
            
            this.CPF=CPF;
        }
    }
    public void setRG (String RG) {
        String rgNumerico = RG.replaceAll("\\D", "");
        if ((rgNumerico.length())==9) {
            
            this.RG=RG;
        }
    }
    public String getnome() {
        return nome;
    }
    public String getCPF () {
        return CPF;
    }
    public String getRG () {
        return RG;
    }
}
