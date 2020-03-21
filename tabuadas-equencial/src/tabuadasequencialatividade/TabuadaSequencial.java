
package tabuadasequencialatividade;

 //@author Erick
import java.util.Scanner;


public class TabuadaSequencial {
   Scanner sc = new Scanner(System.in);
   private int tabuada;
   private int sequencial; 
   int resultado;
   int contador = 0;

   public void opcao() {
       System.out.println("Qual opção voce escolhe ?");
       System.out.println("1- Tabuada");
       System.out.println("2- Sequencial");
       System.out.println("3- Sair");
       System.out.print("Resposta: ");
      
   }
   public void tabuada() {
       while(true) {
       opcao();
       resultado = sc.nextInt();
       if(resultado == 3) {
           System.out.println("Programa finalizado");
           break;
       }
       
       System.out.println("Digite um numero ");
       this.tabuada = sc.nextInt(); 
       
      if(resultado == 1) {
          while(contador < 11) {
              System.out.println("------Tabuada------");
              System.out.println(this.tabuada + " X " + contador + " =" + (this.tabuada * contador));
              contador++;
          }
      }
      
      if(resultado == 2) {
          System.out.println("------Sequencial------");
      while(this.tabuada <= 10) {
          System.out.printf(this.tabuada + " , ");
          this.tabuada = this.tabuada + 1;
      }
      
   }
   }      
   }
   
    public int getTabuada() {
        return tabuada;
    }

    public void setTabuada(int tabuada) {
        this.tabuada = tabuada;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
   
   
}
