/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio20;

/**
 *
 * @author luiz_mendes
 */
public class TestaAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato("Luiz", "NULL");
        Contato c2 = new Contato("RAPHAEL", "RUA PASSOS");
        Contato c3 = new Contato("FERNANDA", "RUA TIRADENTES");

        agenda.adicionaContato(c1);
        agenda.adicionaContato(c2);
        agenda.adicionaContato(c3);
        agenda.removerContato(c3);
        
        agenda.agendaInfo();

    }
}
