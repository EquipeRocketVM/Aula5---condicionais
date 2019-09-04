/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class AprovacaoAlgoritmo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declarando as váriavels
        float prova1, prova2, n1, n2, media;
        int numeroFaltas = 0;
        String nomeAluno;

        //declarando as constantes
        final float P1 = 0.5f;
        final float P2 = 0.6f;
        //final int TOTAL_FALTAS = 18;

        System.out.println("Algoritmos I!");
        System.out.println("Aluno: ");
        nomeAluno = sc.next();
        System.out.println("Prova 1 : ");
        prova1 = sc.nextFloat();
        System.out.println("Prova 2 : ");
        prova2 = sc.nextFloat();
        System.out.println("Faltas do aluno : ");
        numeroFaltas = sc.nextInt();

        n1 = prova1 * P1;
        n2 = prova2 * P2;

        media = n1 + n2;

        if ((media >= 6) && (numeroFaltas < 18)) {
            System.out.println(nomeAluno + " : Aprovado amado com a média: " + media + " e as faltas certinhas : " + numeroFaltas);

        } else if (numeroFaltas >= 18) {
            System.out.println("Aluno " + nomeAluno + " reprovado por quantidade de falta excedida : " + numeroFaltas);
        } else if (media < 6) {
            System.out.println("Aluno " + nomeAluno + " reprovado por nota : " + media);
        }  
        if ((media < 6) && (numeroFaltas >=18)){
            System.out.println("Aluno" + nomeAluno + " :Reprovado por média baixa : " + media + " e falta com quantidade de : " + numeroFaltas);
        }
    }

}
