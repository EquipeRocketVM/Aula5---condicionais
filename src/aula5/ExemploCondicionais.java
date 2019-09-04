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
public class ExemploCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o first número");
        int n1 = sc.nextInt();

        System.out.println("Digite o second número");
        int n2 = sc.nextInt();

        System.out.println("Digite o third número");
        int n3 = sc.nextInt();
        
        /* Utilizando condicionais para saber qual é o
        maior número digitado pelo usuário
        */
        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("O número " + n1 + " é o maior");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("O número " + n2 + " é o maior");
        }
        else {
            System.out.println("O número " + n3 + " é o maior");
        }
            
    }

}
