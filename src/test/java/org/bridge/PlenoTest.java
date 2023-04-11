package org.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlenoTest {
    @Test
    void deveRetornarSalarioPlenoReact() {
        Especializacao especializacao = new React();
        Pleno pleno = new Pleno(3000.0f);
        pleno.setEspecializacao(especializacao);
        assertEquals(3300.0f, pleno.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPlenoSql() {
        Especializacao especializacao = new Sql();
        Pleno pleno = new Pleno(3000.0f);
        pleno.setEspecializacao(especializacao);
        assertEquals(3600.0f, pleno.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPlenoJava() {
        Especializacao especializacao = new Java();
        Pleno pleno = new Pleno(3000.0f);
        pleno.setEspecializacao(especializacao);
        assertEquals(3900.0f, pleno.calcularSalario(), 0.01f);
    }
}