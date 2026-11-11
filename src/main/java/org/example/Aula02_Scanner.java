package org.example;

import java.util.Scanner;

public class Aula02_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Scanner atividade //

        // irei fazer aqui um Scanner da cidade do usuario com String... //
        System.out.print("qual cidade voce mora:");
        String cidade = entrada.nextLine();
        System.out.println("Cidade:"+ cidade);

        //agr irei fazer uma quantidade inteira com int... //
        System.out.print("peso:");
        int peso = entrada.nextInt();
        System.out.println("seu peso:" + peso+"kg.");

        // um numero decimal com double ...//
        System.out.print("informe sua altura:");
        double altura = entrada.nextDouble();
        System.out.println("sua altura:" + altura+"Centimetros.");

        //agr vamos ver se os Dados retornam true ou false...//
            System.out.print("todos os Dados sao verdadeiros:");
            boolean dados = entrada.nextBoolean();
            System.out.println("verdade ou falso:"+dados);

            //  fechar o Scanner agora. bem eu fiz essa atividade de Scanner sozinho ja e uma coisa boa porque nao sabia fazer isso tudo. //
            entrada.close();
    }
}