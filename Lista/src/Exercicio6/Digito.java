/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author luiz_mendes
 */
public class Digito {
    public static void main(String[] args) {
        int cont = 1;
        int valor;
        
        System.out.println("Entre com um valor: ");
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();
        
        while(valor > 9){
            cont++;
            valor /= 10;
        }
        
        System.out.println("Numero de digitos: "+cont);
        
    }
}
