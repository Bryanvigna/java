package encapsulamento;

public class ControleRemoto implements Controlador {
    //atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
   //metodos especiais(contrutor, getters e setters)
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private boolean getLigado(){//obs:valores boolean é pra usar 'is'
        return ligado;
    }
    private void setLigado(boolean ligado){//obs:valores boolean é pra usar 'is'
        this.ligado = ligado;
    }
    private boolean getTocando(){//obs:valores boolean é pra usar 'is'
        return tocando;
    }
    private void setTocando(boolean tocando){//obs:valores boolean é pra usar 'is'
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("----MENU----");
            System.out.println("Foi ligado? " + this.getLigado());
            System.out.println("Esta tocando algo no momento? " + this.getTocando());
            System.out.println("Volume: |" + this.getVolume() + "|");
            System.out.println("_______________");

                for(int i = 0; i <= this.getVolume(); i+=10){
                    System.out.print("|");
            }
        }else {
            System.out.println("Esta desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("Fechando menu...");
    }   }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void onMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void offMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Foi dado o play!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(true);
            System.out.println("Foi dado o pause!");
        }else{
            System.out.println("Não esta tocando nada");
        }
    }
}
