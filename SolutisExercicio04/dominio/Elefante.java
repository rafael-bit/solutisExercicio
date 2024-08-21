package projects.idea.SolutisExercicio04.dominio;

public class Elefante extends AnimalTerrestreAB {
    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, altura, peso, 4);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 50);
    }

    @Override
    public void moverse() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 1);
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 4);
    }
}