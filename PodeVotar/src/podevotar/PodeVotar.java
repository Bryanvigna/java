/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package podevotar;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class PodeVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Data de nascimento:");
        
        int nasc = t.nextInt();
        
        int i = 2024 - nasc;
        
        if(i<16){
            System.out.println("você não vota, mete o pé fi!");
        } else {
            if(i>=16 && i<18 || i>70){
                System.out.println("se quiser vota ai fi, to nem ai");
            
            }else{
                System.out.println("vai fugir da receita federal é? vem votar logo krl");
            }
        }
    }
}
