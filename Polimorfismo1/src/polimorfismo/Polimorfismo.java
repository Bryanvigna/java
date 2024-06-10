package polimorfismo;

/**
 *
 * @author bryan
 */
public class Polimorfismo {

    public static void main(String[] args) {
        //Animal n = new Animal(); [NÃO PODE POIS MÉTODOS ABSTRATOS NÃO PODEM SER INSTANCIADOS]
        /*
        atributos para todos:peso[float], idade[int] e membos
        metodos para todos:locomover, alimentar e som
        */
        
        Mamifero m = new Mamifero();
        //atributos:corPelo
        
        Reptil r = new Reptil();
        //atributos:corEscama

        Peixe p = new Peixe();
        //atributos:corEscama
        //metodos:soutarBolha
        
        Ave a = new Ave();
        //atributos:corPena
        
        
        Canguru c = new Canguru();
        Dog d = new Dog();
        Cobra s = new Cobra();
        Turtle t = new Turtle();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();
        
        //canguru
        c.locomover();
        c.usarBolsa();
        
        //cahorro
        d.som();
        d.locomover();
        
        //peixe
        gf.locomover();
        gf.som();
        
        //tartaruga
        t.locomover();
        t.som();
        
        //arara
        ar.som();
        a.locomover();
        
        
        
        
        
        /*mamifero
        m.setPeso(40.7f);
        m.setIdade(30);
        m.setCorPelo("azul");
        m.alimentar();
        m.locomover();
        m.som();
        System.out.println("_____________________________________");
        
        //reptil
        r.alimentar();
        r.locomover();
        r.som();
        System.out.println("_____________________________________");
        
        //peixe
        p.alimentar();
        p.locomover();
        p.som();
        System.out.println("_____________________________________");
        
        //ave
        a.alimentar();
        a.locomover();
        a.som();*/
    }
    
}
