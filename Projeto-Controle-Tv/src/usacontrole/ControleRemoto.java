package usacontrole;

 //@author Erick
import java.util.Scanner;


public class ControleRemoto extends TV implements InterfaceControle{
   int op;
   Scanner sc = new Scanner(System.in);
   int CanalDoCliente;
    
   public void status() {
       while(true) {
           menu();
           op = sc.nextInt();
            if(op==0) 
            break; 
       switch(op) {
         case 1:
             this.ligar();
            break;
         case 2:
             this.desligar();
            break;
         case 3:
            this.canal();
            break;
            
         case 4:
             this.trocaCanal();
            break;
            
         case 5:
             System.out.println("Qual Canal Voce Deseja ?");
               this.CanalDoCliente = sc.nextInt();
               canalEspecifico(CanalDoCliente);
            break;
            
         case 6:
            this.AumentandoVolume();
            break;
            
         case 7 :
            this.baixandoVolume();
            break;
            
         case 8 :
              System.out.println("==========================");
              System.out.println("Tv " + this.Ativado);
             System.out.println("volume " + this.volumeAtual);
             System.out.println("Canal " + this.canalAtual);
         default:
             
             break;
       }
       }
   }
   public void menu() {
       System.out.println("===MENU===");
       System.out.println("1- Ligar Tv");
       System.out.println("2- Desligar Tv");
       System.out.println("3- + Canal");
       System.out.println("4- - Canal");
       System.out.println("5- Buscando Canal");
       System.out.println("6- + Volume");
       System.out.println("7- - Menos Volume");
       System.out.println("8- Mostra Dados");
       System.out.println("0- Sair");
       System.out.print("Resposta: ");
   }

    @Override
    public void ligar() {
    if(this.getAtivado() == false) {
        this.setAtivado(true);
      }else {
        System.out.println("Televisão Esta ligada");
     }
    }

    @Override
    public void desligar() {
        if(this.getAtivado() == true) {
           this.setAtivado(false);
        }else {
            System.out.println("Tv Desligada");
        }
    }

    @Override
    public void AumentandoVolume() {
        if(this.Ativado == true ) {
            if(this.getVolumeAtual() < this.getVolumeMaximo()) {
                this.volumeAtual++;
            }else {
                System.out.println("Volume Maximo");
            }
        }else{
            System.out.println("Tv Desligada");
        }
        
          
    }
    @Override
    public void baixandoVolume() {
        if(this.Ativado == true) {
            if(this.getVolumeAtual() == 0) {
                System.out.println("Tv no mudo");
            }else {
                this.volumeAtual--;
            }
            }else {
                System.out.println("Tv Desligada");
        }
        
    }
    
    @Override
    public void canal() {
        if(this.Ativado == true) {
            if(this.canalAtual < this.qtdcanal) {
                this.canalAtual++;
            }else {
                System.out.println(this.canalAtual);
            }
        }else{
            System.out.println("Tv Desligada");
        }
    }
   
    @Override
    public void trocaCanal() {
           if(this.Ativado == true) {
               if(this.canalAtual == 0) {
                   System.out.println("canal do Especifico");
                   
               }else {
                   this.canalAtual--;
               }
           }else{
               System.out.println("Tv Delsigada");
           }
    }
    
    @Override
    public void canalEspecifico(int canalEspecifico) {
        if(this.Ativado == true) {
            if(canalEspecifico > this.qtdcanal || canalEspecifico < 0) {
                
            }else {
                this.canalAtual = canalEspecifico;
            }
        }else{
            System.out.println("Tv Desligada");
        }
    }
}