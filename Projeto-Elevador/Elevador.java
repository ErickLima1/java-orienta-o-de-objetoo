package testeevelado;

import java.util.List;
import java.util.Scanner;



public class Elevador extends ConfgElevador implements InterfaceElevador{

   

  
    private static class STACK{
    
     public STACK prox;
    }
   Scanner sc = new Scanner(System.in);
    private int numeroPessoa;
   private int capacidade;
   private int capacidadeAtual;
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
       System.out.println("7- Ligar o Elevador");
       System.out.println("8- Desligar o Elevador");
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
                   this.QtdPessoaEspecifica(naux);
               break;
               }
           case 2:
                this.Subir();
               break;
               
           case 3:
                   this.Descer();
                   break;
           case 4:
                   this.EntraPessoa();
                   break;
           case 5:
                   this.SairPessoa();
                  break;
           case 6:
               System.out.println("---------Status----------");
               System.out.println("Eelvador Esta fumcionando ?: " + this.getAtivado());
               System.out.println("Quantidade de pessoa: " + this.entraSair);
               System.out.println("Capacidade suportada " + this.capacidade);
               System.out.println("Andar Atual: " + this.andarAtual);
               System.out.println("Quantidade de anderes: " + this.getNumerostotal());              
             try { Thread.sleep (2000); }
             catch (InterruptedException ex) {}
             break;
           case 7:
               this.Ligar();
               System.out.println("Elevador Ligado");
               break;
           case 8:
               System.out.println("Elevaodr Desligado");
               this.Desligar();
               break;
            default:
              System.err.println("Valor Incorreto");
       }
       }
       System.out.println("Programa Finalizado");
   }
    @Override
    public void Ligar() {
        if(this.Ativado == false) {
            this.setAtivado(true);
        }else{
            System.out.println("Elevador Funcionando");
        }
    }

    @Override
    public void Desligar() {
        if(this.Ativado == true) {
             this.setAtivado(false);
        }else{
            System.out.println("Elevador Desligado");
        }
    }
    
     @Override
    public void EntraPessoa() {
        if(this.Ativado == true) {
            if(this.getEntraSair()< this.getCapacidade()) {
                this.entraSair++;
            }else {
                System.out.println("Não tem como Sair ainda");
            }
        }else{
            System.out.println("Elevador Desligado");
            
        }
    }

    @Override
    public void SairPessoa() {
        if(this.Ativado == true) {
            if(this.getEntraSair() == 0){
                System.out.println("Especifico");
            }else{
                this.entraSair--;
            }
        }else{
            System.out.println("Elevador Desligado");
        }
    }

    @Override
    public void Subir() {
        if(this.Ativado == true) {
            if(this.getAndarAtual() > 0) {
                this.andarAtual++;
            }else{
                System.out.println("Andar Maximo Do elevador");
            }
        }else{
            System.out.println("Eelvador Desligado");
        }
    }

    @Override
    public void Descer() {
        if(this.Ativado == true) {
            if(this.getAndarAtual() == 0) {
                System.out.println("Especifico");
            }else{
                this.andarAtual--;
            }
        }else{
            System.out.println("Elevador Desligado");
            
        }
        
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(this.Ativado == true) {
                this.capacidade = capacidade;
       }else {
            System.out.println("Elevador Desligado");
        }
    }

    public int getNaux() {
        return naux;
    }

    public void setNaux(int naux) {
        this.naux = naux;
    }

    public int getNumerostotal() {
        return numerostotal;
    }

    public void setNumerostotal(int numerostotal) {
        this.numerostotal = numerostotal;
    }
    public void QtdPessoaEspecifica(int qtdpessoa) {
        if(this.Ativado == true) {
           if(this.entraSair < this.naux) {
               this.entraSair = this.naux;
           }
        }else{
            System.out.println("Elevador Quebrado");
        }
    }        
    
   
}

