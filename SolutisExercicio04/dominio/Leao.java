package projects.idea.ex4.dominio;

public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leao", idade, habitat, altura, peso, 4);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 7);
    }

    @Override
    public void moverse() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 3);
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 16);
    }
}