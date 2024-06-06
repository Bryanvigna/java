/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/*
 *
 * @author bryan
 */
public class ProjetoLivro {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p [] = new Pessoa [2];
        Livro l [] = new Livro [3];
        
        //nome, idade e sexo
        p[0] = new Pessoa("bryan", 20, "M");
        p[1] = new Pessoa("Endrew", 15, "M");
        
        //nome, autor, total de paginas e leitor
        l[0] = new Livro("curso de java", "jubelu", 200, p[0]);
        l[1] = new Livro("poo", "perzival", 3213, p[1]);
        l[0].abrir();
        
        
        
    }
    
}
