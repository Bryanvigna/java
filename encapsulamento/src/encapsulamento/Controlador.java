package encapsulamento;

public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void onMudo();
    public abstract void offMudo();
    public abstract void play();
    public abstract void pause();
}
