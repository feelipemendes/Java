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
public class TestaEmpresa {
    public static void main(String[] args) {
        
        Funcionario g1 = new Gerente();
        
        g1.setNome("Sergio");
        g1.setSenha("0001");
        g1.setSalario(2000);
        
        Funcionario f1 = new Vendedor();
        f1.setNome("Clodoaldo");
        
        Funcionario f2 = new Vendedor();
        f2.setNome("Fernando");
        
        Funcionario f3 = new Vendedor();
        f3.setNome("Gilmara");
        
        Empresa empresa = new Empresa();
      
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        
        empresa.showInfo();
        
        System.out.println(g1.getSenha()+" Bonification: "+g1.getBonification());
        
    }
}
