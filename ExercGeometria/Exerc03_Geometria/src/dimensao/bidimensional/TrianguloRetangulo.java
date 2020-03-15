
package dimensao.bidimensional;

public class TrianguloRetangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double alturaHipotenusa;
    
    public double calcArea(){
        double area = this.hipotenusa * alturaHipotenusa / 2.0;
        return area;
    }
    
    public double calcPerimetro(){
        double perimetro = cateto1 + cateto2 + hipotenusa;
        return perimetro;
    }
    
   
    //get e set
    
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        if(cateto1 > 0) {
            this.cateto1 = cateto1;
        } else {
            System.err.println("Erro! Valor inválido de cateto!");
            System.exit(0); //encerrando a execução do programa
        }
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        if(cateto2 > 0) {
            this.cateto2 = cateto2;
        } else {
            System.err.println("Erro! Valor inválido de cateto!");
            System.exit(0); //encerrando a execução do programa
        }
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        if(hipotenusa > 0) {
            this.hipotenusa = hipotenusa;
        } else {
            System.err.println("Erro! Valor inválido de hipotenusa!");
            System.exit(0); //encerrando a execução do programa
        }
        
    }

    public double getAlturaHipotenusa() {
        return alturaHipotenusa;
    }

    public void setAlturaHipotenusa(double alturaHipotenusa) {
        if(alturaHipotenusa > 0) {
            this.alturaHipotenusa = alturaHipotenusa;
        } else {
            System.err.println("Erro! Valor inválido de altura relativa à hipotenusa!");
            System.exit(0); //encerrando a execução do programa
        }
    }
    
    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        setCateto1(cateto1);
        setCateto2(cateto2);
        setHipotenusa(hipotenusa);
        setAlturaHipotenusa(alturaHipotenusa);
    }
    
    public TrianguloRetangulo() {
    }
    
    
    
}
