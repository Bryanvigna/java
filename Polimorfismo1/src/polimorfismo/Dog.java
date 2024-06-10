/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author bryan
 */
public class Dog extends Mamifero{
    @Override
    public void som(){
        System.out.println("Me joguem aos lobos e eu AU AU AU AU");
    }
    @Override
    public void locomover(){
        System.out.println("Andando namoral");
    }
}
