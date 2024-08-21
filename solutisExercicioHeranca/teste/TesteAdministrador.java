package projects.idea.solutisExercicioHeranca.teste;

import projects.idea.solutisExercicioHeranca.dominio.Administrador;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Rafael", "Rua do Rafael", "77999660068", 102, 4000.0, 15.0, 500.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}
