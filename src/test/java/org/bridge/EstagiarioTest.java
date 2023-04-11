package org.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {
    @Test
    void deveRetornarSalarioEstagiarioReact() {
        Especializacao especializacao = new React();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setEspecializacao(especializacao);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEstagiarioSql() {
        Especializacao especializacao = new Sql();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setEspecializacao(especializacao);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEstagiarioJava() {
        Especializacao especializacao = new Java();
        Estagiario estagiario = new Estagiario(1000.0f);
        estagiario.setEspecializacao(especializacao);
        assertEquals(1000.0f, estagiario.calcularSalario(), 0.01f);
    }

}