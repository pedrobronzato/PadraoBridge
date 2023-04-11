package org.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeniorTest {
    @Test
    void deveRetornarSalarioSeniorReact() {
        Especializacao especializacao = new React();
        Senior senior = new Senior(4000.0f);
        senior.setEspecializacao(especializacao);
        assertEquals(4400.0f, senior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSeniorSql() {
        Especializacao especializacao = new Sql();
        Senior senior = new Senior(4000.0f);
        senior.setEspecializacao(especializacao);
        assertEquals(4800.0f, senior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSeniorJava() {
        Especializacao especializacao = new Java();
        Senior senior = new Senior(4000.0f);
        senior.setEspecializacao(especializacao);
        assertEquals(5200.0f, senior.calcularSalario(), 0.01f);
    }

}