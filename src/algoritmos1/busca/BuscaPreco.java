package algoritmos1.busca;

import algoritmos1.busca.modelos.Produto;

public class BuscaPreco {
    public static void main(String[] args) {

        int totalDeCarros = 5;
        Produto precosCarros[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        int menorPreco = buscaMenor(precosCarros, 0, 5);
        int maiorPreco = buscarMaior(precosCarros, 0, 5);

        System.out.printf("Carro da posição %d \n",menorPreco);
        System.out.printf(precosCarros[menorPreco].toString());
        System.out.printf("Carro da posição %d \n",maiorPreco);
        System.out.printf(precosCarros[maiorPreco].toString());

    }

    public static int buscarMaior(Produto[] precosCarros, int inicio, int termino) {
        int maisCaro = inicio;
        for (int atual = inicio; atual < termino; atual++) {
            if (precosCarros[atual].getValor() > precosCarros[maisCaro].getValor()){
                maisCaro = atual;
            }
        }
        return maisCaro;
    }

    public static int buscaMenor(Produto[] precosCarros, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual < termino; atual++) {
            if(precosCarros[atual].getValor() < precosCarros[maisBarato].getValor()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
