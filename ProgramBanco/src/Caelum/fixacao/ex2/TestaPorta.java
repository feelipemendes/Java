/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caelum.fixacao.ex2;

/**
 *
 * @author luiz_mendes
 */
public class TestaPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.abre();
        porta.fecha();
        porta.pinta("Azul");
        porta.pinta("Amarelo");
        porta.pinta("Verde");
        
        porta.estaAberta();
        
    }
    
}
