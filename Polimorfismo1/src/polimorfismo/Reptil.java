/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author bryan
 */
public class Reptil extends Animal {
    private String corEscama;
    //sobreposição
    @Override
    public void locomover() {
        System.out.println("Rastejando por ai");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta, pertuba não!");
    }

    @Override
    public void som() {
        System.out.println("Som estranho de réptil");
    }
    //getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
