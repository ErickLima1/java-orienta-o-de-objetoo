
package janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaLogin extends JFrame {
    private JPanel painel = new JPanel();
    
    private BoxLayout layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
    
    private JLabel txtLogin = new JLabel("Informe seus dados");
    private JLabel txtEmail = new JLabel("E-mail:");
    private JLabel txtSenha = new JLabel("Senha:");
    
    private JTextField campoEmail = new JTextField(20);
    private JPasswordField campoSenha = new JPasswordField(20);
    
    private JButton botaoOK = new JButton("Entrar");

    public JanelaLogin() {
        
        painel.setLayout(layoutPainel);
        campoEmail.setMaximumSize( campoEmail.getPreferredSize() );
        campoSenha.setMaximumSize( campoSenha.getPreferredSize() );
        
        txtLogin.setAlignmentX(CENTER_ALIGNMENT);
        txtEmail.setAlignmentX(CENTER_ALIGNMENT);
        txtSenha.setAlignmentX(CENTER_ALIGNMENT);
        campoEmail.setAlignmentX(CENTER_ALIGNMENT);
        campoSenha.setAlignmentX(CENTER_ALIGNMENT);
        botaoOK.setAlignmentX(CENTER_ALIGNMENT);
        
        // TODO 06 - vamos programar aqui a ação de clique do botão
        
        // o método addActionListener é chamado através do objeto botaoOK
        botaoOK.addActionListener(new ActionListener() {
            
            // dentro deste método, chama-se o método actionPerformed 
            // repare que o actionPerformed está sendo sobrescrito!!! (override):
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Done 07 - aqui dentro, crie uma variável do tipo String de nome
                ////////// emailDigitado e atribua a ela o valor de retorno 
                ////////// do método getText que deve ser chamado através do 
                ////////// objeto campoEmail
                String emailDigitado = campoEmail.getText();
                
                // Done 08 - crie agora outra variável do tipo String de nome
                ////////// senhaDigitada e atribua a ela o valor de retorno 
                ////////// do método getPassword que deve ser chamado através do 
                ////////// objeto campoSenha
                String senhaDigitada = String.valueOf(campoSenha.getPassword());
                
                // Done 09 - por que está dando erro?
                ////////// R:O Erro ocorre, porque o metodo getpassword retorna o valor do tipo char estamos  tentando armazenar em
                ///////////// uma String, havendo uma incopatibilidade de tipos valores
                
                // Done 10 - realize a conversão para String através do método String.valueOf
                
                // Done 11 - programe a seguinte verificação:
                ////////// se a senha digitada for igual a "senha!@#" e o email "admin@sistema.com"
                if(senhaDigitada.equals("Senha!@#") && emailDigitado.equals("erick@12gmail.com")) {
                    
                }
                ////////// então mostre uma caixa de JOptionPane da seguinte forma:
                ////////// JOptionPane.showMessageDialog(null, "Senha Correta", "Sistema.com", JOptionPane.INFORMATION_MESSAGE);
                ////////// senão, mostre a seguinte caixa:
                ////////// JOptionPane.showMessageDialog(null, "Senha Incorreta", "Sistema.com", JOptionPane.ERROR_MESSAGE);
                ////////// faça importações necessárias
                
                // TODO 12 - execute o projeto, faça os testes. o que acontece? 
                ////////// LEGAL NÉ??? ;)
                
            }
        });
        
        painel.add(txtLogin);
        painel.add(txtEmail);
        painel.add(campoEmail);
        painel.add(txtSenha);
        painel.add(campoSenha);
        painel.add(botaoOK);
        
        this.add(painel);
    }
    
}
