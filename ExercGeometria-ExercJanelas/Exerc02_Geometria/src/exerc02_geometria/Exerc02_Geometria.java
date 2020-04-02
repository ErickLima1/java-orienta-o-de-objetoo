
package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        // TODO 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso é prejudical para o projeto, porque ... (complete)
       
        // Don e 5 através do set, atribua valor 14.5 para o atributo cateto1
        tr1.setCateto1(14.5);
        // Done 6 através do set, atribua valor 48.1 para o atributo cateto2
        tr1.setCateto2(48.1);
        // Done 7 através do set, atribua valor 51.2 para o atributo hipotenusa
        tr1.setHipotenusa(51.2);
        // Done 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.setAlturaHipotenusa(12.3);
        
        // Done 9 comente: as atribuições deram certo? Por quê?
        //Respota: Deu certo porque os metodos estão public//
       
        // Done 10 crie aqui uma variável double de nome areaTr1
        double areaTr1;
        // Done 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável areaTr1
        areaTr1 = tr1.calcArea(); 
        // Done 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        System.out.println("Area do triangulo: " + areaTr1);
        // Done 13 comente: por que está dando erro?
        //Resposta: O Erro continua porque o metodo esta configurado como default e as classe estão em pacote diferente//
        // Done 14 comente: o que pode ser feito para resolver este erro?
        //Respota: O Erro pode ser resolvido, colocando os metodos e calculos em public
        
        
        // Done 16 crie aqui uma variável double de nome perimetroTr1
        double perimetroTr1;
        // Done 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        perimetroTr1 = tr1.calcPerimetro();
        // Done 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        System.out.println("Perimetro do triangulo: " + perimetroTr1);
        // TODO 19 comente: por que está dando erro?
        //Respota: O Erro continua porque o metodo esta configurado como default//
        // TODO 20 comente: o que pode ser feito para resolver este erro?
        //Respota:O Erro pode ser resolvido, colocando os metodos e calculos em public//
        
        // TODO 21 crie um outro objeto através do construtor, passando um valor inválido
        TrianguloRetangulo tr2 = new TrianguloRetangulo(-2,-4,-6,-7);
        // TODO 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        double areaTr2 = tr2.calcArea();
        double periTr2 = tr2.calcPerimetro();
        // TODO 23 imprima os valores dos cálculos
        System.out.println("Area Tr2 " + areaTr2);
        System.out.println("Perimetro Tr2 " + periTr2);
        
        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        //Respota Acontece Erro, para consertalos é nescessario chamar os metodos set e get parametrizados
        
        
    }
    
}
