package org.example;

import java.sql.SQLOutput;

public class OperadoresAritmeticos {
      public static void main (String[] args){
          int numero1 = 10;
          int numero2 = 3;

          System.out.println(numero1 + numero2); // isso vai somar o 10 + 3
          System.out.println(numero1 -numero2);  // essa vai subtrair o 10 - 3
          System.out.println(numero1 * numero2); // multiplica o 10 * 3
          System.out.println(numero1 / numero2); // divide intero 10 / 3
          System.out.println(numero1 % numero2); // resto da divisao para sobrar 1

          boolean maior = numero1 > numero2 ;   // faz a pergunta se 10 e maior que 3
          boolean igual = numero1 == numero2;  // faz a pergunta se 10 e igual 3
          boolean diferente = numero1 != numero2; // aqui pergunta se 10 e diferente de 3

          boolean  logico = maior && numero1 < 20 ; // as duas coisas precisam ser verdadeiras

          System.out.println(maior);
          System.out.println(igual);
          System.out.println(diferente);
          System.out.println(logico);

      }
}
