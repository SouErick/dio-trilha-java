package Exercicio1;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("NOME DO TITULAR: ");
        String nomeTitular = teclado.nextLine();
        System.out.print("DEPÓSITO: R$ ");
        double deposito = Double.parseDouble(teclado.nextLine());
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.println("---------- DADOS DA CONTA ----------");
        System.out.println("NOME: " + nomeTitular);
        System.out.println("DEPÓSITO: " + deposito);
        System.out.println("CPF: " + cpf);
        teclado.close();
    }
}
