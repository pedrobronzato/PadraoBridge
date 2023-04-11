package org.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuniorTest {
    @Test
    void deveRetornarSalarioJuniorReact() {
        Especializacao especializacao = new React();
        Junior junior = new Junior(2000.0f);
        junior.setEspecializacao(especializacao);
        assertEquals(2200.0f, junior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioJuniorSql() {
        Especializacao especializacao = new Sql();
        Junior junior = new Junior(2000.0f);
        junior.setEspecializacao(especializacao);
        assertEquals(2400.0f, junior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioJuniorJava() {
        Especializacao especializacao = new Java();
        Junior junior = new Junior(2000.0f);
        junior.setEspecializacao(especializacao);
        assertEquals(2600.0f, junior.calcularSalario(), 0.01f);
    }
}