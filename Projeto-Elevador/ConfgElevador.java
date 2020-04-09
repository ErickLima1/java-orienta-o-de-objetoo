/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeevelado;

/**
 *
 * @author Erick
 */
public class ConfgElevador {
    protected boolean Ativado;
    protected int andarAtual;
    protected int entraSair;
    protected int Subindo;
    protected int Descendo;

    public ConfgElevador() {
        this.Ativado = false;
        this.entraSair = 0;
        this.andarAtual = 1;
    }

    public boolean getAtivado() {
        return Ativado;
    }

    public void setAtivado(boolean Ativado) {
        this.Ativado = Ativado;
    }

    public int getEntraSair() {
        return entraSair;
    }

    public void setEntraSair(int entraSair) {
        this.entraSair = entraSair;
    }

    public int getSubindo() {
        return Subindo;
    }

    public void setSubindo(int Subindo) {
        this.Subindo = Subindo;
    }

    public int getDescendo() {
        return Descendo;
    }

    public void setDescendo(int Descendo) {
        this.Descendo = Descendo;
    }
      public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    
   
}
