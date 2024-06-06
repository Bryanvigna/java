package relaçãoentreclasses;
public class RelaçãoEntreClasses {

    public static void main(String[] args) {
        Lutadores l[] = new Lutadores[6];
        
        l[0] = new Lutadores(
        "bryan", "brasil", 20, 60f, 1.73f, 20, 8, 4
        );
        l[1] = new Lutadores("endrew", "india", 30, 59f, 1.98f, 5,6,0);
        l[2] = new Lutadores("katryel", "alemanha", 20, 80f, 2.00f, 8, 2, 1);
        l[3] = new Lutadores("udyr", "russia", 40, 90f, 1.90f, 10, 0 , 0);
        l[4] = new Lutadores("jax", "espanha", 24, 70f, 1.80f, 9, 8, 20);
        l[5] = new Lutadores("olaf", "japão", 30, 85f, 1.60f, 5, 16, 45);
        
        /*
        l[0].stats();
        l.apresentar();
        l.ganharLuta();
        l[0].perderLuta();
        l[1].setPeso(50f);
        for (Lutadores lutadores:l){
            lutadores.apresentar();
            lutadores.stats();
        }*/
        
        Luta ULC01 = new Luta();//ULC = Ultra Lol Combate
        //ULC01.marcarLuta(l[0], l[1]);
        ULC01.marcarLuta(l[1], l[5]);
        ULC01.Lutar();
        
        }
    }
