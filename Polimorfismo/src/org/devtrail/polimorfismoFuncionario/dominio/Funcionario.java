package org.devtrail.polimorfismoFuncionario.dominio;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double rendaBasica;
    private String escolaridade;
    private String escolaBasica;
    private String escolaMedia;
    private String universidade;
    private String cargo;
    private double comissao;

    public Funcionario(String nome, String codigoFuncional, String escolaridade, String escolaBasica, String escolaMedia, String universidade, String cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000.00;
        this.escolaridade = escolaridade;
        this.escolaBasica = escolaBasica;
        this.escolaMedia = escolaMedia;
        this.universidade = universidade;
        this.cargo = cargo;
        this.comissao = Comissao.obterComissao(cargo);
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public String getUniversidade() {
        return universidade;
    }

    public String getCargo() {
        return cargo;
    }

    public double getComissao() {
        return comissao;
    }

    public double calcularRendaTotal() {
        double rendaTotal = rendaBasica;
        switch (escolaridade.toUpperCase()) {
            case "ENSINO BÁSICO":
                rendaTotal += rendaBasica * 0.10;
                break;
            case "ENSINO MÉDIO":
                rendaTotal += rendaBasica * 0.10;
                rendaTotal += rendaTotal * 0.50;
                break;
            case "GRADUAÇÃO":
                rendaTotal += rendaBasica * 0.10;
                rendaTotal += rendaTotal * 0.50;
                rendaTotal += rendaTotal * 1.00;
                break;
            default:
                break;
        }
        return rendaTotal + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCódigo Funcional: " + codigoFuncional +
                "\nEscolaridade: " + escolaridade +
                "\nEscola Básica: " + escolaBasica +
                "\nEscola Média: " + escolaMedia +
                "\nUniversidade: " + universidade +
                "\nCargo: " + cargo +
                "\nComissão: R$ " + comissao +
                "\nRenda Total: R$ " + calcularRendaTotal();
    }
}