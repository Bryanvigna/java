package projetopessoas;
public class Aluno extends Pessoa{//atributos
    private int mat;
    private String curso;
    //metodo
    public void cancelarMatricula(){
        System.out.println("Sua matricula será cancelada!");
    }
    //getter e setter
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
