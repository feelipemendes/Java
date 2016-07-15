/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caelum;

/**
 *
 * @author luiz_mendes
 */
public class ContaCorrente extends Conta{

    void atualiza(double taxa) {
        this.saldo *= taxa * 2; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
