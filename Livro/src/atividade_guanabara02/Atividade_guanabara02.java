
package atividade_guanabara02;


public class Atividade_guanabara02 {
  public static void main(String[] args) {
      Pessoa[] P1 = new Pessoa[2];
      Livro[] L1 = new Livro[3];
      P1[0] = new Pessoa("Erick ", 20, "Homen");
      P1[1] = new Pessoa("Rosa ", 30, "Mulher");
      L1[0] = new Livro("Apredendo java Basico","Cleitom arasta",300,P1[0]);
      L1[1] = new Livro("Ta Foda ","Jose carlos da silva ", 450,P1[1]);
      L1[2] = new Livro("Java Avançado ", "Maria flinstom ", 300, P1[0]);
      
       L1[0].abrir();
       L1[0].folhear(50);
       L1[0].avancarpag();
       System.out.println(L1[0].detalhes());
       System.out.println("==================================");
       L1[1].folhear(120);
       System.out.println(L1[1].detalhes());
  }
    
}
