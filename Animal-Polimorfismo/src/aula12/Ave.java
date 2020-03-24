
package aula12;

 //@author Erick
public class Ave extends Animal {
   private String corPena;

    

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho() {
        System.out.println("Construindo um Ninho");
    }
   public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
