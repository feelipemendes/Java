/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerArquivos;

import Strings.TransformaData;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author luiz_mendes
 */
public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String flag = "s";

        File f = null;
        File[] paths;

        try {
            f = new File("\\\\gmz3fs02\\intsgs-p\\j4000c\\Backup\\");

            paths = f.listFiles();

            int j = 1;

            for (int i = paths.length - 1; i >= (paths.length) - 5; i--) {
                String name = "\\\\gmz3fs02\\intsgs-p\\j4000c\\Backup\\" + paths[i].getName();
                //Criação do objeto para poder usar o metodo contalinhas;    
                Contador cl = new Contador();
                //Criação do objeto para poder usar o metodo transformadata; 
                TransformaData data = new TransformaData();
                //Impressao da data e da quantidade de linhas
                System.out.println(j++ + "- Data:" + data.transforma(name.substring(52, 60)) + " Qntd:" + cl.contaLinhas(name));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
