package relaçãoentreclasses;

public class Lutadores {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
  
    
    //metodos publicos 
    public void apresentar(){
        System.out.println("agora é a hora, apresentando o lutador " + this.getNome());
        System.out.println("diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + "anos e " + this.getAltura() + "metros");
        System.out.println("pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrota e");
        System.out.println(this.getEmpate() + " empates");
        System.out.println("______________________________");
    }
    public void stats(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("ganhou " + this.getVitoria() + " vezes");
        System.out.println("perdeu " + this.getDerrota() + " vezes");
        System.out.println("com " + this.getEmpate() + " empates");
        
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    
      
    //metodos especiais

    public Lutadores(String no, String na, int id, float pe, float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() { 
        if (this.peso <= 52.2){
            this.categoria = "inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "leve";
        } else if (this.peso <= 83.9){
            this.categoria = "medio";
        } else if (this.peso <= 120.2){
            this.categoria = "pesado";
        } else {
            this.categoria = "inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
}
