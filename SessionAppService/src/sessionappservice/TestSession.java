/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionappservice;

import com.sun.xml.internal.stream.Entity;
import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author luiz_mendes
 */
public class TestSession {

    SessionAppService sessao = new SessionAppService();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Console cns1 = null;
        cns1 = System.console();
       
        String login;
       // if (cns1 != null) {
            System.out.println("TELA DE LOGIN");

            System.out.println("Login: ");
            login = input.next();

            char[] pwd = cns1.readPassword();
            System.out.println("Login: "+login+" Senha: "+pwd);
      //  }

    }
}
