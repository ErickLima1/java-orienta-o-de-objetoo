/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usacontrole;

/**
 *
 * @author Erick
 */
public class TV {
    protected boolean Ativado;
    protected int qtdcanal;
    protected int canalAtual;
    protected int volumeAtual;
    protected int volumeMaximo;

    public TV() {
        this.Ativado = false;
        this.qtdcanal = 100;
        this.canalAtual = 1;
        this.volumeAtual = 50;
        this.volumeMaximo = 50;
        
        
    }

    public boolean getAtivado() {
        return Ativado;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }

    public void setAtivado(boolean Ativado) {
        this.Ativado = Ativado;
    }

    public int getQtdcanal() {
        return qtdcanal;
    }

    public void setQtdcanal(int qtdcanal) {
        this.qtdcanal = qtdcanal;
    }
    
    
    
    
}
