/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;

import java.util.Scanner;

/**
 *
 * @author bryan
 */

public class Carro {//ATRIBUTOS
    private String nome;
    private String marca;
    private int ano;
/*
MÉTODO CONSTRUTOR    
*/
    public Carro(String nome, String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }
/*
METODO GETTERS E SETTERS    
*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
/*
OBJETO CARRO
*/
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Marca do carro: ");
        String marcaCarro = scanner.nextLine();
        
        System.out.print("Modelo do carro: ");
        String nomeCarro = scanner.nextLine();

        System.out.print("Ano do carro: ");
        int anoCarro = scanner.nextInt();

        Carro meuCarro = new Carro(marcaCarro,nomeCarro , anoCarro);
        
        System.out.print("Meu carro e um " + meuCarro.getMarca() + " da " + meuCarro.getNome());
        System.out.print(" de ano " + meuCarro.getAno());

        scanner.close();
    }
    
}
