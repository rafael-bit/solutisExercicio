package org.devtrail.polimorfismoZoologico.teste;

import org.devtrail.polimorfismoZoologico.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Nina", 3);

        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        Animal.emitirSomDosAnimais(animais);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        zoologico.colocarAnimalNaJaula(0, cachorro);
        zoologico.colocarAnimalNaJaula(1, cavalo);
        zoologico.colocarAnimalNaJaula(2, preguica);
    }
}
