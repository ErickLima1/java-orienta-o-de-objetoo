package testeevelado;

import java.util.List;
import java.util.Scanner;



public class Elevador {
    private static class STACK{
    
     public STACK prox;
    }
   Scanner sc = new Scanner(System.in);
   private int terreo = 0;
   private int capacidade;
   private int capacidadeAtual;
   private int andares;
   private int andarAtual;
   private int numeroPessoa;
   private int numerostotal;
   private int naux ;
   private int op;
   //
   
   public void menuelevador() {
       System.out.println("\n\n > Menu "); 
       System.out.println("1-  nuemro de pessoa");
       System.out.println("2-  Sobe de andar");
       System.out.println("3-  Desce de andar");
       System.out.println("4- Entra pessoa");
       System.out.println("5- Sair pessoa");
       System.out.println("6- mostra dados");
       System.out.println("0- Sair");
       System.out.printf("\n > Resposta: "); 
       
   }
   public void elevado() {
       
        System.out.printf("Capacidade total? R: "); 
        capacidade = sc.nextInt();
        System.out.printf("Quanto Andares?  R: ");
       numerostotal = sc.nextInt();
       System.out.println("");
      
       
       while(true) {
           menuelevador();
           op = sc.nextInt();
           if(op == 0) {
               break;
           }
       switch(op) {
           case 1:
               System.out.println("Numero de pessoa atualmente");
               naux = sc.nextInt();
               if(naux < this.getCapacidade()) {
                   this.setNumeroPessoa(naux);
               break;

               }
           case 2:
               if(this.getAndarAtual() < this.getNumerostotal()) {
                this.sobe();
               break;
             }
           case 3:
               if(this.getAndarAtual() > 0) {
                   this.desce();
               }
           case 4:
               if(this.getNumeroPessoa() < this.getCapacidade()) {
                   this.entrapessoa();
               }
           case 5:
               if(this.getNumeroPessoa() > this.getNumeroPessoa()) {
                  this.saipessoa();
                  break;
               }
           case 6:
               System.out.println("---------Status----------");
               System.out.println("Quantidade de pessoa: " + this.getNumeroPessoa());
               System.out.println("Capacidade suportada " + this.getCapacidade());
               System.out.println("Andar Atual: " + this.getAndarAtual());
               System.out.println("Quantidade de anderes: " + this.getAndarAtual());              
             try { Thread.sleep (2000); }
             catch (InterruptedException ex) {}
             break;
            default:
              System.err.println("Valor Incorreto");
       }
       }
       System.out.println("Programa Finalizado");
   }
   
   public void entrapessoa(){
    this.numeroPessoa++;
       
}
   public void saipessoa() {
       this.numeroPessoa--;
   }
   public void sobe(){
       this.andarAtual++;
   }
   public void desce() {
       this.andarAtual--;
       
   } 
   
    //Get e Sett
    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(int numeroPessoa) {
        this.numeroPessoa = numeroPessoa;
    }

    public int getNumerostotal() {
        return numerostotal;
    }

    public void setNumerostotal(int numerostotal) {
        this.numerostotal = numerostotal;
    }
   
   
  
}

