package org.devtrail.polimorfismoFuncionario.teste;

import org.devtrail.polimorfismoFuncionario.dominio.Funcionario;
import java.util.Random;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        Random rand = new Random();

        for (int i = 0; i < funcionarios.length; i++) {
            String cargo;
            if (i < 1) {
                cargo = "Gerente";
                funcionarios[i] = new Funcionario("Rafael" + (i + 1), String.format("%03d", i + 1), "GRADUAÇÃO", "Escola Básica", "Escola Média", "Universidade", cargo);
            } else if (i < 3) {
                cargo = "Supervisor";
                funcionarios[i] = new Funcionario("Áquila" + (i + 1), String.format("%03d", i + 1), "ENSINO MÉDIO", "Escola Básica", "Escola Média", "", cargo);
            } else {
                cargo = "Vendedor";
                if (rand.nextBoolean()) {
                    funcionarios[i] = new Funcionario("Teresinha" + (i + 1), String.format("%03d", i + 1), "ENSINO BÁSICO", "Escola Básica", "", "", cargo);
                } else {
                    funcionarios[i] = new Funcionario("Cláudio" + (i + 1), String.format("%03d", i + 1), "ENSINO MÉDIO", "Escola Básica", "Escola Média", "", cargo);
                }
            }
        }

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.calcularRendaTotal();
            custoTotal += rendaTotal;

            switch (funcionario.getEscolaridade()) {
                case "ENSINO BÁSICO":
                    custoEnsinoBasico += rendaTotal;
                    break;
                case "ENSINO MÉDIO":
                    custoEnsinoMedio += rendaTotal;
                    break;
                case "GRADUAÇÃO":
                    custoGraduacao += rendaTotal;
                    break;
            }
        }

        System.out.println("Custos da Empresa:");
        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("Custo Ensino Básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo Ensino Médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo Graduação: R$ " + custoGraduacao);
        System.out.println();

        System.out.println("Informações dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println();
        }
    }
}
