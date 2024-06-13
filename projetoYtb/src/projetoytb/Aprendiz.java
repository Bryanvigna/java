package projetoytb;
public class Aprendiz extends Pessoa {
    private String login;
    private int totAssistido;

    public Aprendiz(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //getter e setter
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return super.toString() + " login=" + login + ", totAssistido="
                + totAssistido + '}' + '\n';
    }
    
    
}
