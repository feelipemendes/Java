/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz_mendes
 */
public class Agenda {
    private String nome;
    private List<Contato> contatos = new ArrayList<Contato>();
    
    public void adicionaContato(Contato c){
        contatos.add(c);
    }
    
    public void removerContato(Contato c){
        contatos.remove(c);
    }
    
    public void agendaInfo(){
        for(Contato x : contatos){
            System.out.println("Nome: "+x.getNome()+" Telefone: "+x.getTelefone());
        }
    }
}
