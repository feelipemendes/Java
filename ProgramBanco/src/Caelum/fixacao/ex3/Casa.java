/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caelum.fixacao.ex3;

import Caelum.fixacao.ex2.Porta;

/**
 *
 * @author luiz_mendes
 */
public class Casa {

    String cor;
    Porta[] porta = new Porta[3];

    int quantasPortasAbertas() {
        int cont = 0;
        for (int i = 0; i < porta.length; i++) {
            if (porta[i].estaAberta()) 
               cont++;
        }
        return cont;
    }

    void pinta(String s) {
        this.cor = s;
        System.out.println("Cor da casa: " + this.cor);
    }
    


}
