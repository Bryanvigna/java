package herança.pt2;

/**
 *
 * @author bryan
 */
public final class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
            System.out.println("prática concluida fi");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
