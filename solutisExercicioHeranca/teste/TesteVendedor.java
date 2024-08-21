package projects.idea.solutisExercicioHeranca.teste;

import projects.idea.solutisExercicioHeranca.dominio.Vendedor;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Claudiomiro", "Rua do Claudiomiro", "77999025110", 104, 2800.0, 10.0, 20000.0, 3.0);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}

