/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste.avaliação;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class TESTEAVALIAÇÃO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int maiorNumero = Integer.MIN_VALUE;
        
        System.out.println("Digite seis números inteiros:");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número inteiro lido inicialmente é: " + maiorNumero);
    }
}