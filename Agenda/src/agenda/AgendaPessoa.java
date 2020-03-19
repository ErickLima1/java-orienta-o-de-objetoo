
package agenda;

import java.util.LinkedList;
import java.util.Scanner;

public class AgendaPessoa {
      private String[] nome  = new String[10];
      private int[] idade = new int [10] ;
      private float[] altura = new float[10];
      private int totalagenda = 0;
      
   public void imprimirpessoa(int posicao) {
       int i = posicao - 1;       
  System.out.println(posicao+" || "+ this.nome[i]+" || " + this.idade[i]+" || " + this.altura[i]+" || ");
   }
   public void imprimiragenda() {
       System.out.println("-------CriandoAgenda---------");
System.out.println("||Posiçao||" +"||Nome||" + "||Idade||" + "||Altura||"); 
       for(int i= 0; i<this.totalagenda;i++) {
           imprimirpessoa(i+1);
       }
      
   }
      

   public int buscarpessoa(String wnome) {
      int achou = 0;
      for(int i=0; i < 10;i ++) {
          if(this.nome[i] == wnome) {
              
              achou = i + 1;
              break;
          }
          
      }
      return achou;
   }
   public int armazenarpessoa(String wnome, int widade,float waltura) {
       if(this.totalagenda < 10) {
           this.nome[this.totalagenda] = wnome;
           this.idade[this.totalagenda] = widade;
           this.altura[this.totalagenda] = waltura;
           this.totalagenda++;
           return(this.totalagenda);
       }else{
           return 0;
       }
   }
   public int temquantos() {
       System.out.print("Quantidade de pessoa: ");
       return this.totalagenda;
   }
   public boolean removepessoa(String wnome) {
       int w;
       if(this.totalagenda < 1) {
    System.err.println("Agenda Esta vazia ");     
      return false;
       }
       w = buscarpessoa(wnome);
       w--;
       if(w != -1 ) {
        for(int i = w; i < this.totalagenda; i++) {
          this.nome[i] = this.nome[i+1];
          this.idade[i] = this.idade[i+1];
          this.altura[i] = this.idade[i+1];
       }
      this.nome[9] = "";
     this.idade[9] = 0;
     this.altura[9] = 0;
     this.totalagenda--;
     return true;
       }else {
           return false;
       }
   }
   
    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public float[] getAltura() {
        return altura;
    }

    public void setAltura(float[] altura) {
        this.altura = altura;
    }
      

  };

