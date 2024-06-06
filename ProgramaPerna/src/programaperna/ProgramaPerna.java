/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaperna;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ProgramaPerna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner tec = new Scanner(System.in);
            System.out.print("Quantas pernas tem?");
            int perna = tec.nextInt();

            String tipo;
            System.out.print("isso é um(a) ");
            switch (perna){
                case 1:
                    tipo = "sacy";
                    break;
                case 2:
                    tipo = "Bípede";
                    break;
                case 3:
                    tipo = "tripé";
                    break;
                case 4:
                    tipo = "quadrupede";
                    break;
                case 6:
                    tipo = "aranha";
                    break;
                default:
                    tipo = "ET";
                    break;
        }
    System.out.println(tipo);
    }
}
