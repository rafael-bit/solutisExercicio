package projects.idea.solutisExercicioHeranca.teste;

import projects.idea.solutisExercicioHeranca.dominio.Fornecedor;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Cláudio", "Rua do Cláudio", "77999025110", 5000.0, 1500.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor do Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
