package algoritmos1.busca;

import algoritmos1.busca.modelos.Produto;

public class TestaOrdenacao {

    public static void main(String[] args) {
        int totalDeElementos = 5;

        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        //insertionSort(produtos, totalDeElementos);
        selectionSort(produtos, totalDeElementos);

        for (var produto : produtos){
            System.out.println(produto);
        }
    }

    private static void insertionSort(Produto[] produtos, int quantidadeElementos){
        for (int atual = 1; atual < quantidadeElementos; atual++) {
            System.out.println("Estou na posicao " + atual);
            int analise = atual;
            while(analise > 0
                    && produtos[analise].getValor() < produtos[analise-1].getValor()){
                troca(produtos, analise, analise -1 );
                analise--;
            }
            
        }
    }

    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        System.out.println("Trocando " + primeiro + " com o " + segundo);
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        System.out.println("Estou trocando " +primeiroProduto.getModelo() + " com " + segundoProduto.getModelo());
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static void selectionSort(Produto[] produtos, int quantidadeElementos) {
        for (int atual = 0; atual < quantidadeElementos - 1; atual++) {
            System.out.println("Estou na casinha " + atual);
            int menor = buscaMenor(produtos, atual, quantidadeElementos);
            troca(produtos, atual, menor);
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