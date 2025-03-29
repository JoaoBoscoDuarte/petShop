package model;

import model.enums.TamanhoAnimal;
import model.enums.TamanhoTosa;
import model.enums.TempoHotel;

public class Tosa extends ServicoPetshop {

    public Tosa(int codigo, TamanhoAnimal tamAnimal) {
        super(codigo, tamAnimal);
    }

    @Override
    public double calculaPreco() {
        double preco = 0;
        if (this.tamAnimal == TamanhoAnimal.PEQUENO) {
            preco = TamanhoTosa.PEQUENO.getPreco();

        } else if (this.tamAnimal == TamanhoAnimal.MEDIO) {
            preco = TamanhoTosa.MEDIO.getPreco();

        } else if (this.tamAnimal == TamanhoAnimal.GRANDE) {
            preco = TamanhoTosa.GRANDE.getPreco();
        }

        return preco;
    }

    @Override
    public String descricao() {
        return "O valor da tosa é: " + calculaPreco();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}