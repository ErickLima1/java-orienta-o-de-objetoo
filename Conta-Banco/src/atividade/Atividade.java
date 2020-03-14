
package atividade;

public class Atividade {
  public static void main(String[] args) {
  Banco c1 = new Banco();
  c1.setnumconta(12355);
  c1.setdono("Erick Lima");
  c1.abrirconta("cc");
  c1.deposita(300);
  //c1.sacar(250);
  //c1.fechaconta();
  c1.statusatual();
  
  Banco c2 = new Banco();
  c2.setnumconta(113466785);
  c2.setdono("Luiza");
  c2.abrirconta("cp");
 // c2.deposita(200);
  //c2.sacar(100);
 // c2.fechaconta();
 c2.statusatual();
  
  }
    
}
