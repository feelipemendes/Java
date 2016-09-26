/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerArquivos;
import java.util.Scanner;
import Strings.TransformaData;
import java.util.Collections;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author luiz_mendes
 */
public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String flag = "s";

        ArrayList xmls1 = new ArrayList();

        File f; //= null;
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
                //insert a string and the numbers of line about the file
                XML xml = new XML(data.transforma(name.substring(52, 60)), cl.contaLinhas(name));

                xmls1.add(xml);//add element xml into xmls arraylist
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            Collections.reverse(xmls1);
            //print a reverse xml arraylist
            for (int i = 0; i < xmls1.size(); i++) {
                System.out.println(xmls1.get(i));
            }
        }

    }

}
