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
        ordena(produtos, totalDeElementos);

        for (var produto : produtos){
            System.out.println(produto);
        }
    }

    private static void ordena(Produto[] produtos, int quantidadeElementos) {
        for (int atual = 0; atual < quantidadeElementos - 1; atual++) {
            System.out.println("Estou na casinha " + atual);
            int menor = buscaMenor(produtos, atual, quantidadeElementos);
            System.out.println("Trocando " + atual + " com o " + menor);

            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            System.out.println("Trocando " + produtoAtual.getModelo() + " - " + produtoMenor.getModelo());

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
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