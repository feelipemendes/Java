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
public class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        casa.porta[0] = porta1;
        casa.porta[1] = porta2;
        casa.porta[2] = porta3;
        //Abrindo as portas
        casa.porta[0].abre();
        casa.porta[1].abre();
        casa.porta[2].abre();
        casa.porta[1].fecha();
        
        
        
        casa.pinta("Amarelo");
        System.out.println("Numero de portas aberts: "+casa.quantasPortasAbertas());
        
    }
    
}
