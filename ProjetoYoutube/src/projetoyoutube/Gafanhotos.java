package projetoyoutube;

 //*@author Erick
public class Gafanhotos extends Pessoa {
    private String login;
    private int toAssitindo;

    @Override
    public String toString() {
        return "Usuario:{" +super.toString()+ "\nlogin = " + login + ", toAssitindo = " + toAssitindo + '}';
    }
    
    
    
    public Gafanhotos(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.toAssitindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getToAssitindo() {
        return toAssitindo++;
    }

    public void setToAssitindo(int toAssitindo) {
        this.toAssitindo = toAssitindo;
    }
    
    
}
