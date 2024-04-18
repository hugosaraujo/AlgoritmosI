package algoritmos1.busca.modelos;

public class Carro {
    private String modelo;
    private int valor;

    public Carro(String modelo, int valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return """
                %s: R$ %d,00
                """.formatted(getModelo(), getValor());
    }
}
