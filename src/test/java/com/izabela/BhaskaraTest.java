package com.izabela;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BhaskaraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test //Notação de teste JUnit
    void calculaBhaskara() {
        double a = 1;
        double b = -10;
        double c = 25;
        double esperado = 5;
        double obtido = com.izabela.Bhaskara.calculaBhaskara(1, -10,25);
        assertEquals(esperado, obtido);
    }
}