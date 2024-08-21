package projects.idea.SolutisExercicio04.dominio;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, altura, peso, 4);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 1.5);
    }

    @Override
    public void moverse() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 2);
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 8);
    }
}
