package com.poo_classes.introducao_poo;
import java.util.Scanner;
public class Menu {

    public void menuAplicação(){
        int opcao;
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario(null, null, null, null, null, null);
        System.out.println("============= Menu =============");
        System.out.println("1.Imprimir Contra Cheque");
        System.out.println("2.Imprimir FGTS");
        System.out.println("3.Imprimir INSS");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                funcionario.imprimeContraCheque();
                
                break;
        
            case 2:
                System.out.println("O seu FGTS é: " + funcionario.calculaFGTS());
                
                break;
            case 3:
                System.out.println("O seu INSS é: "+ funcionario.calculaiNSS());
                break;
        }

        
       
    }

}
