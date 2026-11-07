package org.example;

import java.util.Scanner;

public class Aula02ScannerExercio03 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("-+-Dados Do Usuario -+-");

        System.out.print("idade:");
        int idade = entrada.nextInt();

        entrada.nextLine();

         System.out.print("nome completo:");
         String nome = entrada.nextLine();

         System.out.println("idade:"+idade);
         System.out.println("nome:"+nome);

         entrada.close();

    }
}
