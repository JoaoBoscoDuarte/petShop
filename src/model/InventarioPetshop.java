package model;

import interfaces.ServicoPetshopIF;
import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos;

    public InventarioPetshop() {
        this.servicos = new ArrayList<>();
    }

    public void adicionaServico(ServicoPetshop servico) {
        if (servico == null) {
            throw new IllegalArgumentException("Serviço não pode ser nulo");
        }

        servicos.add(servico);
    }

    public double calculaValorServico() {
        if (servicos == null || servicos.isEmpty()) {
            throw new IllegalAccessError("A listas de serviço é nula");
        }

        double calculo = 0;

        for (int i = 0; i < servicos.size(); i++) {
            calculo += servicos.get(i).calculaPreco();
        }

        return calculo;
    }

    public String listaServicos() {
//        if (servicos == null || servicos.isEmpty()) {
//            return "Nenhum serviço cadastrado.";
//        }

        String exibir = "";

        for (int i = 0; i < servicos.size(); i++) {
            exibir += "Serviço " + i + " : " + servicos.get(i).descricao() + " | ";
        }

        return exibir;
    }

    public void gerarRelatorioArquivo() {

    }

    public String gerarRelatorioString() {
        StringBuilder exibir = new StringBuilder();

        exibir.append("Relatório de serviços: \n");
        exibir.append("======================== \n");

        for (int j = 0; j < servicos.size(); j++) {
            exibir.append(servicos.get(j).descricao());
        }

        return exibir.toString();
    }
}
