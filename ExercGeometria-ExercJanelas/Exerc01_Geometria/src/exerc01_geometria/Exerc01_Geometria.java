
package exerc01_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc01_Geometria {
    
    // Done 1 crie um pacote chamado dimensao
    // Done 2 dentro do pacote dimensao, crie outro pacote chamado bidimensional
    // Done 3 dentro do pacote dimensao.bidimensional, crie a classe TrianguloRetangulo
    
    ///////////// FAÇA DENTRO DA CLASSE TrianguloRetangulo:
    ///////////// Sempre usando o modificador de acesso default para a classe, 
    ///////////// atributos e métodos
    // Done 4 remova o "public" de "public class TrianguloRetangulo"
    // Done 5 declare o atributo cateto1 
    // Done 6 declare o atributo cateto2 
    // Done 7 declare o atributo hipotenusa 
    // Done 8 declare o atributo alturaHipotenusa 
    // Done 9 crie um método para calcular e retornar a área do triângulo
    // Done 10 crie um método para calcular e retornar o perímetro do triângulo
    // Done 11 crie o contrutor padrão (vazio) e o parametrizado da classe (dica: Alt+Insert)
    //////////////////////////////////////////////

    public static void main(String[] args) {
        // Done 12 crie aqui um objeto da classe TrianguloRetangulo
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        // Done 13 escreva como comentário: por que aconteceu um erro na criação do objeto?
        //Resposta: O Erro ocrre porque a classe TrianguloRetangulo esta como default e faz parte de outro pacote//
        // Done 14 escreva como comentário: o que pode ser feito para resolver o erro?
        //Reposta: Para resolver esse problema tem que coloca a classe TrianguloRetangulo como "public"//
        // Done 15 altere o modificador da classe TrianguloRetangulo para public
        //Resposta modifiquei//
        // Done 16 escreva como comentário: por que o erro continua?
        //Respota: O Erro continua porque é preciso fazer uma impostação da classe TrianguloRetangulo poruque ela faz parte de outro pacote//
        // Done 17 adicione a importação da classe TrianguloRetangulo (clique na lâmpada ao lado)
        //Reposta: Depois de adicionar a importação faça o Get é Set.//
        
        // TODO 18 através do objeto, atribua valor dentro dos atributos diretamente
        tr1.cateto1 = 1.5;
        tr1.cateto2 = 2.5;
        tr1.hipotenusa = 4.25;
        tr1.alturaHipotenusa = 3.0;
        // TODO 19 escreva como comentário: é possível realizar esta atribuição? Justifique.
        //Respota: O motivo que os atributos estao como default tem que declarar como public//
        // TODO 20 escreva como comentário: o que pode ser feito para resolver este problema?
        //Respota: Tem que Encapsular a classe.//
        
    }
    
}
