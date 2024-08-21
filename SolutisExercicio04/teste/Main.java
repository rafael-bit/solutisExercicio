package projects.idea.SolutisExercicio04.teste;

import projects.idea.SolutisExercicio04.dominio.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Casa", 0.8, 10);
        Gato gato = new Gato("Mia", 3, "Apartamento", 0.4, 5);
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 3.0, 5000);
        Leao leao = new Leao("Simba", 7, "Savana", 1.2, 200);

        Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0.2, 0.5);
        Pombo pombo = new Pombo("Pombo", 1, "Cidade", 0.3, 0.2, 0.5);

        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();

        gato.comer();
        gato.moverse();
        gato.dormir();

        elefante.comer();
        elefante.moverse();
        elefante.dormir();

        leao.comer();
        leao.moverse();
        leao.dormir();

        peixe.comer();
        peixe.moverse();
        peixe.dormir();

        pombo.comer();
        pombo.moverse();
        pombo.dormir();

        System.out.println("Cachorro: ");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Quantidade de comida ingerida: " + cachorro.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + cachorro.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + cachorro.getHorasDormidas());

        System.out.println("Gato: ");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Quantidade de comida ingerida: " + gato.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + gato.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + gato.getHorasDormidas());

        System.out.println("Elefante: ");
        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Quantidade de comida ingerida: " + elefante.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + elefante.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + elefante.getHorasDormidas());

        System.out.println("Leao: ");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Quantidade de comida ingerida: " + leao.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + leao.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + leao.getHorasDormidas());

        System.out.println("Peixe: ");
        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Quantidade de comida ingerida: " + peixe.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + peixe.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + peixe.getHorasDormidas());

        System.out.println("Pombo: ");
        System.out.println("Nome: " + pombo.getNome());
        System.out.println("Quantidade de comida ingerida: " + pombo.getQuantidadeComidaIngerida());
        System.out.println("Caminho percorrido: " + pombo.getCaminhoPercorrido());
        System.out.println("Horas dormidas: " + pombo.getHorasDormidas());
    }
}