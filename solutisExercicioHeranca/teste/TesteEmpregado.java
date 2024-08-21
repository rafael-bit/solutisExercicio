package projects.idea.solutisExercicioHeranca.teste;

import projects.idea.solutisExercicioHeranca.dominio.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Aquila", "Rua do Áquila", "77999795710", 101, 3000.0, 10.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
