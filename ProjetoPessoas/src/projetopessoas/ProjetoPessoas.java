package projetopessoas;
/**
 *
 * @author bryan
 */
public class ProjetoPessoas {
    public static void main(String[] args) {//estudos de herança
    //programa principal
    
    //criando os objetos
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
    //atribuindo coisas aos objetos
    //p1=pessoa
    p1.setNome("Pedro");
    p1.setIdade(23);
    p1.setSexo("M");
    //p2=aluno
    p2.setNome("Maria");
    p2.setIdade(19);
    p2.setSexo("F");
    p2.setCurso("informática");
    //p3=professor
    p3.setNome("Bryan");
    p3.setIdade(20);
    p3.setSexo("M");
    p3.setSalario(2500.75f);
    //p4=funcionario
    p4.setNome("Gaby");
    p4.setIdade(20);
    p4.setSexo("F");
    p4.setSetor("estoque");
    
    //mostrando os objetos
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());
    }
}
