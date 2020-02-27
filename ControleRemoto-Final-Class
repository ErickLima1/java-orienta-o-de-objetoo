package aula06;


public class ControleRemoto implements Controlador {
//Atributos
private int volume;
private boolean ligado;
private boolean tocando;
//Metodos Especial
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private void setvolume(int volume) {
        this.volume = volume;
    }
    private int getvolume() {
        return this.volume;
    }
    private void setligado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getligado() {
        return this.ligado = ligado;
    }
    private void settocando(boolean tocando) {
        this.tocando = tocando;
    }
    private boolean gettocando() {
        return this.tocando;
    }
    //Abstratos
    @Override
    public void ligar() {
    this.setligado(true);
    }
    @Override
    public void desligar() {
    this.setligado(false);
    }
    @Override
    public void abrirmenu() {
      if(this.getligado() == true) {
            System.out.println("-----Menu-Controle-----");
        System.out.println("Esta ligado ? " + this.getligado());
        System.out.println("Esta Tocando ? " + this.gettocando());
        System.out.println("Volume " + this.getvolume());
        for(int i = 0; i <= this.getvolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println(" ");
      }else {
          System.out.println("Impossivel mostra menu Desligado");
      }
    }
    @Override
    public void fecharmenu() {
        System.out.println("Menu Fechado....");
    }
    @Override
    public void maisvolume() {
        if(this.getligado()) {
            this.setvolume(this.getvolume() + 5);
        }else {
            System.out.println("Impossivel Aumentar O Volume ");
        }
    }
    @Override
    public void menosvolume() {
       if(this.getligado()) {
           this.setvolume(this.getvolume() - 5);
       }else {
           System.out.println("Impossivel Diminuir o valume ");
       }
    }
    @Override
    public void ligarmudo() {
        if(this.getligado() && (this.getvolume() > 0)) {
            this.setvolume(0);
            this.settocando(false);
        }
    }
    @Override
    public void desligarmudo() {
        if(this.getligado() && this.getvolume() == 0) {
            this.setvolume(50);
            this.settocando(true);
        }
    }
    @Override
    public void play() {
        if(this.getligado() && !(this.gettocando())) {
            this.settocando(true);
        }else {
            System.out.println("Não Consigui Reproduzir ");
        }
    }
    @Override
    public void pause() {
        if(this.getligado() && (this.gettocando())) {
            this.settocando(false);      
        }       
    }
    

}
