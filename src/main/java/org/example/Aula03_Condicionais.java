package org.example;

import java.util.Scanner;

public class Aula03_Condicionais {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero > 0 ){
            System.out.println("O numero e positivo. ");
        }else if (numero < 0 ) {
            System.out.println("O numero e negativo. ");
        }else {
            System.out.println(" O numero e zero.");
        }
        scanner.close();
    }
}
