
package exerc03_geometria;

import dimensao.bidimensional.TrianguloEquilatero;
import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc03_Geometria {
    
    // Done 1 dentro do pacote dimensao.bidimensional, crie uma classe chamada TrianguloEquilatero
    
    ///////////// FAÇA DENTRO DA CLASSE TrianguloEquilatero:
    ///////////// Agora, você vai decidir quais modificadores de acesso devem ser usados
    // Done 2 declare o atributo lado
    // Done 3 declare o atributo altura
    // Done 4 crie um método para calcular e retornar a área do triângulo equilátero
    // Done 5 crie um método para calcular e retornar o perímetro do triângulo equilátero
    // Done 6 crie o contrutor padrão (sem argumentos)
    // Done 7 crie o contrutor parametrizado (com todos os argumentos)
    // Done 8 programe os métodos de configuração set e get para todos os atributos
    // Done 9 dentro de cada método set, implemente a seguinte regra de validação:
    ///////// o atributo só será modificado se o valor passado para o set for maior que zero
    ///////// caso contrário, imprimir a mensagem "Valor inválido" e encerrar o programa
    //////////////////////////////////////////////
    
    public static void main(String[] args) {
        /*Andre Lucas- Tive que colocar o parametrizado como primeiro para
        poder resolver o problema de linhas da hora do resultado inválido*/
        TrianguloRetangulo tr1 = new TrianguloRetangulo(0.0,-1.2,3.0,9.9);
        tr1.calcArea();
        tr1.calcPerimetro();
        System.out.println("==========================================");
        
        
        
        TrianguloRetangulo tr2 = new TrianguloRetangulo();
        
        tr2.setCateto1(14.5);
        tr2.setCateto2(48.1);
        tr2.setHipotenusa(51.2);
        tr2.setAlturaHipotenusa(12.3);
        
        //Calcular e mostrar a area
        tr2.calcArea();
        
        //Calcular e mostrar Perimetro
        tr2.calcPerimetro();
        
        System.out.println("==============================================");

        
        // Done 10 aqui dentro do main, crie um objeto da classe TrianguloEquilatero (nome: te1)
        TrianguloEquilatero te1 = new TrianguloEquilatero();
        // Done 11 através do set, atribua valor 6.33 para o atributo lado
        te1.setLado(6.33);
        // Done 12 através do set, atribua valor 5.48 para o atributo altura
        te1.setAltura(5.48);
        // Done 13 crie aqui uma variável double de nome areaTe1
        double areaTe1;
        // Done 14 através do objeto te1, acesse o método calcArea() da classe TrianguloEquilatero
        areaTe1 = te1.calculoequilátero();
        ////////// e armazene o valor de retorno do método na variável areaTe1
        // Done 15 imprima o valor da área da seguinte forma: "Área do triângulo te1: <VALOR>"
        System.out.println("Area do triangulo: " + areaTe1);
        // Done 16 crie aqui uma variável double de nome perimetroTe1
        double perimetroTe1;
        // Done 17 através do objeto te1, acesse o método calcPerimetro() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do método na variável perimetroTe1
        perimetroTe1 =  te1.calculoperímetro();
        // TODO 16 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo te1: <VALOR>"
        System.out.println("Perimetro do triangulo " + perimetroTe1);
    }
    
}
