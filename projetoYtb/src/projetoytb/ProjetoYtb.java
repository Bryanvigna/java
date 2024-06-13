package projetoytb;
public class ProjetoYtb {

    public static void main(String[] args) {
        Video v [] = new Video [6];
        
        v[0] = new Video("teste 1");
        v[1] = new Video("teste 2");
        v[2] = new Video("teste 3"); 
        v[3] = new Video("teste 4"); 
        v[4] = new Video("teste 5"); 
        v[5] = new Video("teste 6"); 

        
        Aprendiz a[] = new Aprendiz[6];
        //para criação deve informar nome, idade, sexo e login
        a[0] = new Aprendiz("abreu", 90, "M", "abreuvei");
        a[1] = new Aprendiz("josival", 100, "M", "josivral");
        a[2] = new Aprendiz("jislayeinie", 47, "F", "jislayntrada");
        a[3] = new Aprendiz("katryelene", 27, "F", "kratrynene");
        a[4] = new Aprendiz("fernando", 24, "M", "fernentrando");
        a[5] = new Aprendiz("dorival", 45, "M", "doventrando");
       
        Visualizacao vis[] = new Visualizacao [50];
        
        vis[0] = new Visualizacao(v[0], a[0]);
        vis[0].avaliar(10.0f);
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(v[1], a[0]);
        System.out.println(vis[1].toString());
        
        
        
        /*
        //esta organizado na função video-aprendiz
        System.out.println(v[0].toString());
        System.out.println(a[0].toString());
        
        System.out.println(v[1].toString());
        System.out.println(a[1].toString());
        
        System.out.println(v[2].toString());
        System.out.println(a[2].toString());
        
        System.out.println(v[3].toString());
        System.out.println(a[3].toString());
        
        System.out.println(v[4].toString());
        System.out.println(a[4].toString());
        
        System.out.println(v[5].toString());
        System.out.println(a[5].toString());
        */
    }
    
}
