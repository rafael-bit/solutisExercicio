package org.devtrail.polimorfismoZoologico.dominio;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void colocarAnimalNaJaula(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice de jaula inválido.");
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                animal.correr();
            } else {
                System.out.println("Jaula vazia.");
            }
        }
    }
}