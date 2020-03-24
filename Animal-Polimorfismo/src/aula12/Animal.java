package aula12;

/**
 *
 * @author Erick
 */
public abstract class Animal {
    //Atributos Animal
    protected String nome;
    protected float peso;
    protected int idade;
    protected int membros;
    //Metodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public void status() {
        System.out.println("Nome do Animal " + this.nome);
        System.out.println("Idade do Animal " + this.idade);
        System.out.println("Menbros " + this.membros);
        System.out.println("Peso do Animal " + this.peso);
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
        
}
