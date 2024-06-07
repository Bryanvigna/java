package projetopessoas;
public class Professor extends Pessoa{//atributos
    private String especialidade;
    private float salario;
    //metodo
    public void receberSalario(float aum){
        this.salario += aum;
    }
    //getter e setter
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
