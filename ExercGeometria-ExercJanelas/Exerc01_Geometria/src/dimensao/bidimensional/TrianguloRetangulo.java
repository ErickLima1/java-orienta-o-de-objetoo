
package dimensao.bidimensional;


public class TrianguloRetangulo {
    ///////////// FAÇA DENTRO DA CLASSE TrianguloRetangulo:
    ///////////// Sempre usando o modificador de acesso default para a classe, 
    ///////////// atributos e métodos
    // DONE 4 remova o "public" de "public class TrianguloRetangulo"
    // DONE 5 declare o atributo cateto1 
    double cateto1;
    // DONE 6 declare o atributo cateto2 
    double cateto2;
    // DONE 7 declare o atributo hipotenusa 
    double hipotenusa;
    // DONE 8 declare o atributo alturaHipotenusa 
    double alturaHipotenusa;
    
    // DONE 9 crie um método para calcular e retornar a área do triângulo
    double calcArea() {
        double area = this.hipotenusa * this.alturaHipotenusa / 2.0;
        return area;
    }
    // DONE 10 crie um método para calcular e retornar o perímetro do triângulo
    double calcPerimetro() {
        double p = this.cateto1 + this.cateto2 + this.hipotenusa;
        return p;
    }
    // DONE 11 crie o contrutor padrão (vazio) e o parametrizado da classe (dica: Alt+Insert)

    public TrianguloRetangulo() {
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;
    }

}