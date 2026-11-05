package org.example;


import java.util.Scanner;

public class Aula02ScannerExercicio {
     public static void main (String[] args){
         Scanner entrada = new Scanner(System.in);

         System.out.print("nome do filme:");
         String filme = entrada.nextLine();

         System.out.print("ano de lancamento:");
         int lancamento = entrada.nextInt();

         System.out.print("Duraçao do filme:");
         int duracao = entrada.nextInt();

         System.out.println("filme:"+ filme);
         System.out.println("lancamento:"+ lancamento);
         System.out.println("duraçao:"+ duracao+"MINUTOS ");

         entrada.close();
     }
}
