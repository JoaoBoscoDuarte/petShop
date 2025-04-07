package model;

import interfaces.ServicoPetshopIF;

import java.io.*;
import java.util.List;

public class RelatorioPetshop {
    List<ServicoPetshopIF> servicos;
    RelatorioPetshop relatorioPetshop;

    public RelatorioPetshop() {
        this.relatorioPetshop = new RelatorioPetshop();
        this.servicos = relatorioPetshop.servicos;
    }

    public void gerarRelatorioArquivoTxt() {
        try (FileWriter writer = new FileWriter("Relatorio_Servicos.txt")) {
            writer.write("Relatório de Serviços:\n");
            writer.write("========================\n");

            for (int k = 0; k < servicos.size(); k++) {
                writer.write(servicos.get(k).descricao() + "\n");
            }

            System.out.println("Relatório gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gerar o relatório: " + e.getMessage());
        }
    }

    public String lerRelatorioArquivoTxt() {
        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("Relatorio_Servicos.txt"))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }

        } catch (IOException e) {
            return "Erro ao ler o relatório: " + e.getMessage();
        }

        return conteudo.toString();
    }

}
