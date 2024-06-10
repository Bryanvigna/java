/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author bryan
 */
public class Canguru extends Mamifero {
    public void usarBolsa(){
        System.out.println("usando a bolsa de gravida");
    }
    
    @Override
    public void locomover(){
        System.out.println("pulando");
    }
    
}
