/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerArquivos;

/**
 *
 * @author luiz_mendes
 */
public class XML {

    int qntd;
    String data;

    public XML(String data, int qntd){
        this.data = data;
        this.qntd = qntd;
    }

    @Override
    public String toString() {
        return data + " " + qntd; //To change body of generated methods, choose Tools | Templates.
    }
    
}
