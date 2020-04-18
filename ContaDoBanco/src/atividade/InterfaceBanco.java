/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Erick
 */
public interface InterfaceBanco {
    public abstract void abrirconta(String t);
    public abstract void fechaconta();
    public abstract void deposita(float v);
    public abstract void sacar(float v);
    public abstract void pagarmensal();
    
}
