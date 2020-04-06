package usacontrole;

 //@author Erick
import java.util.Scanner;


public class ControleRemoto {
   private int canal;
   private int volume = 0;
   int op;
   Scanner sc = new Scanner(System.in);
   ControleRemoto cont[] = new ControleRemoto[1];
   
    
   public void status() {
       while(true) {
           menu();
           op = sc.nextInt();
            if(op==0) 
            break; 
       switch(op) {
         case 1:
            this.canal++;
            break;
         case 2:
             this.canal--;
            break;
         case 3:
            System.out.println("Insira um Canal");
              mudarCanal(sc.nextInt());
            break;
         case 4:
             this.volume++;
                     
            break;
         case 5:
             this.volume--;
            break;
         case 6:
             System.out.println("==========================");
             System.out.println("volume " + this.getVolume());
             System.out.println("Canal " + this.getCanal());
            break;
         default:
             System.err.println("Valor Incorreto");
            break;
       }
       
       System.out.println("Programa Finalizado");
       }
   }
   public void menu() {
       System.out.println("===MENU===");
       System.out.println("1- + Canal");
       System.out.println("2- - Canal");
       System.out.println("3- Buscando Canal");
       System.out.println("4- + Volume");
       System.out.println("5- - Menos Volume");
       System.out.println("6- Mostra Dados");
       System.out.println("0- Sair");
       System.out.print("Resposta: ");
   }
   
   
   
   //Get Canal
    public int getCanal() {
        return canal;
    }
    //Set Canal
    public void setCanal(int nCanal) {
      if(nCanal >=1 || nCanal <= 100) {
          this.canal = nCanal;
        }
    }
    //Get Volume
    public int getVolume() {
        return volume;
    }
    //Set Volume
    public void setVolume(int Volume) {
        this.volume = volume;
    }
    //Mudar Canal
    public void mudarCanal(int tipo) {
    //Aumentar Canal +
    if(tipo == 1) {
     if(this.canal < 100) {
         this.canal++;
     }
     else {
       this.canal = 1;
         
     }
     
    }
    //Diminuir o Canal
    else {
        if(this.canal > 1) {
            this.canal--;
        }
        else{
            this.canal = 100;
        }
    } 
   }
   public void mudarVolume(int tipo) {
       //Aumentar o Volume
       if(tipo == 1) {
           if(this.volume < 100) {
               this.volume++;
       }
   }
       else{
           //Diminuir o Volume
           if(this.volume > 0) {
               this.volume--;
           }
       }
 }
   
   
}