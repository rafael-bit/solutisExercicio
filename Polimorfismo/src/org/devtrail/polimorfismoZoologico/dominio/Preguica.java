package org.devtrail.polimorfismoZoologico.dominio;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está emitindo um som.");
    }

    @Override
    public void correr() {
        System.out.println("A preguiça não corre.");
    }

    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em uma árvore.");
    }
}
