
package parcelasatividade;

import java.util.Scanner;
//@author Erick

public class Parcelas {
    Scanner sc = new Scanner(System.in);
    private String nomeproduto;
    private double precodoproduto;
    private double precovista;
    private double precoparcelas;
    double avista;
    double resultado;
    int op;

    public void status() {
        System.out.println("Voce deseja compra o produto de qual forma ?");
        System.out.println("1-  A vista");
        System.out.println("2- Parcelado");
        System.out.printf("Resposta: ");
    }
    public void ParceladoOUAvista() {
        status();
        op = sc.nextInt();
  
        System.out.println("Nome do produto: ");
        this.nomeproduto = sc.next();
        System.out.println("Preço do seu Produto ");
        this.precodoproduto = sc.nextInt();
        
        switch(op) {
            case 1:
                System.out.println("Pagando  A Vissta");
                this.precovista = sc.nextInt();
                avista = this.precovista;
             break;
             
            case 2:
               System.out.println("Voce deseja Parcela de quantas vezes ?");
               this.precoparcelas = sc.nextInt();
             resultado = this.precodoproduto / this.precoparcelas;
             break;
             
            default:
                System.err.println("Valor Incorreto");
        System.out.println("Programa finalizado");
        } 
  //  }while(op == 2);
        }
    public void StatusDaCompra() {
        System.out.println("O Nome do do produto: " + this.nomeproduto);
        System.out.println("O Preço do Produto " + this.precodoproduto);
        System.out.println("Preço A vista " + this.avista + "R$");
        System.out.println("Valor da parcela " + this.resultado+"R$");
        System.out.println("Quantidade da parcela " + this.precoparcelas);
    }
  
    public void qtdparcela() {
        this.precoparcelas++;
    }
    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public double getPrecovista() {
        return precovista;
    }

    public void setPrecovista(double precovista) {
        this.precovista = precovista;
    }

    public double getPrecoparcelas() {
        return precoparcelas;
    }

    public void setPrecoparcelas(double precoparcelas) {
        this.precoparcelas = precoparcelas;
    }

    public double getPrecodoproduto() {
        return precodoproduto;
    }

    public void setPrecodoproduto(double precodoproduto) {
        this.precodoproduto = precodoproduto;
    }
    
    

}
