package algoritmos1.busca;

import algoritmos1.busca.modelos.Produto;

public class TestaOrdenacao {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };


        for (int atual = 0; atual < produtos.length - 1; atual++) {
            int menor = buscaMenor(produtos, atual, produtos.length);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }

        for (var produto : produtos){
            System.out.println(produto);
        }
    }

    private static int buscaMenor(Produto[] precosCarros, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual < termino; atual++) {
            if(precosCarros[atual].getValor() < precosCarros[maisBarato].getValor()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}