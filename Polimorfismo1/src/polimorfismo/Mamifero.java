package polimorfismo;

/**
 *
 * @author bryan
 */
public class Mamifero extends Animal {

    private String corPelo;
    
    //sobreposição
    @Override
    public void locomover() {
        System.out.println("Corre, negada!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void som() {
        System.out.println("Som brabo");
    }
    //getter e setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
