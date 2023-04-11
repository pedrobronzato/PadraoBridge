package org.bridge;

public class Junior extends Senioridade{

    public Junior(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.getPercentualSalario());
    }
}
