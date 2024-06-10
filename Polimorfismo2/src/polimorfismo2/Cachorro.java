/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo2;

/**
 *
 * @author bryan
 */
public class Cachorro extends Lobo {
    public void reagir(String frase){
        if(frase.equals("comida" )|| frase.equals ("oi")){
            System.out.println("Abana e late");
        }else{
            System.out.println("Rosnas");
        }
    }
    //late e kita
    public void lateKita(){
        System.out.println("AU AU AU AU");
        System.out.println("kitou");
    }
    //metodo sobrecarga
    public void reagir(int hora){
        if(hora<12){
            System.out.println("Abanar");
        }else if(hora>=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
            this.emitirSom();
        }else{
            this.lateKita();
        }
    }
    public void reagir(int idade, float peso){
        if (idade<5) {
            
            if (idade<10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
        //sobrescrever
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU AU");
    }
    
}
