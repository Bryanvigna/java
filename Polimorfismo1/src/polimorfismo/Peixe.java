/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author bryan
 */
public class Peixe extends Animal{
    private String corEscama;
    
     //método
    public void soutarBolha(){
        System.out.println("Olha a bolha ai");
    }
    //sobreposição
    @Override
    public void locomover() {
        System.out.println("Continue e nadar, nadar, nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo plastico");
    }

    @Override
    public void som() {
        System.out.println("blug, blug, blug");
    }
    //getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
