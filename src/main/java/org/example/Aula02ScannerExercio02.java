package org.example;

import java.util.Scanner;

public class Aula02ScannerExercio02 {
     public static void main (String[] args){
         Scanner entrada = new Scanner(System.in);

         System.out.println("----=== DADOS DO JOGADOR ===---");

         System.out.print("NOME DO JOGADOR:");
           String nome =  entrada.nextLine();

           System.out.print("plataforma:");
           String plataforma =  entrada.nextLine();

           System.out.print("Quantidade de Horas Jogadas:");
           int horas  = entrada.nextInt();

           System.out.println("Nome:"+nome);
           System.out.println("Plataforma:"+plataforma);
           System.out.println("Horas:"+horas+" Horas Jogadas.");

           entrada.close();
     }


}
