/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caelum.fixacao.ex1;

/**
 *
 * @author luiz_mendes
 */
public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome =   "Luiz";
        pessoa.idade = 23;
        
        System.out.println("Nome: " +pessoa.nome);
        System.out.println("Idade atual: "+pessoa.idade);
        pessoa.fazAniversario();
        System.out.println("Depois de um ano: "+pessoa.idade);
        
        
    }
}
