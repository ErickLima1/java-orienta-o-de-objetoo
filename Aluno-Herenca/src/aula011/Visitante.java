
package aula011;


 //@author Erick
public class Visitante extends Pessoa {
    
    public void info() {
        System.out.println(this.getNome() + " é visitante");
        System.out.println("=============================================================");
    }
}
