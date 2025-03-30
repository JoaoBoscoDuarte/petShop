package model.enums;

public enum TamanhoAnimal {
    PEQUENO(50),
    MEDIO(60),
    GRANDE(70);

    private final double preco;

    TamanhoAnimal(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
