/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerArquivos;

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
        while (flag.compareToIgnoreCase("s") == 0) {
//            try {

            File f = null;
            File[] paths;

            try {
                f = new File("\\\\gmz3fs02\\intsgs-p\\j4000c\\Backup\\");

                paths = f.listFiles();

                int j = 1;

//                System.out.println("Tamanho: "+paths.length+"--"+paths[TAM_PATH-1]);
//                
                for (int i = paths.length - 1; i >= (paths.length) - 7; i--) {
                    String name = paths[i].getName();
                    Contador cl = new Contador();
                    
                    System.out.println(j++ + " " + name.substring(18, 26) + " :" + cl.contaLinhas("\\\\gmz3fs02\\intsgs-p\\j4000c\\Backup\\"+paths[i].getName()));//paths[i]);
                }
            } catch (Exception e) {

                e.printStackTrace();
            } finally {
                System.out.println("FIM DO TRY!!!!");
            }

//                System.out.println("Entre com a data ao inverso do arquivo: ");
//                String nome = input.nextLine();
//                
//                
//                
//                ///Leitura de arquivo txt
//                FileReader arq = new FileReader("\\\\gmz3fs02\\intsgs-p\\j4000c\\Backup\\P01.SGS.SGSR0090B." + nome + ".csv");
//                BufferedReader lerArq = new BufferedReader(arq);
//
//                //Gravação em arquivo txt
//                FileWriter arq_ = new FileWriter("C:\\Users\\luiz_mendes\\Desktop\\JOBS\\17-08-2016\\UPDATE_" + nome.toUpperCase() + ".txt");
//                PrintWriter gravarArq = new PrintWriter(arq_);
//
//                String linha = lerArq.readLine();//Le a primeira linha, ao termino a variavel linha recebe null
//                while (linha != null) {
//                    // System.out.println("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '" + linha + "';");
//                    switch (nome) {
//                        case "vida":
//                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
//                            break;
//                        case "outro":
//                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_DEMAIS_RAMOS SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
//                            break;
//                        case "auto":
//                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_AUTO SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
//
//                    }
//
//                    linha = lerArq.readLine();
//                }
//
            System.out.println("Deseja continuar? S/N ");
            flag = input.nextLine();
//                arq_.close();

            //}
//        }catch (IOException e) {
//            System.out.println("Erro na abertura do arquivo");
//        }
        }
    }

 
}
