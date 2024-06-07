package projetopessoas;
public class Funcionario extends Pessoa {//atributos
    private String setor;
    private boolean trabalhando;
    //metodo
    public void mudarTrab(){
        this.trabalhando = ! this.trabalhando;
    }
    //getter e setter

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
