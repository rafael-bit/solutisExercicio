package projects.idea.SolutisExercicio04.dominio;

import projects.idea.SolutisExercicio04.dominio.AnimalAB;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public abstract void nadar();
}