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
public interface InterfaceControle {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void AumentandoVolume();
    public abstract void baixandoVolume();
    public abstract void canal();
    public abstract void trocaCanal();
    public abstract void canalEspecifico(int canalEspecifico);
    
}
