package fabricacarro;

public class Carro {
    String cor;
    String modelo;
    double velAtual;
    double velMax;
    Motor motor;
    
    //Methods
    void liga(){
        System.out.println("Vrummmmm. Carro ligado");
    }
    
    void acelera(double quantidade){
        this.velAtual += quantidade;
    }
    
    int pegaMarcha(){
    
        if(this.velAtual > 0 & this.velAtual <= 30)
            return 1;
        if(this.velAtual > 30 & this.velAtual <= 60 )
            return 2;
        if(this.velAtual > 60 & this.velAtual <= 90 )
            return 3;
        return -1;
    }
    
}
