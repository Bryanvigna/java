/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo2;

/**
 *
 * @author bryan
 */
public class Lobo extends Mamifero {
    public void reagir(boolean verHumano){
        if(verHumano == true){
            System.out.println("Me joguem aos lobos e eu AI AI AI");
            this.emitirSom();
        }else{
            System.out.println("Se iniciou uma briga animal");
        }
    }
    @Override
    public void emitirSom(){
        System.out.println("AAUUUUUUUUUUUUUUUU");
    }
}
