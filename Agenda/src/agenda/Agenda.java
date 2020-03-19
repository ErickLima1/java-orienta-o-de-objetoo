package agenda;

public class Agenda {

    public static void main(String[] args) {
       AgendaPessoa p1 =  new AgendaPessoa();
       p1.armazenarpessoa("Erick", 20, 1.31f);
       p1.armazenarpessoa("Ivone", 50, 1.21f);
       p1.armazenarpessoa("Jorge", 44, 1.43f);
       p1.armazenarpessoa("Lucas", 20, 1.32f);
       p1.armazenarpessoa("Luiza", 21, 1.22f);
       p1.armazenarpessoa("Fatima", 24,1.22f);
       p1.armazenarpessoa("cleitom",77,1.21f);
       p1.armazenarpessoa("jessica",16,1.21f);
       p1.armazenarpessoa("afonso",90,1.33f);
       System.out.println(p1.temquantos());
       System.out.printf( p1.buscarpessoa("Luiza")+ " :Posição que ele Esta: ");
       System.out.println(p1.removepessoa("Jorge"));
       p1.imprimiragenda();
     
      
     
     
      
      

     
    }
}
    

