package projects.idea.solutisExercicioHeranca.teste;

import projects.idea.solutisExercicioHeranca.dominio.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Rafael Áquila", "Rua do Rafael Áquila", "77999660068", 103, 3555.0, 12.0, 10000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido: " + operario.calcularSalario());
    }
}