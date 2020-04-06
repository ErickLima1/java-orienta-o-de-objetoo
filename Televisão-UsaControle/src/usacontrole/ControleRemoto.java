package usacontrole;

 //@author Erick
import java.util.Scanner;


public class ControleRemoto {
   private int canal = 1;
   private int volume = 50;
   boolean auxiliar = true;
   int op;
   Scanner sc = new Scanner(System.in);
 
   
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
    
   public void status(){
       while(auxiliar == true){
           op = sc.nextInt();
         switch(op){
             case 0:
                 this.auxiliar = false;
                 break;
             
             case 1:
                 
                 this.AumentarCanal();
                 break;
             
             case 2:
                 
                 this.DiminuirCanal();
                 break;
             
             case 3:
                 this.escolherCanal();
                 break;
                 
             case 4:
                 
                 this.AumentarVolume();
                 break;
                 
                 
             case 5:
                 
                 this.DiminuirVolume();
                 break;
                 
             case 6:
                 System.out.println("====================");
                 System.out.println("Volume: " + this.getVolume());
                 System.out.println("Canal: " + this.getCanal());
                 break;
                 
                 
             default:
                 System.err.println("Opção inválida");;
      
            }
       }
   }
   
   
   
    //Mudar Canal
    public void AumentarCanal(){
        if(this.canal <100){
        System.out.println("=======Canal aumentado======");
        this.setCanal(canal = canal + 1);
        System.out.println("Canal: "+this.canal);
        }else{
            System.out.println("Canal Maximo");
        }
    }
    
    public void DiminuirCanal(){
        if(this.canal>0){
         System.out.println("=====Canal diminuido=====");
         this.setCanal(canal = canal -1);
         System.out.println("Canal: "+this.canal);
        }else{
            System.out.println("Ultimo canal");
        }
    }
    
    public void escolherCanal(){
        if(this.canal >0 && this.canal<100){
        System.out.println("==============================");
        System.out.print("Digite qual canal deseja entrar: ");
        this.setCanal(sc.nextInt());
        System.out.println("Canal mudado");
        System.out.println("Canal: "+this.canal);
        }else{
             System.out.println("Canal inválido");
              }
    }
   public void AumentarVolume(){
       if(this.volume < 100){
        System.out.println("=========Volume aumentado=========");
        this.setVolume(volume =  volume +2);  
        System.out.println("Volume: "+ this.volume + "%");
       }else{
           System.out.println("Volume no máximo");
        }
    }
   
   public void DiminuirVolume(){
       
        if(this.volume > 0){
        System.out.println("=========Volume diminuido=========");
        this.setVolume(volume = volume -2);  
        System.out.println("Volume: "+ this.volume + "%");
       }else{
           System.out.println("MUDO");
        }
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
}