package projects.idea.SolutisExercicio04.dominio;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
    }

    @Override
    public void comer() {
        setQuantidadeComidaIngerida(getQuantidadeComidaIngerida() + 0.2);
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        setHorasDormidas(getHorasDormidas() + 8);
    }

    @Override
    public void nadar() {
        setCaminhoPercorrido(getCaminhoPercorrido() + 5);
    }
}