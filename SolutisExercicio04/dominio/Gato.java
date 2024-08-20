package projects.idea.ex4.dominio;

public class Gato extends AnimalTerrestreAB {
    public Gato(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Gato", idade, habitat, altura, peso, 4);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 0.5);
    }

    @Override
    public void moverse() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 1);
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 12);
    }
}
