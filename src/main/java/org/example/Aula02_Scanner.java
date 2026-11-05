package org.example;

import java.util.Scanner;

public class Aula02_Scanner {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual e o seu nome:");
        String nome = entrada.nextLine();

        System.out.print("Qual e a sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Ola,"+nome+"!");
        System.out.println("Voce tem "+idade+" anos.");

        entrada.close();
    }
}