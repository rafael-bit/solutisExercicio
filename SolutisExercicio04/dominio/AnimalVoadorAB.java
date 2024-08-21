package projects.idea.SolutisExercicio04.dominio;

import projects.idea.SolutisExercicio04.dominio.AnimalAB;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public abstract void voar();
}
