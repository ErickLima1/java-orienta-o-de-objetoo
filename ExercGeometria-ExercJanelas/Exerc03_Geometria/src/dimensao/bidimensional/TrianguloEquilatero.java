
package dimensao.bidimensional;

public class TrianguloEquilatero {
    public double lado;
    public double altura;
    
    
    public double calculoequilátero() {
       double area = this.lado * this.altura/2.0; 
       return area;
    }
    public double calculoperímetro(){
        double p = this.lado + this.lado + this.lado;
        return p;
    }

    public TrianguloEquilatero() {
    }

    public TrianguloEquilatero(double lado, double altura, double base) {
        this.lado = lado;
        this.altura = altura;
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado > 0) {
        this.lado = lado;
        }else{
            System.err.print("Erro,Valor Invalido");
            System.exit(0);
        }
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0) {
        this.altura = altura;
        }else{
            System.err.print("Erro,Invalido");
           System.exit(0);
        }
    }

   
}
