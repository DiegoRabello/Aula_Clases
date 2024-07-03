package com.poo_classes.introducao_poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Emprestimo {
    private static int contador = 1;
    private LocalDate dtEmprestimo;
    private int idEmprestimo;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }
    public LocalDate getDtEmprestimo() {
        return dtEmprestimo;
    }
    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        idEmprestimo++;
        this.dtEmprestimo = dtEmprestimo;
    }
    public LocalDate getdtDevolucao() {
        return dtEmprestimo.plusDays(15);
    }
    // construtor
    public Emprestimo(LocalDate dtEmprestimo){
        this.dtEmprestimo=dtEmprestimo;
        this.idEmprestimo=contador;
        contador++;
    }
}
