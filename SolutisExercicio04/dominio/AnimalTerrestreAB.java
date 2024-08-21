package projects.idea.SolutisExercicio04.dominio;

import projects.idea.SolutisExercicio04.dominio.AnimalAB;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }
}