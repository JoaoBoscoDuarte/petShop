package model;

import interfaces.ServicoPetshopIF;
import model.enums.TamanhoAnimal;
import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetshop implements ServicoPetshopIF {

    private LocalDate data;
    private int codigo;
    private TamanhoAnimal tamAnimal;

    public ServicoPetshop(Object codigo, TamanhoAnimal tamAnimal) {
        if (!(codigo instanceof Integer)) {
            throw new IllegalArgumentException("O código deve ser um número inteiro");
        }

        if (tamAnimal == null) {
            throw new IllegalArgumentException("Tamanho inválido!");
        }

        this.codigo = (Integer) codigo;
        this.tamAnimal = tamAnimal;
        this.data = LocalDate.now();
    }

    public double calculaPreco() {
        System.out.println("Calcular preco");
        return 0;
    }

    public TamanhoAnimal getTamAnimal() {
        return tamAnimal;
    }

    public String descricao() {
        return  "Data: " + data + "\n" +
                "Código do animal: " + codigo + "\n" +
                "Tamanho do animal: " + tamAnimal + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ServicoPetshop that = (ServicoPetshop) o;
        return codigo == that.codigo && Objects.equals(data, that.data) && Objects.equals(tamAnimal, that.tamAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamAnimal);
    }

    @Override
    public String toString() {
        return "ServicoPetshop{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", tamAnimal=" + tamAnimal +
                '}';
    }
}
