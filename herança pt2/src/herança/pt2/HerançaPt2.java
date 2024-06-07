package herança.pt2;
public class HerançaPt2 {
    //principal
public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("jose");
        v1.setIdade(29);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setIdade(18);
        a1.setNome("Bryan");
        a1.setSexo("M");
        a1.setCurso("informatica");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Barayan");
        b1.setMatricula(40028922);
        b1.setBolsa(50f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
