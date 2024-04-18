package algoritmos1.busca;

import algoritmos1.busca.modelos.Carro;

import java.util.ArrayList;

public class MenorPreco {
    public static void main(String[] args) {

        int totalDeCarros = 5;
        Carro precosCarros[] = new Carro[totalDeCarros];
        precosCarros[0] = new Carro("Lamborguini", 1000000);
        precosCarros[1] = new Carro("Jipe", 46000);
        precosCarros[2] = new Carro("Brasília", 16000);
        precosCarros[3] = new Carro("Smart", 46000);
        precosCarros[4] = new Carro("Fusca", 17000);

        int menorPreco = 0;
        int maiorPreco = 0;

        for (int atual = 0; atual < totalDeCarros; atual++) {
            if(precosCarros[atual].getValor() < precosCarros[menorPreco].getValor()){
                menorPreco = atual;
            } else if (precosCarros[atual].getValor() > precosCarros[maiorPreco].getValor()){
                maiorPreco = atual;
            }
        }
        System.out.printf("Carro da posição %d \n",menorPreco);
        System.out.printf(precosCarros[menorPreco].toString());
        System.out.printf("Carro da posição %d \n",maiorPreco);
        System.out.printf(precosCarros[maiorPreco].toString());

    }
}
