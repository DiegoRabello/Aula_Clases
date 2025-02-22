package com.poo_classes.introducao_poo;

import java.util.Scanner;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoPooApplication.class, args);
		Scanner sc = new Scanner(System.in);
		limpaConsole();
        // Endereco end1 = new Endereco(12345);
        // Funcionario f1 = new Funcionario(null, null, null, end1, null, null);
       
	}
    public static void limpaConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para sistemas UNIX-like (Linux, macOS), use o comando "clear"
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

