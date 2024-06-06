/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipoprimitivos;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class TipoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome do aluno:");
        
        String nome= teclado.nextLine();
        
        System.out.println("Digite sua nota:");
        
        float nota = teclado.nextFloat();
        
        System.out.format("a nota de %s ficou em %.1f",nome, nota );
    }
    
}
