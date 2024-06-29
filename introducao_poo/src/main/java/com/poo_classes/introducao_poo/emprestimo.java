package com.poo_classes.introducao_poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class emprestimo {
    private LocalDate dataEmprestimo;

    
    public emprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public LocalDate calcularDataDevolucao() {
        return dataEmprestimo.plusDays(15);
    }
}
