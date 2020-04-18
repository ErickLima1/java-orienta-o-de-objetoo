
package atividade;
public class Banco implements InterfaceBanco{
public int numconta;
private String tipo;
private String dono;
private float saldo;
private boolean status;


public void statusatual() {
    System.out.println("----------------Status atual------------");
    System.out.println("Conta " + this.getnumconta());
    System.out.println("Dono " + this.getdono());
    System.out.println("O tipo da conta " + this.gettipo());
    System.out.println("O seu saldo atual " + this.getsaldo());
    System.out.println("Status da conta " + this.getstatus());
}

@Override
public void  abrirconta(String t) {
 this.settipo(t);
 this.setstatus(true);
 if(t == "cc") {
     this.saldo = 50;
 }else if (t == "cp") { 
     this.saldo = 150;
 }
    System.out.println("Conta aberta com Sucesso");
}
@Override
public void fechaconta() {
  if(this.saldo > 0) {
      System.out.println("A Sua conta Esta com dinheiro !");
  }else if (saldo < 0) {
      System.out.println("Sua conta Esta em Debito !");
  }else   
      this.setstatus(false);
    System.out.println("Voce cancelou a sua conta");
}
@Override
public void deposita(float v){
    if(status == true) {
       this.setsaldo(this.getsaldo() + v);
        System.out.println("Deposito realizado com sucesso " + this.getdono());
    }else {
        System.err.println("Impossivel deposita ");
    }     
}
@Override
public void sacar(float v) {
   if(this.getstatus()) {       
   if(this.saldo >= v) {
       this.saldo = this.saldo - v;
       System.out.println(" Realizando o saque na conta de " + this.dono);
   }else {
       System.out.println(" Voce Esta com saldo Insuficiente");
   }
}else {
       System.err.println("Impossivel sacar"); 
   }
}       
@Override
public void pagarmensal() {
    int v = 0;
    if(this.gettipo() == "cc") {
        v=12;
    }else if(this.gettipo() == "cp") {
     v = 20;   
    }
    if(this.status == true) {
      if(this.saldo > v) {
          this.saldo = this.saldo - v;
          System.out.println(this.getdono()+"Mensalidade paga ");
      }else {
          System.out.println("Impossivel pagar com a conta fechada");
      }  
    }
}
public Banco() {
 this.saldo = 0;
 this.status = false;
}
public void setnumconta(int n){
    this.numconta = n;
}
public int getnumconta() {
    return this.numconta;
}
public void settipo(String t) {
   this.tipo = t;
}
public String gettipo() {
    return this.tipo;
}
public void setdono(String d) {
    this.dono = d;
}
public String getdono() {
    return this.dono;
}
public void setsaldo(float s) {
    this.saldo = s;
}
public float getsaldo() {
    return this.saldo;
}
public void setstatus(boolean s) {
    this.status = s;
}
public boolean getstatus() {
    return this.status;
}

    

}