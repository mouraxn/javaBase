package org.example;

import java.util.Scanner;

public class Aula02_Scanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine().trim();

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine().trim());

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
}