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

        System.out.println("Entre com o nome do arquivo: ");
        String nome = input.nextLine();

        System.out.println("Conteudo do arquivo texto: \n");
        try {
            //Leitura de arquivo txt
            FileReader arq = new FileReader("C:\\Users\\luiz_mendes\\Desktop\\JOBS\\17-08-2016\\" + nome + ".txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            //Gravação em arquivo txt
            FileWriter arq_ = new FileWriter("C:\\Users\\luiz_mendes\\Desktop\\JOBS\\17-08-2016\\resultado.txt");
            PrintWriter gravarArq = new PrintWriter(arq_);
            
            String linha = lerArq.readLine();//Le a primeira linha, ao termino a variavel linha recebe null
            while (linha != null) {
               // System.out.println("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '" + linha + "';");
                gravarArq.printf("UPDATE db_sinistro.dbo.SNS_AVISO_VIDA SET flg_idn_con = 'N' WHERE num_avs = '%s'; %n", linha);
                linha = lerArq.readLine();
            }
            
            arq_.close();

        } catch (IOException e) {
            System.out.println("Erro na abertura do arquivo");
        }
        System.out.println("");
    }

}
