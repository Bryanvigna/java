package encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.abrirMenu();
        c.pause();
        c.maisVolume();
        c.menosVolume();
        c.fecharMenu();
    }
    
}
