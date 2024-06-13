package projetoytb;

public class Visualizacao {

    private Video filme;
    private Aprendiz espectador;

    public Visualizacao(Video filme, Aprendiz espectador) {
        this.filme = filme;
        this.espectador = espectador;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {//se não dar uma avaliação
        this.filme.setAvaliacao(5-1);
    }

    public void avaliar(int nota) {//nota pósta
        this.filme.setAvaliacao(nota-1);
    }

    public void avaliar(float porc) {//avaliação em porcentagem assistida
        int tot;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot - 1);
    }

    //getter e setter
    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Aprendiz getEspectador() {
        return espectador;
    }

    public void setEspectador(Aprendiz espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "filme=" + filme + ", espectador=" + espectador + '}';
    }

}
