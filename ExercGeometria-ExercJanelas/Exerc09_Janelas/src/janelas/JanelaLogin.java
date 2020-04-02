
package janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
    TODO 01 - a sua tarefa agora é criar mais um botão aqui nesta classe
    /////// com a função de limpar os campos informados na tela, ou seja,
    /////// quando o usuário clicar no botão limpar, então o email e 
    /////// a senha informados deverão ser apagados
*/

public class JanelaLogin extends JFrame {
    private JPanel painel = new JPanel();
    
    private BoxLayout layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
    
    private JLabel txtLogin = new JLabel("Informe seus dados");
    private JLabel txtEmail = new JLabel("E-mail:");
    private JLabel txtSenha = new JLabel("Senha:");
    
    private JTextField campoEmail = new JTextField(20);
    private JPasswordField campoSenha = new JPasswordField(20);
    
    private JButton botaoOK = new JButton("Entrar");
    private JButton botaoLimpar = new JButton("Limpar");


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
        botaoLimpar.setAlignmentX(CENTER_ALIGNMENT);
        
        botaoOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String emailDigitado = campoEmail.getText();
                String senhaDigitada = String.valueOf(campoSenha.getPassword());
                
                if(senhaDigitada.equals("senha!@#")
                        && emailDigitado.equals("admin@sistema.com")) {
                    JOptionPane.showMessageDialog(null, "Senha Correta", "Sistema.com", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Incorreta", "Sistema.com", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                    campoEmail.setText(" ");
                    campoSenha.setText(" ");
                
            }
        });

        painel.add(txtLogin);
        painel.add(txtEmail);
        painel.add(campoEmail);
        painel.add(txtSenha);
        painel.add(campoSenha);
        painel.add(botaoOK);
        
        painel.add(botaoLimpar);
        this.add(painel);
    }
    
}
