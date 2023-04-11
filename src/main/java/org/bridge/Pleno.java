package org.bridge;

public class Pleno extends Senioridade {
    public Pleno(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.getPercentualSalario());
    }
}
