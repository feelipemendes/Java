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
public class Porta {
    String cor;
    boolean aberta = false;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }
    
    
    
    public void abre(){
        this.aberta = true;
    }
    
    public void fecha(){
        this.aberta = false;
    }
    
    void pinta(String s){
        this.cor = s;
        System.out.println("Cor da porta: "+this.cor);
    }
    
    public boolean estaAberta(){
        if(this.aberta){
            System.out.println("Porta Aberta!");
            return true;
        }else{
            System.out.println("Porta Fechada!");
            return false;
        }
    }
    
   
}
