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
public class Gerente extends Funcionario{
    private int numFuncGeren;

    //Reescrita de metodo abstrato
     public double getBonification(){
        return (this.salario * 0.10)+1000;
    }
    
    
}
