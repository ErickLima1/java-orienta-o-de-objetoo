
package exerc09_janelas;

import janelas.JanelaLogin;
import javax.swing.JFrame;

public class Exerc09_Janelas {

    public static void main(String[] args) {
        
        JanelaLogin janelaLogin = new JanelaLogin();
        janelaLogin.setSize(300, 300);
        janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaLogin.setVisible(true);
        
    }
    
}
