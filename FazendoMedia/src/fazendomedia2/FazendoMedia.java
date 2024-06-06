/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fazendomedia2;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class FazendoMedia {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as notas do aluno");
        System.out.print("Nota 1:");
        
        float n1 = teclado.nextFloat();//valores da media
        System.out.print("Nota 2:");
        float n2 = teclado.nextFloat();
        
        float m = (n1+n2)/2; //divisão da media
        System.out.print("Sua media foi " + m);
        
        if (m>8.5){
            System.out.print("Parabéns");
        }
    }
}
