package com.poo_classes.introducao_poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Emprestimo {
    private LocalDate dtEmprestimo;
    public LocalDate getDtEmprestimo() {
        return dtEmprestimo;
    }
    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }
    public LocalDate getdtDevolucao() {
        return dtEmprestimo.plusDays(15);
    }
    
}
