package org.bridge;

public class Estagiario extends Senioridade {

    public Estagiario(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
