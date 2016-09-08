/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author luiz_mendes
 */
public class TransformaData {
    
    public String transforma(String data){
       
        String date = "";
        StringBuffer dia = new StringBuffer(data.substring(6, 8));
                  
        StringBuffer mes = new StringBuffer(data.substring(4, 6));
        
       
        String ano = data.substring(0, 4);
        
        date = dia+"/"+mes+"/"+ano;
//        
        return date;
    }
    
}
