/*
    Abre um arquivo
    le esse arquivo
    pega os dados desse arquivo gera uma concatenação
    e salvo o resultado em outro arquivo

 */
package Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author luiz_mendes
 */
public class Concatena {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String flag = "s";

        try {
            while(flag.compareToIgnoreCase("s") == 0){

                System.out.println("Entre com o ramo do arquivo: ");
                String ramo = input.nextLine();

                ///Leitura de arquivo txt
                FileReader arq = new FileReader("C:\\Users\\luiz_mendes\\Desktop\\JOBS\\17-08-2016\\" + ramo + ".txt");
                BufferedReader lerArq = new BufferedReader(arq);

                //Gravação em arquivo txt
                FileWriter arq_ = new FileWriter("C:\\Users\\luiz_mendes\\Desktop\\JOBS\\17-08-2016\\UPDATE_" + ramo.toUpperCase() + ".txt");
                PrintWriter gravarArq = new PrintWriter(arq_);

                String linha = lerArq.readLine();//Le a primeira linha, ao termino a variavel linha recebe null
                while (linha != null) {
                    // System.out.println("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '" + linha + "';");
                    switch (ramo) {
                        case "vida":
                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
                            break;
                        case "outro":
                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_DEMAIS_RAMOS SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
                            break;
                        case "auto":
                            gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_AUTO SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);

                    }

                    linha = lerArq.readLine();
                }

                System.out.println("Deseja continuar? S/N ");
                flag = input.nextLine();
                arq_.close();

            }

        } catch (IOException e) {
            System.out.println("Erro na abertura do arquivo");
        }
        System.out.println("");

    }

}
