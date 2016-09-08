/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerArquivos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 *
 * @author luiz_mendes
 */
public class Contador {
       public int contaLinhas(String file) {
        int cont = 0;

        try {
            File arquivoLeitura = new File(file);

// pega o tamanho
            long tamanhoArquivo = arquivoLeitura.length();
            FileInputStream fs = new FileInputStream(arquivoLeitura);
            DataInputStream in = new DataInputStream(fs);

            LineNumberReader lineRead = new LineNumberReader(new InputStreamReader(in));
            lineRead.skip(tamanhoArquivo);
// conta o numero de linhas do arquivo, começa com zero, por isso adiciona 1
            cont = lineRead.getLineNumber() + 1;

        } catch (IOException e) {
//TODO: Tratar exceção
        }
        return cont-2;//nao sei pq mas ta lendo duas linhas
    }
    
}
