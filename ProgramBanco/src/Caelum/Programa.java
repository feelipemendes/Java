package Caelum;

import com.sun.org.apache.bcel.internal.generic.DADD;

public class Programa {

    public static void main(String[] args) {
        Cliente c = new Cliente();

        Conta c1 = new ContaCorrente();
        Conta c2 = new ContaPoupanca();
        //Cliente 1

        //Funcionarios
        Funcionario f1 = new Vendedor();
        Data data = new Data();

//        f1.dataEfetivacao = data;
//        f1.nome = "Rodrigao";
//        f1.dataEfetivacao.ano = 2016;
//        f1.dataEfetivacao.mes = 06;
//        f1.dataEfetivacao.dia = 12;
//        f1.mostra();
        c1.saldo = 1210.00;
        c1.titular = c;

        //Entrada do sistema;
        System.out.println("Prezado, " + c1.titular.nomeCompleto + "\n------------------\nSeu Saldo atual: " + c1.saldo + "..\n------------------");

        //Testando o saque
        System.out.println("\n--Sacando " + 100 + " --\n");
        //    sacou = c1.saca(1500);
        System.out.println((c1.saca(100)) ? "Transação bem sucedida" : "Não aprovada. Saldo insuficiente");

        System.out.println("\nAtualizando..\n------------------\nSeu Saldo atual: " + c1.saldo + "\n---------------");

        //Testando o deposito
        c1.deposita(1200.00);
        System.out.println("\nDepois do pagamento \nSeu Saldo atual: " + c1.saldo);

        //Transferencia Bancaria 
        //Se der certo imprimir ok
        if (c1.tranferePara(c2, 2000)) {
            System.out.println("\nTranferencia concluída! -2000,00 C1");
            System.out.println("\nConta 1: " + c1.saldo + "\nConta 2: " + c2.saldo);
        
        } else {
            System.out.println("Saldo em conta é insulficiente! ");
        }
        c1.atualiza(0.01);
        c2.atualiza(0.01);

        c1.mostra();
        c2.mostra();
    }

}
