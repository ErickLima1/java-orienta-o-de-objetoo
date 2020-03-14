
package computadores;

public class Computador {
    public  String processador;
    public  String placadevideo;
    public  String placamae;
    public  String memoria;
    public  String harddrive;
    public  String fonte;
    public  String gabinete;
    public  float Valor;
    
    public Computador(String p,String v,String memoria,String m, String hd, String f, String g, float valor) {
        this.processador = p;
        this.placadevideo = v;
        this.placamae = m;
        this.memoria = memoria;
        this.harddrive = hd;
        this.fonte = f;
        this.gabinete = g;
        this.Valor = valor;
    }    
       public void getprocessador(String p) {
           this.processador = p;
       }
       public String setprocessador () {
           return this.processador;
       }
       public void getplacadevideo(String v) {
           this.placadevideo = v;
       }
       public String setplacadevideo() {
           return this.placadevideo;
       }
       public void getplacamae(String m) {
           this.placamae = m;
       }
       public String setplacamae(){
           return this.placamae;
       }
       public void getmemoria(String memoria) {
           this.memoria = memoria;
       }
       public String setmemoria() {
           return this.memoria;
       }
       public void getharddrive(String hd) {
           this.harddrive = hd;
       }
       public String setharddrive() {
           return this.harddrive;
       }
       public void getfonte(String f) {
           this.fonte = f;
       }
       public String setfonte(){
           return this.fonte;
       }
       public void getgabinete(String g) {
           this.gabinete = g;
       }
       public String setgabinete() {
           return this.gabinete;
       }
       public void getvalor(float valor) {
           this.Valor = valor;
       }
       public float setvalor() {
           return this.Valor;
       }
       public void status() {
           System.out.println("Informação Sobre o Computador!");
           System.out.println("Processador: " + this.processador);
           System.out.println("Placa de video " + this.placadevideo);
           System.out.println("Placa mãe " + this.placamae);
           System.out.println("Memoria " + this.memoria);
           System.out.println("Hard Drive " + this.harddrive);
           System.out.println("Fonte " + this.fonte);
           System.out.println("Gabinete " + this.gabinete);
           System.out.println("Valor do Computador:R$" + this.Valor);
       }
}
