/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoidade;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class CalculoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Coloca sua idade ai po:");
        int nasc = teclado.nextInt();
        
        int i = 2024 - nasc;
        
        if(i>=18){
            System.out.println("Tem mais que 18 ja é triste");
        } else{
            System.out.println("Tem menos que 18 é feliz");
        }
    }
    
}