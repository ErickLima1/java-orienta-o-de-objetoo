
package exercicio_alan;

public class GuardaSol {
  String nome;
  String cor;
  int idade;
  boolean fechado = true;
  ////////////////////////////////////////
  public void status() {
      System.out.println("Nome: " + this.nome);
      System.out.println("Cor: " + this.cor);
      System.out.println("Idade: " + this.idade);
  }
  void brincar() {
      System.out.println("Vou Brincar");
  }
  void correr(double metros) {
      System.out.println("Correndo por " + metros + " Metros ");
  }
  void nadando(double metros) {
      System.out.println("Nadando por " + metros + "Metros");
  }
  void abrir() {
      if(fechado) {
          System.out.println("Guarda Sol Aberto !");
}
  }
  void fechar() {
      if(fechado) {
          System.out.println("Guarda Sol Fechado !");
      }
  }
  
  
}