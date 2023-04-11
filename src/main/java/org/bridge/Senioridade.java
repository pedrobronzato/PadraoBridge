 package org.bridge;

public abstract class Senioridade {

    protected Especializacao especializacao;

    protected float salarioBase;

    public Senioridade(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
