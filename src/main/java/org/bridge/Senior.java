package org.bridge;

public class Senior extends Senioridade {

    public Senior(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.especializacao.getPercentualSalario());
    }
}
