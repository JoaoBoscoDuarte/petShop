package model.services;

import model.ServicoPetshop;
import model.enums.TamanhoAnimal;
import model.enums.TamanhoPelo;

public class Banho extends ServicoPetshop {

    private TamanhoPelo tamPelo;

    public Banho(int codigo, TamanhoAnimal tamAnimal, TamanhoPelo tamPelo) {
        super(codigo, tamAnimal);

        if (tamPelo == null) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        this.tamPelo = tamPelo;
    }

    @Override
    public double calculaPreco() {
        double tamanho = 0, pelo = 0;

        if (getTamAnimal() == TamanhoAnimal.PEQUENO) {
            tamanho = TamanhoAnimal.PEQUENO.getPreco();
            pelo = TamanhoPelo.CURTO.getPreco();

        } else if (getTamAnimal() == TamanhoAnimal.MEDIO) {
            tamanho = TamanhoAnimal.MEDIO.getPreco();
            pelo = TamanhoPelo.MEDIO.getPreco();

        } else if (getTamAnimal() == TamanhoAnimal.GRANDE) {
            tamanho = TamanhoAnimal.GRANDE.getPreco();
            pelo = TamanhoPelo.LONGO.getPreco();
        }

        return tamanho + pelo;
    }

    @Override
    public String descricao() {
        return "Preço do serviço de banho é: " + calculaPreco();
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
        return super.toString()  + "Tamanho do pelo: " + tamPelo;
    }
}