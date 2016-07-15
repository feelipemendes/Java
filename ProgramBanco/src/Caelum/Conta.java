package Caelum;

public abstract class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;
    Cliente titular;// = new Cliente();
//
//    public Conta(Cliente c) {
//        this.dono = c.nomeCompleto;
//    }

    //Methods here
    //Sacar $ valor da conta e dizer se foi bem sucedida
    boolean saca(double quantidade) {
        if (this.saldo > quantidade) {
            this.saldo -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    //Tira da conta e deposita na conta de destino.
    boolean tranferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }

    }
    void mostra(){
        System.out.println("Saldo e Dono: "+saldo+" "+dono);
    }
    abstract void atualiza(double taxa);
}
