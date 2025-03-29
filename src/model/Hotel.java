package model;

import model.enums.TamanhoAnimal;
import model.enums.TempoHotel;

public class Hotel extends ServicoPetshop {

    private int qtdHoras;

    public Hotel(int codigo, TamanhoAnimal tamAnimal, int qtdHoras) {
        super(codigo, tamAnimal);
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calculaPreco() {
        double preco = 0;

        if (this.tamAnimal == TamanhoAnimal.PEQUENO) {
            preco = TempoHotel.PEQUENO.getPreco();

        } else if (this.tamAnimal == TamanhoAnimal.MEDIO) {
            preco = TempoHotel.MEDIO.getPreco();

        } else if (this.tamAnimal == TamanhoAnimal.GRANDE) {
            preco = TempoHotel.GRANDE.getPreco();
        }

        return qtdHoras * preco;
    }

    @Override
    public String descricao() {
        return "O preço do serviço de hetelzinho é de: " + calculaPreco();
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
