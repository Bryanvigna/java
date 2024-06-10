/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author bryan
 */
public class Ave extends Animal {
    private String corPena;
    //método
    public void fazerNinho(){
        System.out.println("Ninho feito fi, pai é pedreiro");
    }
    //sobreposição
    @Override
    public void locomover() {
        System.out.println("Voar, voar, subir, subir");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algo");
    }

    @Override
    public void som() {
        System.out.println("Piu");
    }
    //getter e setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
