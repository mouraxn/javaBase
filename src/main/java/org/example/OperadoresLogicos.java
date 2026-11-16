package org.example;

public class OperadoresLogicos {
    public static void main (String[] args){
        int idade = 25 ;
        boolean estudadante = true ;

        System.out.println("idade >= 18 && estudante: "+ (idade >= 18 && estudadante));
        System.out.println("idade < 18 || estudantes: "+ (idade <18 ||  estudadante));
        System.out.println("!(idade >= 18: "+(idade >= 18 ));
    }
}
