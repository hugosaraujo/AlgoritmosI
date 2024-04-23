package algoritmos1.busca;

import algoritmos1.busca.modelos.Carro;

import java.util.ArrayList;

public class MenorPreco {
    public static void main(String[] args) {

        int totalDeCarros = 5;
        Carro precosCarros[] = {
                new Carro("Lamborguini", 1000000),
                new Carro("Jipe", 46000),
                new Carro("Brasília", 16000),
                new Carro("Smart", 46000),
                new Carro("Fusca", 17000)
        };

        int menorPreco = buscaMenor(precosCarros);
        int maiorPreco = buscarMaior(precosCarros);

        System.out.printf("Carro da posição %d \n",menorPreco);
        System.out.printf(precosCarros[menorPreco].toString());
        System.out.printf("Carro da posição %d \n",maiorPreco);
        System.out.printf(precosCarros[maiorPreco].toString());

    }

    public static int buscarMaior(Carro[] precosCarros) {
        int maisCaro = 0;
        for (int atual = 0; atual < precosCarros.length; atual++) {
            if (precosCarros[atual].getValor() > precosCarros[maisCaro].getValor()){
                maisCaro = atual;
            }
        }
        return maisCaro;
    }

    public static int buscaMenor(Carro[] precosCarros) {
        int maisBarato = 0;
        for (int atual = 0; atual < precosCarros.length; atual++) {
            if(precosCarros[atual].getValor() < precosCarros[maisBarato].getValor()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
