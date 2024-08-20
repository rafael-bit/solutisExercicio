package projects.idea.ex4.dominio;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;
    private double quantidadeComidaIngerida;
    private double caminhoPercorrido;
    private int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadeComidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeComidaIngerida() {
        return quantidadeComidaIngerida;
    }

    public void setQuantidadeComidaIngerida(double quantidadeComidaIngerida) {
        this.quantidadeComidaIngerida = quantidadeComidaIngerida;
    }

    public double getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(double caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();
}
