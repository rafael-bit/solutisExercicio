package projects.idea.SolutisExercicio04.dominio;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAssa) {
        super(nome, "Pombo", idade, habitat, altura, peso, 2, envergaduraAssa);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 0.1);
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 10);
    }

    @Override
    public void voar() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 10);
    }
}