package fabricacarro;

public class FabricaCarro {

    public static void main(String[] args) {
        Carro novoCarro = new Carro();
        novoCarro.cor = "Azul";
        novoCarro.modelo = "Azura";
        novoCarro.velAtual = 0;
        novoCarro.velMax = 320;
        
        //Liga o carro
        novoCarro.liga();
        
        //Acelera
        novoCarro.acelera(30);
        System.out.println("Velocidade Atual: "+novoCarro.velAtual+" Km/h");
        
    }
    
}
