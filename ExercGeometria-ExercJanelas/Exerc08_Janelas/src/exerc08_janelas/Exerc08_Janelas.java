
package exerc08_janelas;

import janelas.JanelaLogin;
import javax.swing.JFrame;

public class Exerc08_Janelas {

    public static void main(String[] args) {
        // DOne 01 - crie aqui um objeto da classe JanelaLogin de nome janelaLogin
        JanelaLogin j = new JanelaLogin();
    
        
        // Done 02 - através do objeto janelaLogin, acesse o método setSize 
        ////////// e passe os seguintes valores: 300, 300
        j.setSize(300,300);
        // Done 03 - através do objeto janelaLogin, acesse o método setDefaultCloseOperation 
        ////////// e passe o seguinte valor: JFrame.EXIT_ON_CLOSE (realize importação)
        j.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // Done 04 - através do objeto janelaLogin, acesse o método setVisible 
        ////////// e passe o seguinte valor: true
        j.setVisible(true);
        
        // Done 05 - execute o projeto, digite valores nos campos e clique no botão!
        ////////// o que acontece?
        //Respota: o botao ainda não esta programado. Entao não acontece nada.
        }
    }
    

