/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caelum;

import Caelum.Funcionario;

/**
 *
 * @author luiz_mendes
 */
public class Empresa {

    String nome;
    String cnpj;
    Funcionario[] empregados = new Funcionario[300];
    private static int qntFuncionarios = 0;

    void adiciona(Funcionario f) {
        this.empregados[qntFuncionarios++] = f;

    }

    void showInfo() {

        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] != null) {
                System.out.println("Nome: " + empregados[i].getNome());
            }
        }
        System.out.println("Quantidade de funcionario: " + getQntFuncionarios());
    }

    public int getQntFuncionarios() {
        return Empresa.qntFuncionarios;
    }

}
